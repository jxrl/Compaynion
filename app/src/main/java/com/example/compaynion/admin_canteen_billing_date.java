package com.example.compaynion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class admin_canteen_billing_date extends AppCompatActivity {
    private Button backadmin4 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_canteen_billing_date);
        backadmin4=(Button) findViewById(R.id.back_admin_canteen_billingdate);
        //intent to open Canteen Manage page from admin_Canteen_billing_date page on click of button
        backadmin4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i18 = new Intent(admin_canteen_billing_date.this,admin_canteen_billing.class);
                startActivity(i18);
            }
        });
    }
}