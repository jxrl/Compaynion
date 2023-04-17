package com.example.compaynion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AdminActivateDeactivate extends AppCompatActivity {
    private Button adminback2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_activate_deactivate);
        adminback2=(Button) findViewById(R.id.backadminhomepageactivate);

        //intent to open Admin Manage page from admin_activate/deactivate page on click of button
        adminback2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i19 = new Intent(AdminActivateDeactivate.this,AdminManage.class);
                startActivity(i19);
            }
        });
    }
}