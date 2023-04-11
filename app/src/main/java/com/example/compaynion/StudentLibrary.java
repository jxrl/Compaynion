package com.example.compaynion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentLibrary extends AppCompatActivity {

    private Button sBack5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_library);

        sBack5=(Button) findViewById(R.id.backHome2) ;

        //intent to open go back to student homepage
        sBack5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(StudentLibrary.this,StudentHomepage.class);
                startActivity(i1);
            }
        });
    }
}