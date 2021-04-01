package com.androsor.string_object;

import static com.androsor.string_object.IOHelper.enterStringFromConsole;

/**
 * Check if the given word is a palindrome.
 */
public class HomeTask3 {

    private static final String INPUT_MESSAGE = "Введите слово или предложение:";
    private static final String OUTPUT_MESSAGE = "Введенное слово/предложение ";

    public static void main(String[] args) {

        String line = enterStringFromConsole(INPUT_MESSAGE);

        System.out.println(OUTPUT_MESSAGE + (isPalindrome(line) ? "" : "не ") + "является полиндромом.");
    }

    private static boolean isPalindrome(String line) {
        StringBuilder stringBuilder = new StringBuilder(line.replaceAll("[^А-Яа-я]", ""));
        return stringBuilder.toString().equalsIgnoreCase((stringBuilder.reverse().toString()));
    }
}
