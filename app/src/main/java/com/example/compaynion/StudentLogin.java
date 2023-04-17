package com.example.compaynion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StudentLogin extends AppCompatActivity {
    private EditText username, password;
private Button logb1;
private Button startb1;
private DBHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        username= (EditText) findViewById(R.id.studentUsername);
        password= (EditText) findViewById(R.id.studentPassword);
        logb1 = (Button) findViewById(R.id.studentloginButton);
        startb1 = (Button) findViewById(R.id.studentMainPage);
        db= new DBHelper(this);
        //intent to go back to start page
        startb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(StudentLogin.this,MainActivity.class);
                startActivity(i1);
            }
        });


        //intent to open student homepage on submit
        logb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user = username.getText().toString();
                String pass = password.getText().toString();

                if(user.equals("")||pass.equals(""))
                    Toast.makeText(StudentLogin.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkuserpass=db.checkusernamepassword(user,pass);
                    if(checkuserpass==true)
                    {
                        Toast.makeText(StudentLogin.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(StudentLogin.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                    }
                }

                Intent i2 = new Intent(StudentLogin.this,StudentHomepage.class);
                startActivity(i2);
            }
        });







    }
}