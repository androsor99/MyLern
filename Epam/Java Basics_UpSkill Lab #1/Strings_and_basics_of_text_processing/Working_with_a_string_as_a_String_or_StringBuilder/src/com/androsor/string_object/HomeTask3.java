package com.androsor.string_object;

import static com.androsor.string_object.IOUtils.enterStringFromConsole;

/**
 * Check if the given word is a palindrome.
 */
public class HomeTask3 {

    public static void main (String [] args) {

        String line = enterStringFromConsole("Введите слово или предложение:");

        System.out.println("Введенное слово/предложение " + (isPalindrome(line) ? "" : "не ") + "является полиндромом.");
    }

    private static boolean isPalindrome(String line) {
        StringBuilder stringBuilder = new StringBuilder(line.replaceAll("[^А-Яа-я]", ""));
        return stringBuilder.toString().equalsIgnoreCase((stringBuilder.reverse().toString()));
    }
}
