package com.androsor.string_object;

import java.util.StringTokenizer;

public class HomeTask10 {

    public static void main(String[] args) {

        String str;

        str = HomeTask1.enterFromConsole("Введите строку:");

        System.out.printf("Предложенный текст состоит из %d предложений.", countSentence(str));

    }

    //Метод нахождения количества предложений.
    public static int countSentence(String string) {

        StringTokenizer tokenizer = new StringTokenizer(string, ".!?");

        return tokenizer.countTokens();
    }
}
