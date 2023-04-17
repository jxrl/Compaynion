package com.example.compaynion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CanteenLogin extends AppCompatActivity {
    private EditText username, password;
    private Button logb2;
    private Button startb2;
    private DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canteen_login);

        username= (EditText) findViewById(R.id.canteenUsername);
        password= (EditText) findViewById(R.id.canteenPassword);
        logb2 = (Button) findViewById(R.id.canteenloginButton);
        startb2 = (Button) findViewById(R.id.CanteenMainPage);
        db= new DBHelper(this);

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

                String user = username.getText().toString();
                String pass = password.getText().toString();

                if(user.equals("")||pass.equals(""))
                    Toast.makeText(CanteenLogin.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkuserpass=db.checkusernamepassword(user,pass);
                    if(checkuserpass==true)
                    {
                        Toast.makeText(CanteenLogin.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(CanteenLogin.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                    }
                }

                Intent i2 = new Intent(CanteenLogin.this,CanteenHomepage.class);
                startActivity(i2);
            }
        });




    }
}