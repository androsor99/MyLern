package com.androsor.string_char;

import static com.androsor.string_char.IOUtils.enterFromConsole;
import static java.lang.Character.isDigit;

/**
 * Find the number of numbers in the string.
 */
public class HomeTask4 {

    public static void main(String[] args) {

        String strInitial = enterFromConsole("Ведите исходную строку"); //https://github.com/androsor99/MyLern/pull/4/files

        System.out.printf("В исходной строке %d чисел/числа.", countNumbers(strInitial));
    }

    private static int countNumbers (String line) {
        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            if (isDigit(line.charAt(i))) {
                if (i == line.length() - 1 || !isDigit(line.charAt(i + 1))) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
