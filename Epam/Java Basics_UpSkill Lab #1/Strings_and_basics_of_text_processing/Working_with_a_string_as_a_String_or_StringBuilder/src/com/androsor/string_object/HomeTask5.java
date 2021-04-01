package com.androsor.string_object;

import static com.androsor.string_object.IOHelper.enterStringFromConsole;

/**
 * Count how many times the letter "a" occurs among the characters of a given string.
 */
public class HomeTask5 {

    private static final char SYMBOL = 'а';
    private static final String INPUT_MESSAGE = "Введите строку:";
    private static final String OUTPUT_MESSAGE = "В заданной строке буква а встречается %d раз";

    public static void main(String[] args) {

        String line = enterStringFromConsole(INPUT_MESSAGE);

        long count = countSymbol(line, SYMBOL);

        System.out.printf(OUTPUT_MESSAGE, count);
    }

    private static long countSymbol(String line, char symbol) {
        return line.chars().filter(ch -> ch == symbol).count();
    }
}
