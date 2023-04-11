package com.example.compaynion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentLogin extends AppCompatActivity {
private Button logb1;
private Button startb1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

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
                Intent i2 = new Intent(StudentLogin.this,StudentHomepage.class);
                startActivity(i2);
            }
        });







    }
}