package com.h5190016.zahit_can_karaca.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.h5190016.zahit_can_karaca.R;
import com.h5190016.zahit_can_karaca.utils.PrefUtil;


public class GetNameActivity extends AppCompatActivity  implements View.OnClickListener{

    EditText edtName;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_name);

        init();

    }

    public void init(){
        edtName= findViewById(R.id.edtName);
        btnNext= findViewById(R.id.btnNext);
        btnNext.setOnClickListener(this);
    }

    private void getName(){
        if(edtName.getText().toString().trim().equals(""))
        {
            Toast.makeText(GetNameActivity.this, getResources().getString(R.string.app_notNull), Toast.LENGTH_SHORT).show();
        }
        else{
            PrefUtil.setGamerName(getApplicationContext(),edtName.getText().toString());
            Intent choiceActivityIntent=new Intent(getApplicationContext(),ChoiceActivity.class);
            startActivity(choiceActivityIntent);
            finish();

        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnNext:
                getName();
                break;
        }
    }
}