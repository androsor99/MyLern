package com.androsor.string_object;

import static com.androsor.string_object.IOUtils.enterStringFromConsole;

/**
 * Get a new one from the given string by repeating each character twice.
 */
public class HomeTask6 {

    public static void main(String [] args) {

        String line = enterStringFromConsole("Введите строку");
        System.out.printf("Строка с задвоенными символами:\n%s", makeWordFromDuplicateLetters(line));
    }

    private static String makeWordFromDuplicateLetters(String line) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            char[] symbols = {line.charAt(i), line.charAt(i)};
            stringBuilder.append(symbols);
        }
        return stringBuilder.toString();
    }
}
