package com.example.compaynion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminHomepage extends AppCompatActivity {
    private Button dueB;
    private Button adB;
    private Button sB;
    private Button aBackLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_homepage);

        dueB=(Button) findViewById(R.id.dueButton);
        adB=(Button) findViewById(R.id.activateButton);
        sB=(Button) findViewById(R.id.aScannerButton);
        aBackLogin=(Button) findViewById(R.id.aHomePageBackButton);

        //intent to open dues page on click of button
        dueB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(AdminHomepage.this,AdminDues.class);
                startActivity(i1);
            }
        });

        //intent to open Activate/Deactivate page on click of button
        adB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(AdminHomepage.this,AdminActivateDeactivate.class);
                startActivity(i2);
            }
        });


        //intent to open scanner on click of button
        sB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(AdminHomepage.this,Scanner.class);
                startActivity(i3);
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