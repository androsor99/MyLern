package com.androsor.string_object;

/**
 * Count how many times the letter "a" occurs among the characters of a given string.
 */

public class HomeTask5 {

    public static void main (String [] args){

        String str;

        str = HomeTask1.enterFromConsole("Введите строку:");

        int count = 0;

        for (int i =0; i<str.length(); i++){

            if ((str.charAt(i) == 'a') || (str.charAt(i) == 'а')) {

                count++;
            }
        }

        System.out.printf("В заданной строке буква А встречается %d раз", count);
    }
}
