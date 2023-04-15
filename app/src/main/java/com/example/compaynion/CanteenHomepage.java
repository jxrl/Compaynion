package com.example.compaynion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CanteenHomepage extends AppCompatActivity {

    private Button cViewT;
    private Button scan;
    private Button cManage;
    private Button cItem;
    private Button cBackLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canteen_homepage);

        cViewT=(Button) findViewById(R.id.cTransactions);
        scan=(Button) findViewById(R.id.cScannerButton);
        cBackLogin=(Button) findViewById(R.id.backCanteenLogin);
        cItem=(Button) findViewById(R.id.foodItemButton);
        cManage=(Button) findViewById(R.id.cManageButton);

        //intent to open canteen transactions on click of button
        cViewT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(CanteenHomepage.this,CanteenTransaction.class);
                startActivity(i2);
            }
        });


        //intent to open scanner
        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(CanteenHomepage.this,Scanner.class);
                startActivity(i3);
            }
        });


        //intent to go back to login
        cBackLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(CanteenHomepage.this,CanteenLogin.class);
                startActivity(i4);
            }
        });

        //intent to open manage page on click of button
        cManage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i25 = new Intent(CanteenHomepage.this, CanteenManage.class);
                startActivity(i25);
            }
        });


        //intent to open CRUD page for food item
        cItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6 = new Intent(CanteenHomepage.this,CanteenMenuItem.class);
                startActivity(i6);
            }
        });




    }
}