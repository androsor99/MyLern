package com.androsor.string_object;

import static com.androsor.string_object.Data.enterStringFromConsole;

/**
 * Check if the given word is a palindrome.
 */
public class HomeTask3 {

    public static void main (String [] args){

        String line = enterStringFromConsole("Введите слово или предложение:");

        checkForPalindrome(line);
    }

    private static void checkForPalindrome(String line) {

        StringBuilder stringBuilder = new StringBuilder(line.replaceAll("[^А-Яа-я]", ""));
        if (stringBuilder.toString().equalsIgnoreCase((stringBuilder.reverse().toString()))) {
            System.out.println("Введенное слово/предложение является полиндромом.");
        } else {
            System.out.println("Введенное слово/предложение не является полиндромом." );
        }
    }
}
