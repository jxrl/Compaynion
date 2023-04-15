package com.example.compaynion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Admin_recharge extends AppCompatActivity {

    private Button Rechargeback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_recharge);

        Rechargeback=(Button) findViewById(R.id.back_admin_studentrecharge);
        //intent to go back to Canteen Billing page from Canteen_Biiling_Date_page  on click of button
        Rechargeback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i18 = new Intent(Admin_recharge.this,Admin_student.class);
                startActivity(i18);
            }
        });
    }
}