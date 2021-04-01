package com.androsor.string_object;

import static com.androsor.string_object.IOHelper.enterStringFromConsole;
import static java.lang.Character.isSpaceChar;

/**
 * A string is entered. It is required to remove duplicate characters and all spaces from it. For example,
 * if "abc cde def" was entered, then "abcdef" should be output.
 */
public class HomeTask7 {

    private static final String INPUT_MESSAGE = "Введите строку:";
    private static final String OUTPUT_MESSAGE = "Строка без пробелов и повторяющихся символов\n%s";

    public static void main(String[] arg) {

        String line = enterStringFromConsole(INPUT_MESSAGE);

        String processedLine = processLine(line);

        System.out.printf(OUTPUT_MESSAGE, processedLine);
    }

    public static String processLine(String line) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            char symbol = line.charAt(i);
            if (!isSpaceChar(symbol) && (line.indexOf(symbol) == i)) {
                stringBuilder.append(symbol);
            }
        }
        return stringBuilder.toString();
    }
}
