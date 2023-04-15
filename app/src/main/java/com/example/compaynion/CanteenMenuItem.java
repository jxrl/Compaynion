package com.example.compaynion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CanteenMenuItem extends AppCompatActivity {

    private Button cBack5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canteen_menu_item);

        cBack5 = (Button) findViewById(R.id.backCanteenHp);

        //intent to go back to homepage
        cBack5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(CanteenMenuItem.this,CanteenHomepage.class);
                startActivity(i1);
            }
        });

    }
}