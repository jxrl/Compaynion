package com.example.compaynion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button stdB1;
    private Button canB2;

    private Button admB4;
    private DBHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stdB1 = (Button) findViewById(R.id.stdButton);
        canB2 = (Button) findViewById(R.id.canButton);

        admB4 = (Button) findViewById(R.id.admButton);
        db= new DBHelper(this);
        //intent to open student login page on click of button
        stdB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(MainActivity.this,StudentLogin.class);
                startActivity(i1);
            }
        });


        //intent to open canteen login page on click of button
        canB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(MainActivity.this,CanteenLogin.class);
                startActivity(i2);
            }
        });



        //intent to open admin login page on click of button
        admB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(MainActivity.this,AdminLogin.class);
                startActivity(i4);
            }
        });



    }
}