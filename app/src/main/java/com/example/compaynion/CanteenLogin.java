package com.example.compaynion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CanteenLogin extends AppCompatActivity {
    private Button logb2;
    private Button startb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canteen_login);

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
                Intent i2 = new Intent(CanteenLogin.this,CanteenHomepage.class);
                startActivity(i2);
            }
        });




    }
}