package com.example.compaynion;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class admin_canteen extends AppCompatActivity {
    private Button ACDC2;
    private Button Billing1;
    private Button adminback1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_canteen);

        ACDC2=(Button) findViewById(R.id.activateButton2);
        Billing1=(Button) findViewById(R.id.canteen_billing);
        adminback1=(Button) findViewById(R.id.back_admin_homepage);


        //intent to open Activate/Deactivate page from admin_Canteen page on click of button
        ACDC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i13 = new Intent(admin_canteen.this,AdminActivateDeactivate.class);
                startActivity(i13);
            }
        });

        //intent to open Billing page from admin_Canteen manage on click of button
        Billing1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i14 = new Intent(admin_canteen.this,admin_canteen_billing.class);
                startActivity(i14);
            }
        });

        //intent to open Adminhomepage from admin_Canteen manage on click of button
        adminback1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i15 = new Intent(admin_canteen.this,AdminManage.class);
                startActivity(i15);
            }
        });
    }
}