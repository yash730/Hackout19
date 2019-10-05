package com.example.test4;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.*;

import android.os.Bundle;

public class signup extends AppCompatActivity {

    Button bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        bt2 = findViewById(R.id.bt2);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
