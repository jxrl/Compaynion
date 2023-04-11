package com.example.compaynion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CanteenTransaction extends AppCompatActivity {

    private Button cBack1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canteen_transaction);

        cBack1 = (Button) findViewById(R.id.backCanteenHomepage);

        //intent to open go back to homepage
        cBack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(CanteenTransaction.this,CanteenHomepage.class);
                startActivity(i1);
            }
        });

    }
}