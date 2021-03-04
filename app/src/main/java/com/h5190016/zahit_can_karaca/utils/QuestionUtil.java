package com.h5190016.zahit_can_karaca.utils;

import android.content.Context;

import com.h5190016.zahit_can_karaca.R;
import com.h5190016.zahit_can_karaca.models.Question;

import java.util.ArrayList;

public class QuestionUtil {
    static ArrayList<Question> questions = new ArrayList<>();


    static int QUESTION_INDEX = 0;

    public static void createQuestions(Context context){
        Question question1 = new Question(
                context.getResources().getString(R.string.app_question1),
                context.getResources().getString(R.string.app_question1_1),
                context.getResources().getString(R.string.app_question1_2),
                context.getResources().getString(R.string.app_question1_3),
                context.getResources().getString(R.string.app_teknoloji),
                2
        );

        Question question2 = new Question(
                context.getResources().getString(R.string.app_question2),
                context.getResources().getString(R.string.app_question2_1),
                context.getResources().getString(R.string.app_question2_2),
                context.getResources().getString(R.string.app_question2_3),
                context.getResources().getString(R.string.app_teknoloji),
                1
        );
        Question question3 = new Question(
                context.getResources().getString(R.string.app_question3),
                context.getResources().getString(R.string.app_question3_1),
                context.getResources().getString(R.string.app_question3_2),
                context.getResources().getString(R.string.app_question3_3),
                context.getResources().getString(R.string.app_teknoloji),
                3
        );
        Question question4 = new Question(
                context.getResources().getString(R.string.app_question4),
                context.getResources().getString(R.string.app_question4_1),
                context.getResources().getString(R.string.app_question4_2),
                context.getResources().getString(R.string.app_question4_3),
                context.getResources().getString(R.string.app_teknoloji),
                1
        );
        Question question5 = new Question(
                context.getResources().getString(R.string.app_question5),
                context.getResources().getString(R.string.app_question5_1),
                context.getResources().getString(R.string.app_question5_2),
                context.getResources().getString(R.string.app_question5_3),
                context.getResources().getString(R.string.app_teknoloji),
                2
        );
        Question question6 = new Question(
                context.getResources().getString(R.string.app_question6),
                context.getResources().getString(R.string.app_question6_1),
                context.getResources().getString(R.string.app_question6_2),
                context.getResources().getString(R.string.app_question6_3),
                context.getResources().getString(R.string.app_teknoloji),
                1
        );
        Question question7 = new Question(
                context.getResources().getString(R.string.app_question7),
                context.getResources().getString(R.string.app_question7_1),
                context.getResources().getString(R.string.app_question7_2),
                context.getResources().getString(R.string.app_question7_3),
                context.getResources().getString(R.string.app_teknoloji),
                3
        );
        Question question8 = new Question(
                context.getResources().getString(R.string.app_question8),
                context.getResources().getString(R.string.app_question8_1),
                context.getResources().getString(R.string.app_question8_2),
                context.getResources().getString(R.string.app_question8_3),
                context.getResources().getString(R.string.app_teknoloji),
                2
        );
        Question question9 = new Question(
                context.getResources().getString(R.string.app_question9),
                context.getResources().getString(R.string.app_question9_1),
                context.getResources().getString(R.string.app_question9_2),
                context.getResources().getString(R.string.app_question9_3),
                context.getResources().getString(R.string.app_teknoloji),
                3
        );
        Question question10 = new Question(
                context.getResources().getString(R.string.app_question10),
                context.getResources().getString(R.string.app_question10_1),
                context.getResources().getString(R.string.app_question10_2),
                context.getResources().getString(R.string.app_question10_3),
                context.getResources().getString(R.string.app_teknoloji),
                3
        );
        Question question11 = new Question(
                context.getResources().getString(R.string.app_question11),
                context.getResources().getString(R.string.app_question11_1),
                context.getResources().getString(R.string.app_question11_2),
                context.getResources().getString(R.string.app_question11_3),
                context.getResources().getString(R.string.app_tarih),
                2
        );

        Question question12 = new Question(
                context.getResources().getString(R.string.app_question12),
                context.getResources().getString(R.string.app_question12_1),
                context.getResources().getString(R.string.app_question12_2),
                context.getResources().getString(R.string.app_question12_3),
                context.getResources().getString(R.string.app_tarih),
                1
        );
        Question question13 = new Question(
                context.getResources().getString(R.string.app_question13),
                context.getResources().getString(R.string.app_question13_1),
                context.getResources().getString(R.string.app_question13_2),
                context.getResources().getString(R.string.app_question13_3),
                context.getResources().getString(R.string.app_tarih),
                1
        );
        Question question14 = new Question(
                context.getResources().getString(R.string.app_question14),
                context.getResources().getString(R.string.app_question14_1),
                context.getResources().getString(R.string.app_question14_2),
                context.getResources().getString(R.string.app_question14_3),
                context.getResources().getString(R.string.app_tarih),
                3
        );
        Question question15 = new Question(
                context.getResources().getString(R.string.app_question15),
                context.getResources().getString(R.string.app_question15_1),
                context.getResources().getString(R.string.app_question15_2),
                context.getResources().getString(R.string.app_question15_3),
                context.getResources().getString(R.string.app_tarih),
                2
        );
        Question question16 = new Question(
                context.getResources().getString(R.string.app_question16),
                context.getResources().getString(R.string.app_question16_1),
                context.getResources().getString(R.string.app_question16_2),
                context.getResources().getString(R.string.app_question16_3),
                context.getResources().getString(R.string.app_tarih),
                3
        );
        Question question17 = new Question(
                context.getResources().getString(R.string.app_question17),
                context.getResources().getString(R.string.app_question17_1),
                context.getResources().getString(R.string.app_question17_2),
                context.getResources().getString(R.string.app_question17_3),
                context.getResources().getString(R.string.app_tarih),
                1
        );
        Question question18 = new Question(
                context.getResources().getString(R.string.app_question18),
                context.getResources().getString(R.string.app_question18_1),
                context.getResources().getString(R.string.app_question18_2),
                context.getResources().getString(R.string.app_question18_3),
                context.getResources().getString(R.string.app_tarih),
                2
        );
        Question question19 = new Question(
                context.getResources().getString(R.string.app_question19),
                context.getResources().getString(R.string.app_question19_1),
                context.getResources().getString(R.string.app_question19_2),
                context.getResources().getString(R.string.app_question19_3),
                context.getResources().getString(R.string.app_tarih),
                1
        );
        Question question20 = new Question(
                context.getResources().getString(R.string.app_question20),
                context.getResources().getString(R.string.app_question20_1),
                context.getResources().getString(R.string.app_question20_2),
                context.getResources().getString(R.string.app_question20_3),
                context.getResources().getString(R.string.app_tarih),
                3
        );
        Question question21 = new Question(
                context.getResources().getString(R.string.app_question21),
                context.getResources().getString(R.string.app_question21_1),
                context.getResources().getString(R.string.app_question21_2),
                context.getResources().getString(R.string.app_question21_3),
                context.getResources().getString(R.string.app_oyunlar),
                2
        );

        Question question22 = new Question(
                context.getResources().getString(R.string.app_question22),
                context.getResources().getString(R.string.app_question22_1),
                context.getResources().getString(R.string.app_question22_2),
                context.getResources().getString(R.string.app_question22_3),
                context.getResources().getString(R.string.app_oyunlar),
                1
        );
        Question question23 = new Question(
                context.getResources().getString(R.string.app_question23),
                context.getResources().getString(R.string.app_question23_1),
                context.getResources().getString(R.string.app_question23_2),
                context.getResources().getString(R.string.app_question23_3),
                context.getResources().getString(R.string.app_oyunlar),
                1
        );
        Question question24 = new Question(
                context.getResources().getString(R.string.app_question24),
                context.getResources().getString(R.string.app_question24_1),
                context.getResources().getString(R.string.app_question24_2),
                context.getResources().getString(R.string.app_question24_3),
                context.getResources().getString(R.string.app_oyunlar),
                3
        );
        Question question25 = new Question(
                context.getResources().getString(R.string.app_question25),
                context.getResources().getString(R.string.app_question25_1),
                context.getResources().getString(R.string.app_question25_2),
                context.getResources().getString(R.string.app_question25_3),
                context.getResources().getString(R.string.app_oyunlar),
                3
        );
        Question question26 = new Question(
                context.getResources().getString(R.string.app_question26),
                context.getResources().getString(R.string.app_question26_1),
                context.getResources().getString(R.string.app_question26_2),
                context.getResources().getString(R.string.app_question26_3),
                context.getResources().getString(R.string.app_oyunlar),
                1
        );
        Question question27 = new Question(
                context.getResources().getString(R.string.app_question27),
                context.getResources().getString(R.string.app_question27_1),
                context.getResources().getString(R.string.app_question27_2),
                context.getResources().getString(R.string.app_question27_3),
                context.getResources().getString(R.string.app_oyunlar),
                2
        );
        Question question28 = new Question(
                context.getResources().getString(R.string.app_question28),
                context.getResources().getString(R.string.app_question28_1),
                context.getResources().getString(R.string.app_question28_2),
                context.getResources().getString(R.string.app_question28_3),
                context.getResources().getString(R.string.app_oyunlar),
                3
        );
        Question question29 = new Question(
                context.getResources().getString(R.string.app_question29),
                context.getResources().getString(R.string.app_question29_1),
                context.getResources().getString(R.string.app_question29_2),
                context.getResources().getString(R.string.app_question29_3),
                context.getResources().getString(R.string.app_oyunlar),
                1
        );
        Question question30 = new Question(
                context.getResources().getString(R.string.app_question30),
                context.getResources().getString(R.string.app_question30_1),
                context.getResources().getString(R.string.app_question30_2),
                context.getResources().getString(R.string.app_question30_3),
                context.getResources().getString(R.string.app_oyunlar),
                2
        );

        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
        questions.add(question6);
        questions.add(question7);
        questions.add(question8);
        questions.add(question9);
        questions.add(question10);
        questions.add(question11);
        questions.add(question12);
        questions.add(question13);
        questions.add(question14);
        questions.add(question15);
        questions.add(question16);
        questions.add(question17);
        questions.add(question18);
        questions.add(question19);
        questions.add(question20);
        questions.add(question21);
        questions.add(question22);
        questions.add(question23);
        questions.add(question24);
        questions.add(question25);
        questions.add(question26);
        questions.add(question27);
        questions.add(question28);
        questions.add(question29);
        questions.add(question30);


    }


    public static Question getNextQuestion(){
        if(QUESTION_INDEX<questions.size()-1){
            QUESTION_INDEX++;
        }
        else {
            QUESTION_INDEX = 0;
        }
        return questions.get(QUESTION_INDEX);
    }

    public static Boolean checkAnswer(int answer){
        if(questions.get(QUESTION_INDEX).getTrueAnswer()==answer){
            return true;
        }
        else {
            return false;
        }
    }

}
