package com.example.compaynion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class admin_canteen_billing_date extends AppCompatActivity {

    private Button Canteenback3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_canteen_billing_date);
        Canteenback3=(Button) findViewById(R.id.back_admin_canteen_billingdate);

        //intent to go back to Canteen Billing page from Canteen_Biiling_Date_page  on click of button
        Canteenback3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i15 = new Intent(admin_canteen_billing_date.this,admin_canteen_billing.class);
                startActivity(i15);
            }
        });
    }
}