package com.example.compaynion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Admin_student extends AppCompatActivity {
    private Button ACDC1;
    private Button Dues1;
    private Button Recharge1;
    private Button Wallet1;
    private Button backadmin10 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_student);
        ACDC1=(Button) findViewById(R.id.activateButton);
        Dues1=(Button) findViewById(R.id.admin_studentdues);
        Recharge1=(Button) findViewById(R.id.admin_studentrecharge);
        Wallet1=(Button) findViewById(R.id.admin_studentwallet);
        backadmin10=(Button) findViewById(R.id.backadmin_manage);
        //intent to open Activate/Deactivate page from Admin_student page on click of button
        ACDC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i9 = new Intent(Admin_student.this,AdminActivateDeactivate.class);
                startActivity(i9);
            }
        });

        //intent to open Dues page from Admin_student page on click of button
        Dues1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i10 = new Intent(Admin_student.this,AdminDues.class);
                startActivity(i10);
            }
        });

        //intent to open Recharge page from Admin_student page on click of button
        Recharge1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i11 = new Intent(Admin_student.this,Admin_recharge.class);
                startActivity(i11);
            }
        });

        //intent to open Activate/Deactivate page from Admin_student page on click of button
        Wallet1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i12 = new Intent(Admin_student.this,admin_student_wallet.class);
                startActivity(i12);
            }
        });


        //intent to open Admin Manage page from student wallet page on click of button
        backadmin10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i18 = new Intent(Admin_student.this,AdminManage.class);
                startActivity(i18);
            }
        });
    }
}