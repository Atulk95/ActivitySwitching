package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText firstname, lastname;
    Button Add,Display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstname=findViewById(R.id.firstname);
        lastname=findViewById(R.id.lastname);
        Add=findViewById(R.id.Add);
        Display=findViewById(R.id.Display);
        Add.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                String first=firstname.getText().toString();
                String last=lastname.getText().toString();
                Toast.makeText(MainActivity.this,  first+" "+last, Toast.LENGTH_SHORT).show();
            }
        });

        Display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,DisplayActivity.class);
                startActivity(intent);
            }
        });
    }
}