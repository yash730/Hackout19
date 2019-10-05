package com.example.test4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    TextView t1;
    Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        bt1 = findViewById(R.id.bt1);
        t1 = findViewById(R.id.t1);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void bt1(View view) {
        Intent i = new Intent(getApplicationContext(),signup.class);
        startActivity(i);
    }

    public void execute(View view) {

    }
}
