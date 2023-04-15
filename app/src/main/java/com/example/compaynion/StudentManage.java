package com.example.compaynion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class StudentManage extends AppCompatActivity {

    private Button sBackHomepage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_manage);

        sBackHomepage = (Button) findViewById(R.id.back_student_manage);


        //intent to go back to homepage on click of button
        sBackHomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(StudentManage.this,StudentHomepage.class);
                startActivity(i1);
            }
        });

    }
}