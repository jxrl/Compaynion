package com.example.compaynion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AdminActivateDeactivate extends AppCompatActivity {

    private Button ACDCb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_activate_deactivate);


        ACDCb=(Button) findViewById(R.id.backhomepageactivate);
        //intent to go back to Student Manage Page from Student Dues page  on click of button
        ACDCb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i20 = new Intent(AdminActivateDeactivate.this,AdminManage.class);
                startActivity(i20);
            }
        });
    }
}