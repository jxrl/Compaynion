package com.example.compaynion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class admin_canteen_billing extends AppCompatActivity {

    private Button Generate1 ;
    private Button Generate2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_canteen_billing);
        Generate1=(Button) findViewById(R.id.bill_date_generate2);
        Generate2=(Button) findViewById(R.id.bill_month_generate);

        //intent to open Canteen Date Bill generation from admin_Canteen manage on click of button
        Generate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i16 = new Intent(admin_canteen_billing.this,admin_canteen_billing_date.class);
                startActivity(i16);
            }
        });

        //intent to open Canteen Month Bill generation from admin_Canteen manage on click of button
        Generate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i17 = new Intent(admin_canteen_billing.this,admin_canteen_billing_month.class);
                startActivity(i17);
            }
        });
    }
}