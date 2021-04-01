package com.androsor.string_object;

import static com.androsor.string_object.IOHelper.enterStringFromConsole;
import static java.lang.Character.isSpaceChar;

/**
 * Given text (string). Find the largest number of consecutive spaces in it.
 */
public class HomeTask1 {

    private static final String INPUT_MESSAGE = "Введите строку/строки с различным количеством прробелов:";
    private static final String OUTPUT_MESSAGE = "Максимальное количество пробелов во введенной строке/строках = %d";

    public static void main(String[] args) {

        String line = enterStringFromConsole(INPUT_MESSAGE);

        System.out.printf(OUTPUT_MESSAGE, countSpaces(line));
    }

    private static int countSpaces(String line) {
        int countMax = 0;
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (isSpaceChar(line.charAt(i))) {
                count++;
                if (count > countMax) {
                    countMax = count;
                }
            } else {
                count = 0;
            }
        }
        return countMax;
    }
}
