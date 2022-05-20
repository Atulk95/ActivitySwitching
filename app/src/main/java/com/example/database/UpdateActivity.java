package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class UpdateActivity extends AppCompatActivity {

    TextView firstname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        Intent i=getIntent();
        String msg= i.getStringExtra("EXTRA");
        firstname=findViewById(R.id.textView);
        firstname.setText(msg);


    }
}