package com.androsor.string_object;

/**
 * Using the copy function and the concatenation operation, form the word "торт" from the parts of the word "информатика".
 */
public class HomeTask4 {

    private static final String LINE = "информатика";

    public static void main(String[] args) {

        System.out.printf("Было: %s \n", LINE);
        System.out.printf("Стало: %s \n", makeWordFromLetters());
    }

    private static String makeWordFromLetters() {
        return String.copyValueOf(HomeTask4.LINE.toCharArray(), 7, 1).
                concat(String.copyValueOf(HomeTask4.LINE.toCharArray(), 3, 2)).
                concat(String.copyValueOf(HomeTask4.LINE.toCharArray(), 7, 1));
    }
}
