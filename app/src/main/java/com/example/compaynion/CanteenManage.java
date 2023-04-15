package com.example.compaynion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CanteenManage extends AppCompatActivity {

    private Button cBack3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canteen_manage);

        cBack3 = (Button) findViewById(R.id.back_student_manage2);

        //intent to open go back to homepage
        cBack3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(CanteenManage.this,CanteenHomepage.class);
                startActivity(i1);
            }
        });
    }
}