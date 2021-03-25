package com.androsor.string_object;

import static com.androsor.string_object.IOUtils.closeScanner;

/**
 * Using the copy function and the concatenation operation, form the word "торт" from the parts of the word "информатика".
 */
public class HomeTask4 {

    public static void main(String[] args) {

        String line = "информатика";

        System.out.printf("Было: %s \n", line);
        System.out.printf("Стало: %s \n", makeWordFromLetters(line));

        closeScanner();
    }

    private static String makeWordFromLetters(String line) {
        return line.charAt(7) +
                line.substring(3, 5) +
                line.charAt(7);
    }
}
