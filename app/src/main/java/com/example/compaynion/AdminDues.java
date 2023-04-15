package com.example.compaynion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AdminDues extends AppCompatActivity {

    private Button DuesBack1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dues);
        DuesBack1=(Button) findViewById(R.id.back_Student_dues);
        //intent to go back to Student Manage Page from Student Dues page  on click of button
        DuesBack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i18 = new Intent(AdminDues.this,Admin_student.class);
                startActivity(i18);
            }
        });
    }
}