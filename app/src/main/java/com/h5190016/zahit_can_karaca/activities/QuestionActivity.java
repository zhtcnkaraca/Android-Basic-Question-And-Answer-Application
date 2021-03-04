package com.h5190016.zahit_can_karaca.activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.h5190016.zahit_can_karaca.models.Question;
import com.h5190016.zahit_can_karaca.utils.PrefUtil;
import com.h5190016.zahit_can_karaca.utils.QuestionUtil;
import com.h5190016.zahit_can_karaca.R;

public class QuestionActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtQuestion, txtCategory, txtPoint,getTxtQuestionInfo;
    Button btn1 ,btn2, btn3;
    Integer counter = 1, point = 0;
    Boolean status= true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        init();
    }
    private void init(){
        String categoryName = PrefUtil.getCategory(getApplicationContext());
        txtQuestion = findViewById(R.id.txtQuestionTab);
        txtCategory = findViewById(R.id.txtCategory);
        txtPoint = findViewById(R.id.txtPoint);
        getTxtQuestionInfo = findViewById(R.id.txtQuestionInfo);
        btn1 = findViewById(R.id.btnAnswer1);
        btn2 = findViewById(R.id.btnAnswer2);
        btn3 = findViewById(R.id.btnAnswer3);
        txtCategory.setText(categoryName);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        txtPoint.setText(getResources().getString(R.string.app_point)+ point);
        getTxtQuestionInfo.setText(getResources().getString(R.string.app_questionInfo)+ counter + getResources().getString(R.string.app_questionInfo2));
        QuestionUtil.createQuestions(getApplicationContext());
        writeQuestion();
    }

    public void counterAndPoint(){
        PrefUtil.setCounter(getApplicationContext(),counter.toString());
        PrefUtil.setPoint(getApplicationContext(),point.toString());
    }

    private void writeQuestion(){
        String categoryName =PrefUtil.getCategory((getApplicationContext()));
        status=true;
        while (status == true){
            Question question = QuestionUtil.getNextQuestion();
            if(categoryName.equals(question.getCategory())){
                reset();
                status= false;
                txtQuestion.setText(question.getQuestion());
                btn1.setText(question.getAnswer1());
                btn2.setText(question.getAnswer2());
                btn3.setText(question.getAnswer3());
            }
        }
    }

    private  void correctAnswer(int clickAnswer,View btnClicked){

        if(QuestionUtil.checkAnswer(clickAnswer)){
            btnClicked.setBackground(getResources().getDrawable(R.drawable.bg_costumsuccessfulbutton));
            counter++;
            point+=100;
            txtPoint.setText(getResources().getString(R.string.app_point)+ point);

            if(counter == 11){
                counterAndPoint();
                Intent successfulActivityIntent=new Intent(getApplicationContext(),SuccessfulActivity.class);
                startActivity(successfulActivityIntent);
                finish();
            }
            else{
                gameTimer();
            }
        }
        else{
            btnClicked.setBackground(getResources().getDrawable(R.drawable.bg_costumgameoverbutton));
            gameOver();
        }
    }

    public void gameAlertDialog(){

        AlertDialog.Builder builder =new AlertDialog.Builder(this);
        builder.setTitle(getResources().getString(R.string.app_trueAnswer));
        builder.setMessage(getResources().getString(R.string.app_waiting));
        builder.setPositiveButton(getResources().getString(R.string.app_next), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface window, int i) {
                getTxtQuestionInfo.setText(getResources().getString(R.string.app_questionInfo)+ counter+getResources().getString(R.string.app_questionInfo2));
                window.dismiss();
                writeQuestion();

            }
        });

        builder.setNegativeButton(getResources().getString(R.string.app_exit), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface window, int i) {
                Intent choiceActivityIntent=new Intent(getApplicationContext(),ChoiceActivity.class);
                startActivity(choiceActivityIntent);
                finish();
            }
        });
        builder.show();
    }

    public void gameTimer(){
        CountDownTimer countDownTimer =new CountDownTimer(1000,1000) {
            @Override
            public void onTick(long l) {
            }
            @Override
            public void onFinish() {
                gameAlertDialog();
            }
        };
        countDownTimer.start();
    }

    public void gameOver(){
        CountDownTimer countDownTimer =new CountDownTimer(1000,1000) {
            @Override
            public void onTick(long l) {
            }
            @Override
            public void onFinish() {
                counterAndPoint();
                Intent gameOverActivityIntent=new Intent(getApplicationContext(),GameOverActivity.class);
                startActivity(gameOverActivityIntent);
                finish();
            }
        };
        countDownTimer.start();
    }

    private void reset(){
        btn1.setBackground(getResources().getDrawable(R.drawable.bg_costumbutton1));
        btn2.setBackground(getResources().getDrawable(R.drawable.bg_costumbutton1));
        btn3.setBackground(getResources().getDrawable(R.drawable.bg_costumbutton1));
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnAnswer1:
                correctAnswer(1,v);
                btn2.setEnabled(false);
                btn3.setEnabled(false);
                break;

            case R.id.btnAnswer2:
                correctAnswer(2,v);
                btn1.setEnabled(false);
                btn3.setEnabled(false);
                break;

            case R.id.btnAnswer3:
                correctAnswer(3,v);
                btn1.setEnabled(false);
                btn2.setEnabled(false);
                break;

        }

    }
}