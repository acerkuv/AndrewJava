package ru.kuvaldin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] rightAnswerIndex = {3, 3, 1};
        String[] allQuestion = {"В файл с каким расширением компилируется java-файл?",
                "С помощью какой команды git можно получить полную копию удаленного репозитория?",
                "Какой применяется цикл, когда не известно количество итераций?"
        };
        String[] [] allAnswer = {{"1. cs\n" , "2. java", "3. class", "4. exe"},
                {"1. commit", "2. push", "3. clone", "4. copy"},
                {"1. While", "2. for", "3. loop"}  //убрать вопросы и ответы
        };

        Test test = new Test();
        for (int i = 0; i < allQuestion.length; i++) {
//            for (int k = 0; k < allAnswer[i].length; k++) {


                Answer answer = new Answer();
                Element element = new Element(allQuestion[i], allAnswer[i], rightAnswerIndex [i]);
                element.setTest(test);
                System.out.println(element);

                // опрос ответа пользователя
                boolean checkedAnswer =   element.ask(element.getRightAnswerIndex());


                if (checkedAnswer) test.increasedCount();
                answer.showText(checkedAnswer);
//            }

        }
        // вывод результата
        System.out.println(test.getRightAnswerCount());
    }

}