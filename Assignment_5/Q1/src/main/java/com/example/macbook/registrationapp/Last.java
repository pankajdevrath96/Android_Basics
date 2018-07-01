package com.example.macbook.registrationapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class Last extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.last_activity);
        Bundle extras = getIntent().getExtras();
        String name = extras.getString("UserName");
        Toast.makeText(this,"Welcome "+name,Toast.LENGTH_LONG).show();



    }


}
