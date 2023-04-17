package com.example.compaynion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Admin_recharge extends AppCompatActivity {
    private Button backadmin8 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_recharge);
        backadmin8=(Button) findViewById(R.id.back_student_recharge);
        //intent to open Admin Manage page from student recharge page on click of button
        backadmin8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i18 = new Intent(Admin_recharge.this,Admin_student.class);
                startActivity(i18);
            }
        });
    }
}