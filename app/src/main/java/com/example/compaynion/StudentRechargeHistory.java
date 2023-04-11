package com.example.compaynion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentRechargeHistory extends AppCompatActivity {

    private Button sBack2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_recharge_history);

        sBack2 = (Button) findViewById(R.id.backWallet2);

        //intent to open go back to student wallet
        sBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(StudentRechargeHistory.this,StudentWallet.class);
                startActivity(i1);
            }
        });




    }
}