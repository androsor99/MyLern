package com.androsor.string_object;

import static com.androsor.string_object.Data.enterStringFromConsole;

import java.util.StringTokenizer;

public class HomeTask10 {

    public static void main(String[] args) {

        String line = enterStringFromConsole("Введите строку:");

        System.out.printf("Предложенный текст состоит из %d предложений.", countSentence(line));
    }

    public static int countSentence(String string) {
        StringTokenizer tokenizer = new StringTokenizer(string, ".!?");
        return tokenizer.countTokens();
    }
}
