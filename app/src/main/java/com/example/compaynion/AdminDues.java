package com.example.compaynion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AdminDues extends AppCompatActivity {
    private Button backadmin7 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dues);
        backadmin7=(Button) findViewById(R.id.backadminhomepage);
        //intent to open Admin Manage page from student dues page on click of button
        backadmin7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i18 = new Intent(AdminDues.this,Admin_student.class);
                startActivity(i18);
            }
        });
    }
}