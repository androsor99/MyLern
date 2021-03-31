package com.androsor.string_object;

import static com.androsor.string_object.IOUtils.enterCharFromConsole;
import static com.androsor.string_object.IOUtils.enterStringFromConsole;

/**
 * In the line insert after each 'a' character 'b'.
 */
public class HomeTask2 {

    public static void main(String[] args) {

        String line = enterStringFromConsole("Введите строку:");
        char symbolA = enterCharFromConsole("Введите заменяемый символ:");
        char symbolB = enterCharFromConsole("Введите заменяющий символ:");

        System.out.printf("Измененная строка:\n%s", replaceCharactersInString(line, symbolA, symbolB));
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
