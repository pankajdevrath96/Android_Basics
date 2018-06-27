package com.example.macbook.toastlifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.Gravity;

import static android.view.Gravity.CENTER_HORIZONTAL;
import static android.view.Gravity.CENTER_VERTICAL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View x) {
                Toast t= Toast.makeText(getApplicationContext(), "This is On Click event", Toast.LENGTH_SHORT);
                t.setGravity(Gravity.BOTTOM ,0,0);
                t.show();
            }
        });
    }
    protected void onStart() {
        super.onStart();
        Toast t =Toast.makeText(this,"This is On Start event ",Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();

    }
    protected void onResume() {
        super.onResume();
        Toast t=Toast.makeText(this,"This is On Resume event",Toast.LENGTH_SHORT);
        t.setGravity(Gravity.AXIS_Y_SHIFT,0,0);
        t.show();
    }
    protected void onPause() {
        super.onPause();
        Toast t=Toast.makeText(this,"This is On Pause event",Toast.LENGTH_SHORT);
        t.setGravity(CENTER_HORIZONTAL,0,0);
        t.show();
    }
    protected void onStop() {
        super.onStop();
        Toast t=Toast.makeText(this,"This is On Stop event",Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();
    }
    protected void onDestroy() {
        super.onDestroy();
        Toast t=Toast.makeText(this,"This is On Destroy event",Toast.LENGTH_SHORT);
        t.setGravity(CENTER_VERTICAL,0,0);
        t.show();
    }
    protected void onRestart() {
        super.onRestart();
        Toast t=Toast.makeText(this,"This is On Restart event",Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();
    }
}
