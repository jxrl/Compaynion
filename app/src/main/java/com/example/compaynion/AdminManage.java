package com.example.compaynion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminManage extends AppCompatActivity {
    private Button student1;
    private Button canteen1;
    private Button backadmin6 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_manage);
        student1=(Button) findViewById(R.id.aStudentManage);
        canteen1=(Button) findViewById(R.id.aCanteenManage);


        //intent to open student page from admin manage on click of button
        student1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i16 = new Intent(AdminManage.this, Admin_student.class);
                startActivity(i16);
            }
        });

        //intent to open canteen page from admin manage on click of button
        canteen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i17 = new Intent(AdminManage.this, admin_canteen.class);
                startActivity(i17);
            }
        });
        backadmin6=(Button) findViewById(R.id.bAdminHomePage);
        //intent to open Canteen Manage page from admin_Canteen_billing_date page on click of button
        backadmin6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i18 = new Intent(AdminManage.this,AdminHomepage.class);
                startActivity(i18);
            }
        });

    }
}