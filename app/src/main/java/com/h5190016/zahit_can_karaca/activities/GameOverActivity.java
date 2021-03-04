package com.h5190016.zahit_can_karaca.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.h5190016.zahit_can_karaca.R;
import com.h5190016.zahit_can_karaca.utils.PrefUtil;

public class GameOverActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtCounter,txtPoint;
    Button btnGameOverHomeScreen,btnGameOverExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
        init();

    }

    private void init(){
        btnGameOverExit = findViewById(R.id.btnGameOverExit);
        btnGameOverHomeScreen = findViewById(R.id.btnGameOverHomeScreen);
        txtCounter = (TextView)findViewById(R.id.txtGameOverGetQuestionInfo);
        txtPoint = (TextView)findViewById(R.id.txtGameOverGetPoint);
        String counter = PrefUtil.getCounter((getApplicationContext()));
        int lastCounter = Integer.parseInt(counter);
        txtPoint.setText(getResources().getString(R.string.app_point) + PrefUtil.getPoint((getApplicationContext())) );
        txtCounter.setText( getResources().getString(R.string.app_questionInfo) + (lastCounter-1)  + getResources().getString(R.string.app_questionInfo2));

        btnGameOverExit.setOnClickListener(this);
        btnGameOverHomeScreen.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnGameOverHomeScreen:
                Intent choiceActivityIntent=new Intent(getApplicationContext(),ChoiceActivity.class);
                startActivity(choiceActivityIntent);
                finish();
                break;
            case R.id.btnGameOverExit:
                finish();
                break;
        }
    }
}