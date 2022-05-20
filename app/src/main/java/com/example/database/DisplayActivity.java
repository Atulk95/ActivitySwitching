package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DisplayActivity extends AppCompatActivity {

    String EXTRA="com.example.database.name";
    ListView listView;
    String arr[]={
            "Atul Khandekr",
            "Vishal Patel",
            "Darshan Patel",
            "Varsha Kumavat",
            "Shubham Bhatt",

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        listView=findViewById(R.id.listView);
        ArrayAdapter ad=new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
        listView.setAdapter(ad);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent  update =new Intent(DisplayActivity.this,UpdateActivity.class);
                update.putExtra("EXTRA",arr[i]);
                startActivity(update);


            }
        });

    }
}