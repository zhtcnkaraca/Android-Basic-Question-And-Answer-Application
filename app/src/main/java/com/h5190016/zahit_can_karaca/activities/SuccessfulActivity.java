package com.h5190016.zahit_can_karaca.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.h5190016.zahit_can_karaca.R;
import com.h5190016.zahit_can_karaca.utils.PrefUtil;


public class SuccessfulActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnSuccessfulExit,btnSuccessfulHomeScreen;
    TextView txtCounter,txtPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successful);

        init();

    }
    public void init(){
        btnSuccessfulExit = findViewById(R.id.btnSuccessfulExit);
        btnSuccessfulHomeScreen = findViewById(R.id.btnSuccessfulHomeScreen);
        txtCounter = findViewById(R.id.txtSuccessfulGetQuestionInfo);
        txtPoint = findViewById(R.id.txtSuccessfulGetPoint);
        String counter = PrefUtil.getCounter((getApplicationContext()));
        int lastCounter = Integer.parseInt(counter);
        txtPoint.setText(getResources().getString(R.string.app_point) + PrefUtil.getPoint((getApplicationContext())));
        txtCounter.setText(getResources().getString(R.string.app_questionInfo) + (lastCounter-1) + getResources().getString(R.string.app_questionInfo2));

        btnSuccessfulExit.setOnClickListener(this);
        btnSuccessfulHomeScreen.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSuccessfulHomeScreen:
                Intent choiceActivityIntent=new Intent(getApplicationContext(),ChoiceActivity.class);
                startActivity(choiceActivityIntent);
                finish();
                break;

            case R.id.btnSuccessfulExit:
                finish();
                break;
        }
    }
}