package com.androsor.string_object;

/**
 * Using the copy function and the concatenation operation, form the word "торт" from the parts of the word "информатика".
 */
public class HomeTask4 {

    public static void main(String[] args) {

        String line = "информатика";

        System.out.printf("Было: %s \n", line);
        System.out.printf("Стало: %s \n", makeWordFromLetters(line));

    }

    private static String makeWordFromLetters(String string) {
        StringBuilder word = new StringBuilder();
        word.append(string.charAt(7));
        word.append(string, 3, 5);
        word.append(string.charAt(7));
        return word.toString();
    }
}
