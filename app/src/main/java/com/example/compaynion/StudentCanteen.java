package com.example.compaynion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentCanteen extends AppCompatActivity {

    private Button sBack4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_canteen);

        sBack4=(Button) findViewById(R.id.CanteenbackHome3) ;

        //intent to open go back to student homepage
        sBack4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(StudentCanteen.this,StudentHomepage.class);
                startActivity(i1);
            }
        });
    }
}