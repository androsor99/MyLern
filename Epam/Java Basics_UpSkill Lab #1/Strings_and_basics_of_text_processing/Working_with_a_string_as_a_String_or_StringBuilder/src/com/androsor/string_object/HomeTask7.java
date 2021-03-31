package com.androsor.string_object;

import static com.androsor.string_object.IOUtils.enterStringFromConsole;
import static java.lang.Character.isSpaceChar;

/**
 * A string is entered. It is required to remove duplicate characters and all spaces from it. For example,
 * if "abc cde def" was entered, then "abcdef" should be output.
 */
public class HomeTask7 {

    public static void main(String [] arg) {

        String line = enterStringFromConsole("Введите строку:");

        String lineWithoutSpacesAndDuplicateCharacters = deleteAllSpacesAndDuplicateCharacters(line);

        System.out.printf("Строка без пробелов и повторяющихся символов\n%s", lineWithoutSpacesAndDuplicateCharacters);
    }

    public static String deleteAllSpacesAndDuplicateCharacters(String line) {
        StringBuilder stringBuilder = new StringBuilder();
        char symbol;
        for (int i = 0; i < line.length(); i++) {
            symbol = line.charAt(i);
            if (!isSpaceChar(symbol) && (line.indexOf(symbol) == i)) {
                stringBuilder.append(symbol);
            }
        }
        return stringBuilder.toString();
    }
}
