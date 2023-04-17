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

public class StudentLogin extends AppCompatActivity {
    String stn;
    private EditText Lusername, Lpassword;
private Button logb1;
private Button startb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        Lusername= (EditText) findViewById(R.id.studentUsername);
        Lpassword= (EditText) findViewById(R.id.studentPassword);
        logb1 = (Button) findViewById(R.id.studentloginButton);
        startb1 = (Button) findViewById(R.id.studentMainPage);

        //intent to go back to start page
        startb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(StudentLogin.this,MainActivity.class);
                startActivity(i1);
            }
        });


        //intent to open student homepage on submit
        logb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = Lusername.getText().toString();
                String password = Lpassword.getText().toString();

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
            Lusername.setText(null);
            return false;
        }
        if(password.isEmpty()){
            showMessage("password field is empty");
            Lpassword.setText(null);
            return false;
        }
        return  true;
    }

    private void signIn(final String username, final String password) {
        StringRequest stringRequest= new StringRequest(Request.Method.POST, Endspoint.sLogin_url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                stn = Lusername.getText().toString();
                if (response.equals("success")) {
                    Intent i2 = new Intent(StudentLogin.this, StudentHomepage.class);
                    i2.putExtra("username", stn);
                    startActivity(i2);
                    Lusername.setText(null);
                    Lpassword.setText(null);

                }
                if (response.equals("Error")) {
                    showMessage("INVALID username or password");
                    Intent i3 = new Intent(StudentLogin.this, StudentLogin.class);
                    i3.putExtra("username", stn);
                    startActivity(i3);
                    Lusername.setText(null);
                    Lpassword.setText(null);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                showMessage("please check your internet connection");
                Log.d("VOLLEY",error.getMessage());
                Intent i4 = new Intent(StudentLogin.this, StudentLogin.class);
                startActivity(i4);

            }
        }) {
            protected Map<String , String> getParams() throws AuthFailureError{
                Map<String , String> params = new HashMap<>();
                params.put("username",username);
                params.put("password",password);
                return params;
            }
        };
        VolleySingleton.getInstance(this).addToRequestQueue(stringRequest);
    }
}