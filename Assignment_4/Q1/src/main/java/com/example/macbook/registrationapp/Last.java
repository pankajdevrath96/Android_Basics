package com.example.macbook.registrationapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class Last extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.last_activity);
        Toast.makeText(this,"Sucessfully Logged In..!!!",Toast.LENGTH_LONG).show();


    }


}
