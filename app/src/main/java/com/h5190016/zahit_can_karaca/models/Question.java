package com.h5190016.zahit_can_karaca.models;

public class Question {

    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String category;
    private int trueAnswer;

    public Question(){
    }
    public Question(String question, String answer1, String answer2, String answer3, String category, int trueAnswer) {
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.category = category;
        this.trueAnswer = trueAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public int getTrueAnswer() {
        return trueAnswer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public void setTrueAnswer(int trueAnswer) {
        this.trueAnswer = trueAnswer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
