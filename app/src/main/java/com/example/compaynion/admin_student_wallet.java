package com.example.compaynion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class admin_student_wallet extends AppCompatActivity {

    private Button WalletBack1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_student_wallet);

        WalletBack1=(Button) findViewById(R.id.back_student_wallet);
        //intent to go back to Student Manage Page from Student Wallet page  on click of button
        WalletBack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i18 = new Intent(admin_student_wallet.this,Admin_student.class);
                startActivity(i18);
            }
        });
    }
}