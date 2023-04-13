package com.example.compaynion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminManage extends AppCompatActivity {
    private Button student1;
    private Button canteen1;
    private Button library1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_manage);
        student1=(Button) findViewById(R.id.studentmanage);
        canteen1=(Button) findViewById(R.id.canteenmanage);
        library1=(Button) findViewById(R.id.librarymanage);

        //intent to open student page from admin manage on click of button
        student1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6 = new Intent(AdminManage.this, Admin_student.class);
                startActivity(i6);
            }
        });

        //intent to open canteen page from admin manage on click of button
        canteen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i7 = new Intent(AdminManage.this, admin_canteen.class);
                startActivity(i7);
            }
        });

        //intent to open library page from admin manage on click of button
        library1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i8 = new Intent(AdminManage.this,LibraryHomepage.class);
                startActivity(i8);
            }
        });
    }
}