package com.example.compaynion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminHomepage extends AppCompatActivity {
    private Button manage;
    private Button aBackLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_homepage) ;

        manage=(Button) findViewById(R.id.aManageButton);
        aBackLogin=(Button) findViewById(R.id.aHomePageBackButton);

        //intent to open manage page on click of button
        manage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(AdminHomepage.this,AdminManage.class);
                startActivity(i1);
            }
        });



        //intent to go back to login
        aBackLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(AdminHomepage.this,AdminLogin.class);
                startActivity(i4);
            }
        });



    }
}