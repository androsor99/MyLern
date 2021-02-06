package com.androsor.string_object;

/**
 * Check if the given word is a palindrome.
 */

public class HomeTask3 {


    public static void main (String [] args){

        String str;

        str = HomeTask1.enterFromConsole("Введите слово или предложение:");
        str = str.replaceAll("\\s", "");

        StringBuilder strPalindrome = new StringBuilder(str);

        if (str.equalsIgnoreCase(strPalindrome.reverse().toString())) {

            System.out.println("Введенное слово/предложение является полиндромом.");

        }else {

            System.out.println("Введенное слово/предложение не является полиндромом." );
        }
    }
}