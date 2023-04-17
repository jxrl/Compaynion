package com.example.compaynion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class CanteenLogin extends AppCompatActivity {
    String stn;
    private EditText Cusername, Cpassword;
    private Button logb2;
    private Button startb2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canteen_login);

        Cusername= (EditText) findViewById(R.id.canteenUsername);
        Cpassword= (EditText) findViewById(R.id.canteenPassword);
        logb2 = (Button) findViewById(R.id.canteenloginButton);
        startb2 = (Button) findViewById(R.id.CanteenMainPage);


        //intent to go back to start page
        startb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(CanteenLogin.this,MainActivity.class);
                startActivity(i1);
            }
        });


        //intent to open canteen homepage on submit
        logb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = Cusername.getText().toString();
                String password = Cpassword.getText().toString();

                if(isValid(username,password)){
                    signIn(username,password);
                }

            }
        });


    }
    private void showMessage(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }

    private boolean isValid(String username, String password) {
        if(username.isEmpty()){
            showMessage("username field is empty");
            Cusername.setText(null);
            return false;
        }
        if(password.isEmpty()){
            showMessage("password field is empty");
            Cpassword.setText(null);
            return false;
        }
        return  true;
    }

    private void signIn(final String username, final String password) {
        StringRequest stringRequest= new StringRequest(Request.Method.POST, Endspoint.cLogin_url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                stn = Cusername.getText().toString();
                if (response.equals("success")) {
                    Intent i2 = new Intent(CanteenLogin.this,CanteenHomepage.class);
                    i2.putExtra("username", stn);
                    startActivity(i2);
                    Cusername.setText(null);
                    Cpassword.setText(null);

                }
                if (response.equals("Error")) {
                    showMessage("INVALID username or password");
                    Intent i3 = new Intent(CanteenLogin.this, CanteenLogin.class);
                    i3.putExtra("username", stn);
                    startActivity(i3);
                    Cusername.setText(null);
                    Cpassword.setText(null);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                showMessage("please check your internet connection");
                Log.d("VOLLEY",error.getMessage());
                Intent i4 = new Intent(CanteenLogin.this, CanteenLogin.class);
                startActivity(i4);

            }
        }) {
            protected Map<String , String> getParams() throws AuthFailureError {
                Map<String , String> params = new HashMap<>();
                params.put("username",username);
                params.put("password",password);
                return params;
            }
        };
        VolleySingleton.getInstance(this).addToRequestQueue(stringRequest);
    }
}
