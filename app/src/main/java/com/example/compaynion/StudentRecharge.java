package com.example.compaynion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentRecharge extends AppCompatActivity {

    private Button sBack4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_recharge);

        sBack4 = (Button) findViewById(R.id.backWallet3);

        //intent to open go back to student wallet
        sBack4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(StudentRecharge.this,StudentWallet.class);
                startActivity(i1);
            }
        });
    }
}