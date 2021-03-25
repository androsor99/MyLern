package com.androsor.string_object;

import static com.androsor.string_object.IOUtils.closeScanner;
import static com.androsor.string_object.IOUtils.enterStringFromConsole;

/**
 * Count how many times the letter "a" occurs among the characters of a given string.
 */
public class HomeTask5 {

    public static void main(String [] args) {

        String line = enterStringFromConsole("Введите строку:");

        char symbol = 'а';

        long count = countSymbol(line, symbol);

        System.out.printf("В заданной строке буква а встречается %d раз", count);

        closeScanner();
    }

    private static long countSymbol(String line, char symbol) {
        return line.chars().filter(ch -> ch == symbol).count();
    }

//    private static int countSymbol(String line, char symbol) {
//        int count = 0;
//        for (int i = 0; i < line.length(); i++) {
//            if (line.charAt(i) == symbol) {
//                count++;
//            }
//        }
//        return count;
//    }
}
