package com.androsor.string_object;

import static com.androsor.string_object.IOUtils.enterStringFromConsole;

/**
 * Count how many times the letter "a" occurs among the characters of a given string.
 */
public class HomeTask5 {

    private static final char SYMBOL = 'а';

    public static void main(String [] args) {

        String line = enterStringFromConsole("Введите строку:");

        long count = countSymbol(line, SYMBOL);

        System.out.printf("В заданной строке буква а встречается %d раз", count);
    }

    private static long countSymbol(String line, char symbol) {
        return line.chars().filter(ch -> ch == symbol).count();
    }
}
