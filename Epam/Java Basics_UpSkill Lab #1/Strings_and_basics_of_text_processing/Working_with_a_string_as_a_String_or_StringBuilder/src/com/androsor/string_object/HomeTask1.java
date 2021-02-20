package com.androsor.string_object;

import static com.androsor.string_object.Data.enterStringFromConsole;
import static java.lang.Character.isSpaceChar;

/**
 * Given text (string). Find the largest number of consecutive spaces in it.
 */
public class HomeTask1 {

    public static void main(String[] args) {

        String line = enterStringFromConsole("Введите строку/строки с различным количеством прробелов:");

        System.out.printf("Максимальное количество пробелов во введенной строке/строках = %d", countSpaces(line));
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
            } else count = 0;
        }
        return countMax;
    }
}