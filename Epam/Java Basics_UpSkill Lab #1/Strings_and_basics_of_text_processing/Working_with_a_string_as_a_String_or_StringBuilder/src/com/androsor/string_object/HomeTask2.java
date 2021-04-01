package com.androsor.string_object;

import static com.androsor.string_object.IOHelper.enterCharFromConsole;
import static com.androsor.string_object.IOHelper.enterStringFromConsole;

/**
 * In the line insert after each 'a' character 'b'.
 */
public class HomeTask2 {

    private static final String INPUT_MESSAGE = "Введите строку:";
    private static final String OUTPUT_MESSAGE = "Измененная строка:\n%s";
    private static final String REPLACEABLE_SYMBOL_MESSAGE = "Введите заменяемый символ:";
    private static final String SUBSTITUTE_SYMBOL_MESSAGE = "Введите заменяющий символ:";

    public static void main(String[] args) {

        String line = enterStringFromConsole(INPUT_MESSAGE);
        char symbolA = enterCharFromConsole(REPLACEABLE_SYMBOL_MESSAGE);
        char symbolB = enterCharFromConsole(SUBSTITUTE_SYMBOL_MESSAGE);

        System.out.printf(OUTPUT_MESSAGE, replaceCharactersInString(line, symbolA, symbolB));
    }

    private static String replaceCharactersInString(String line, char symbolA, char symbolB) {
        StringBuilder stringNew = new StringBuilder();
        for (char symbol : line.toCharArray()) {
            stringNew.append(symbol);
            if (symbol == symbolA) {
                stringNew.append(symbolB);
            }
        }
        return stringNew.toString();
    }
}
