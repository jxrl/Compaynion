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

public class AdminLogin extends AppCompatActivity {

    String stn;
    private EditText Ausername, Apassword;
    private Button logb4;
    private Button startb4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        Ausername= (EditText) findViewById(R.id.adminUsername);
        Apassword= (EditText) findViewById(R.id.adminPassword);
        logb4 = (Button) findViewById(R.id.adminloginButton);
        startb4 = (Button) findViewById(R.id.adminMainPage);


        //intent to go back to start page
        startb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(AdminLogin.this,MainActivity.class);
                startActivity(i1);
            }
        });


        //intent to open admin homepage on submit
        logb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = Ausername.getText().toString();
                String password = Apassword.getText().toString();

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
            Ausername.setText(null);
            return false;
        }
        if(password.isEmpty()){
            showMessage("password field is empty");
            Apassword.setText(null);
            return false;
        }
        return  true;
    }

    private void signIn(final String username, final String password) {
        StringRequest stringRequest= new StringRequest(Request.Method.POST, Endspoint.aLogin_url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                stn = Ausername.getText().toString();
                if (response.equals("success")) {
                    Intent i2 = new Intent(AdminLogin.this,AdminHomepage.class);
                    i2.putExtra("username", stn);
                    startActivity(i2);
                    Ausername.setText(null);
                    Apassword.setText(null);

                }
                if (response.equals("Error")) {
                    showMessage("INVALID username or password");
                    Intent i3 = new Intent(AdminLogin.this, AdminLogin.class);
                    i3.putExtra("username", stn);
                    startActivity(i3);
                    Ausername.setText(null);
                    Apassword.setText(null);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                showMessage("please check your internet connection");
                Log.d("VOLLEY",error.getMessage());
                Intent i4 = new Intent(AdminLogin.this, AdminLogin.class);
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


