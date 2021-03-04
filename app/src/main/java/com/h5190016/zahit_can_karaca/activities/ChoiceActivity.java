package com.h5190016.zahit_can_karaca.activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.h5190016.zahit_can_karaca.R;
import com.h5190016.zahit_can_karaca.utils.PrefUtil;

public class ChoiceActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnExit, btnCtgy1, btnCtgy2, btnCtgy3;
    TextView txtGetName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        init();

    }

    private void init(){
        btnExit= findViewById(R.id.btnExit);
        btnCtgy1= findViewById(R.id.btnCtgy1);
        btnCtgy2= findViewById(R.id.btnCtgy2);
        btnCtgy3= findViewById(R.id.btnCtgy3);
        txtGetName= findViewById(R.id.txtGetName);

        txtGetName.setText(getResources().getString(R.string.app_wwelcome) + PrefUtil.getGamerName((getApplicationContext())));

        btnExit.setOnClickListener(this);
        btnCtgy1.setOnClickListener(this);
        btnCtgy2.setOnClickListener(this);
        btnCtgy3.setOnClickListener(this);

    }

    public void startAlertDialog(){
        AlertDialog.Builder builder =new AlertDialog.Builder(this);
        builder.setTitle(getResources().getString(R.string.app_attention));
        builder.setMessage(getResources().getString(R.string.app_questionExit));
        builder.setPositiveButton(getResources().getString(R.string.app_yes), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface window, int i) {
                window.dismiss();
                finish();
            }
        });

        builder.setNegativeButton(getResources().getString(R.string.app_no), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface window, int i) {
                window.dismiss();
            }
        });
        builder.show();
    }

    public void nextActivity(){
        Intent questionActivityIntent=new Intent(getApplicationContext(),QuestionActivity.class);
        startActivity(questionActivityIntent);
        finish();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnExit:
                startAlertDialog();
                break;
            case R.id.btnCtgy1:
                PrefUtil.setCategory(getApplicationContext(),btnCtgy1.getText().toString());
                nextActivity();
                break;
            case R.id.btnCtgy2:
                PrefUtil.setCategory(getApplicationContext(),btnCtgy2.getText().toString());
                nextActivity();
                break;
            case R.id.btnCtgy3:
                PrefUtil.setCategory(getApplicationContext(),btnCtgy3.getText().toString());
                nextActivity();
                break;
        }
    }
}

