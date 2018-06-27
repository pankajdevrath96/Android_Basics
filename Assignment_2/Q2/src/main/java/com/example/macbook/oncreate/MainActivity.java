package com.example.macbook.oncreate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.view.Gravity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Toast t=Toast.makeText(this,"This is On Create event",Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();
    }
}
