package com.example.compaynion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class admin_student_wallet extends AppCompatActivity {
    private Button backadmin9 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_student_wallet2);
        backadmin9=(Button) findViewById(R.id.back_student_wallet);
        //intent to open Admin Manage page from student wallet page on click of button
        backadmin9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i18 = new Intent(admin_student_wallet.this,Admin_student.class);
                startActivity(i18);
            }
        });


    }
}