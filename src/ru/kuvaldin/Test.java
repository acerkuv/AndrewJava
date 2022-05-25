package ru.kuvaldin;

public class Test {
    private Element[] questions;
    private int rightAnswerCount = 0;

    public int getRightAnswerCount() {
        return rightAnswerCount;
    }


    public Test(){}

    public void increasedCount(){
        rightAnswerCount++;
    }



}
//    public void setRightAnswerCount(int rightAnswerCount) {
//        this.rightAnswerCount = rightAnswerCount;
//    }
//
//    public int getRightAnswerCount() {
//        return rightAnswerCount;
//    }
//
//    protected Question question;
//    public void setQuestion(Question question) {
//        this.question = question;
//    }
//
//    public String[] getQuestion() {
//        return Question;
//    }
//
//    private void passTest(){
//    }