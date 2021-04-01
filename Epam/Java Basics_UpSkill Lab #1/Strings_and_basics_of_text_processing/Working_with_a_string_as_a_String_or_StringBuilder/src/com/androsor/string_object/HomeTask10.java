package com.androsor.string_object;

import static com.androsor.string_object.IOHelper.enterStringFromConsole;

/**
 * Line X consists of several sentences, each ending with a period, exclamation mark, or question mark.
 * Determine the number of sentences in line X.
 */
public class HomeTask10 {

    private static final String INPUT_MESSAGE = "Введите строку:";
    private static final String OUTPUT_MESSAGE = "Предложенный текст состоит из %d предложений.\n";

    public static void main(String[] args) {

        String line = enterStringFromConsole(INPUT_MESSAGE);

        System.out.printf(OUTPUT_MESSAGE, countSentence(line));
    }

    public static int countSentence(String line) {
        return line.strip().split("[.!?]+\\s+").length;
    }
}
