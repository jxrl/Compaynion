package com.example.compaynion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdminLogin extends AppCompatActivity {

    private EditText username, password;
    private Button logb4;
    private Button startb4;
    private DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        username= (EditText) findViewById(R.id.adminUsername);
        password= (EditText) findViewById(R.id.adminPassword);
        logb4 = (Button) findViewById(R.id.adminloginButton);
        startb4 = (Button) findViewById(R.id.adminMainPage);
        db= new DBHelper(this);

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

                String user = username.getText().toString();
                String pass = password.getText().toString();

                if(user.equals("")||pass.equals(""))
                    Toast.makeText(AdminLogin.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkuserpass=db.checkusernamepassword(user,pass);
                    if(checkuserpass==true)
                    {
                        Toast.makeText(AdminLogin.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(AdminLogin.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                    }
                }

                Intent i2 = new Intent(AdminLogin.this,AdminHomepage.class);
                startActivity(i2);
            }
        });




    }
}