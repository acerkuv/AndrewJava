package ru.kuvaldin;

import java.util.Arrays;
import java.util.Scanner;

public class Element {//Element
//    private String answers = {"1. cs", "2. java", "3. class", "4. exe",
//            "1. commit", "2. push", "3. clone", "4. copy",
//            "1. While", "2. for", "3. loop"//убрать вопросы и ответы
//    };

//    private String Questions = {"В файл с каким расширением компилируется java-файл?",
//            "С помощью какой команды git можно получить полную копию удаленного репозитория?",
//            "С помощью какой команды git можно получить полную копию удаленного репозитория?"
//    };

    private String questions;
    private String[] answers;
    private int rightAnswerIndex;

    public Element(String questions, String[] answers, int rightAnswerIndex) {
        this.questions = questions;
        this.answers = answers;
        this.rightAnswerIndex = rightAnswerIndex;
    }

    private boolean ask() {
        return true;
    }

    public void setRightAnswerIndex(int rightAnswerIndex) {
        this.rightAnswerIndex = rightAnswerIndex;
    }

    @Override
    public String toString() {
        return "Вопрос:" + questions + '\n' +
                "  Варианты ответов: " + Arrays.toString(answers) + '\n' +
                "  Введите ваш ответ: " ;
    }
    //    public String[] getAnswer(int position) {
//        return new String[]{Answer[position]};
//    }

    //    public String[] getQuestions(int position) {
//        return new String[]{Questions[position]};
//    }
    public boolean ask(int rightAnswerIndex){
            Scanner scanner = new Scanner(System.in);
            if(Integer.parseInt(scanner.nextLine()) == rightAnswerIndex) {
                return true;
            }
                return false;
    }

    public int getRightAnswerIndex() {
        return rightAnswerIndex;
    }
    private Test test;

    public void setTest(Test test) {
        this.test = test;
    }
}