package com.h5190016.zahit_can_karaca.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import com.h5190016.zahit_can_karaca.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startThreeSeconds();

    }

    private void startThreeSeconds(){
        CountDownTimer countDownTimer =new CountDownTimer(3000,1000) {
            @Override
            public void onTick(long l) {
            }
            @Override
            public void onFinish() {
                Intent getNameActivityIntent=new Intent(getApplicationContext(),GetNameActivity.class);
                startActivity(getNameActivityIntent);
                finish();
            }
        };
        countDownTimer.start();
    }
}

