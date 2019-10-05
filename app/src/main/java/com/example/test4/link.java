package com.example.test4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.telephony.SmsManager;

import java.util.Random;

public class link extends AppCompatActivity {

    EditText et1;
    Button bt3;
    TextView t1;

    int otp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link);

        et1 = findViewById(R.id.et1);
        bt3 = findViewById(R.id.bt3);

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num =et1.getText().toString();
                otp = random();
                t1.setText("The Data : " + num + " and " + otp);
                String msg = "Your OTP : " + otp;
                try
                {
                    SmsManager smsManager=SmsManager.getDefault();
                    smsManager.sendTextMessage(num,null,msg,null,null);

                }
                catch (Exception ex)
                {
                    showmsg(ex.getMessage());
                    et1.setText(ex.getMessage());
                }
            }
        });

    }
    public int random()
    {
        int v;
        Random r=new Random();
        v=r.nextInt(9999);
        return  v;
    }
    public void showmsg(String msg)

    {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
