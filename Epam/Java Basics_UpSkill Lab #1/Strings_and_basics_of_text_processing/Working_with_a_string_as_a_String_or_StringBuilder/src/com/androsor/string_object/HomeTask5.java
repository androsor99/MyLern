package com.androsor.string_object;

import static com.androsor.string_object.Data.enterStringFromConsole;

/**
 * Count how many times the letter "a" occurs among the characters of a given string.
 */
public class HomeTask5 {

    public static void main(String [] args){

        String line = enterStringFromConsole("Введите строку:");

        char symbol = 'а';

        int count = countSymbol(line, symbol);

        System.out.printf("В заданной строке буква А встречается %d раз", count);
    }

    private static int countSymbol(String line, char symbol) {
        int count = 0;
        for (int i = 0; i< line.length(); i++) {
            if (line.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }
}
