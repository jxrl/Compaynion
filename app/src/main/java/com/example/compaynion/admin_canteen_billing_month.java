package com.example.compaynion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class admin_canteen_billing_month extends AppCompatActivity {
    private Button backadmin5 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_canteen_billing_month);
        backadmin5=(Button) findViewById(R.id.back_admin_canteen_billingmonth);
        //intent to open Canteen Manage page from admin_Canteen_billing_month page on click of button
        backadmin5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i18 = new Intent(admin_canteen_billing_month.this,admin_canteen_billing.class);
                startActivity(i18);
            }
        });
    }
}