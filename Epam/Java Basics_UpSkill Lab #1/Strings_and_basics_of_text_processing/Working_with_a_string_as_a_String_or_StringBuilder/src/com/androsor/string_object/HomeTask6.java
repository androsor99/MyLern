package com.androsor.string_object;

import static com.androsor.string_object.IOHelper.enterStringFromConsole;

/**
 * Get a new one from the given string by repeating each character twice.
 */
public class HomeTask6 {

    private static final String INPUT_MESSAGE = "Введите строку";
    private static final String OUTPUT_MESSAGE = "Строка с задвоенными символами:\n%s";

    public static void main(String[] args) {

        String line = enterStringFromConsole(INPUT_MESSAGE);
        System.out.printf(OUTPUT_MESSAGE, makeWordFromDuplicateLetters(line));
    }

    private static String makeWordFromDuplicateLetters(String line) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            char symbol = line.charAt(i);
            stringBuilder.append(symbol).append(symbol);
        }
        return stringBuilder.toString();
    }
}
