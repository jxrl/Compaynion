package com.example.compaynion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentTransactionHistory extends AppCompatActivity {

    private Button sBack3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_transaction_history);

        sBack3 = (Button) findViewById(R.id.backWallet);

        //intent to open go back to student wallet
        sBack3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(StudentTransactionHistory.this,StudentWallet.class);
                startActivity(i1);
            }
        });
    }
}