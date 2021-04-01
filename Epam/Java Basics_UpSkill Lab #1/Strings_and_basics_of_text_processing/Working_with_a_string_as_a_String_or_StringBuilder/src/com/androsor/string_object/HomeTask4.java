package com.androsor.string_object;

import static java.lang.String.copyValueOf;

/**
 * Using the copy function and the concatenation operation, form the word "торт" from the parts of the word "информатика".
 */
public class HomeTask4 {

    private static final String LINE = "информатика";
    private static final String INPUT_MESSAGE = "Было: %s\n";
    private static final String OUTPUT_MESSAGE = "Стало: %s\n";

    public static void main(String[] args) {

        System.out.printf(INPUT_MESSAGE, LINE);
        System.out.printf(OUTPUT_MESSAGE, makeWordFromLetters());
    }

    private static String makeWordFromLetters() {
        return copyValueOf(LINE.toCharArray(), 7, 1) +
                copyValueOf(LINE.toCharArray(), 3, 2) +
                copyValueOf(LINE.toCharArray(), 7, 1);
    }
}
