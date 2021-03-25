package com.androsor.string_object;

import static com.androsor.string_object.IOUtils.closeScanner;
import static com.androsor.string_object.IOUtils.getInstance;

/**
 * Using the copy function and the concatenation operation, form the word "торт" from the parts of the word "информатика".
 */
public class HomeTask4 {

    public static void main(String[] args) {

        String line = "информатика";

        System.out.printf("Было: %s \n", line);
        System.out.printf("Стало: %s \n", makeWordFromLetters(line));

        closeScanner(getInstance());
    }

    private static String makeWordFromLetters(String string) {
        return string.charAt(7) +
                string.substring(3, 5) +
                string.charAt(7);
    }
}
