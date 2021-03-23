package com.androsor.string_object;

import static com.androsor.string_object.IOUtils.enterStringFromConsole;
import static com.androsor.string_object.IOUtils.enterCharFromConsole;

/**
 * In the line insert after each 'a' character 'b'.
 */
public class HomeTask2 {

    public static void main(String[] args) {

        String line = enterStringFromConsole("Введите строку:");
        char symbolA = enterCharFromConsole("Введите заменяемый символ:");
        char symbolB = enterCharFromConsole("Введите заменяющий символ:");

        //System.out.println(line.replace(symbolA, (symbolA + symbolB)));
        System.out.printf("Измененная строка:\n %s", replaceCharactersInString(line, symbolA, symbolB));
    }

    private static String replaceCharactersInString(String line, char symbolA, char symbolB) {
        StringBuilder stringNew = new StringBuilder();
        for (char symbol : line.toCharArray()) {
            if (symbol == symbolA) {
                stringNew.append(symbol).append(symbolB);
            } else {
                stringNew.append(symbol);
            }
        }
        return stringNew.toString();
    }
}
