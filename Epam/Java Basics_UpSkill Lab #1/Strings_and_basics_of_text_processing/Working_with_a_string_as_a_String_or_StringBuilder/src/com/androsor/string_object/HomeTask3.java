package com.androsor.string_object;
import static com.androsor.string_object.Data.enterStringFromConsole;
/**
 * Check if the given word is a palindrome.
 */

public class HomeTask3 {


    public static void main (String [] args){

        String str;

        str = enterStringFromConsole("Введите слово или предложение:");
        str = str.replaceAll("\\s", "");

        StringBuilder strPalindrome = new StringBuilder(str);

        if (str.equalsIgnoreCase(strPalindrome.reverse().toString())) {

            System.out.println("Введенное слово/предложение является полиндромом.");

        }else {

            System.out.println("Введенное слово/предложение не является полиндромом." );
        }
    }
}