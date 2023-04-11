package com.example.compaynion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentWallet extends AppCompatActivity {
    private Button rHist;
    private Button tHist;
    private Button recharge;
    private Button sBack1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_wallet);

        rHist = (Button) findViewById(R.id.RechargeHistoryButton);
        tHist = (Button) findViewById(R.id.TransactionHistoryButton);
        sBack1 = (Button) findViewById(R.id.backHome);
        recharge=(Button) findViewById(R.id.rechargeButton);


        //intent to open go back to student homepage
        sBack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(StudentWallet.this,StudentHomepage.class);
                startActivity(i1);
            }
        });

        //intent to open recharge history on click of button
        rHist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(StudentWallet.this,StudentRechargeHistory.class);
                startActivity(i2);
            }
        });


        //intent to open transaction history on click of button
        tHist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(StudentWallet.this,StudentTransactionHistory.class);
                startActivity(i3);
            }
        });

        //intent to open recharge on click of button
        recharge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(StudentWallet.this,StudentRecharge.class);
                startActivity(i4);
            }
        });






    }
}