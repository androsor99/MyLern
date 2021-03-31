package com.androsor.string_object;

import static com.androsor.string_object.IOUtils.enterStringFromConsole;

/**
 * Line X consists of several sentences, each ending with a period, exclamation mark, or question mark.
 * Determine the number of sentences in line X.
 */
public class HomeTask10 {

    public static void main(String[] args) {

        String line = enterStringFromConsole("Введите строку:"); //.привет. пока пролд. отм?

        System.out.printf("Предложенный текст состоит из %d предложений.\n", countSentence(line));
    }

    public static int countSentence(String line) {
        return line.strip().split("[.!?]+\\s+").length;
    }
}
