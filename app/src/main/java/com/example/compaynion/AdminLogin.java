package com.example.compaynion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminLogin extends AppCompatActivity {

    private Button logb4;
    private Button startb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

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
                Intent i2 = new Intent(AdminLogin.this,AdminHomepage.class);
                startActivity(i2);
            }
        });




    }
}