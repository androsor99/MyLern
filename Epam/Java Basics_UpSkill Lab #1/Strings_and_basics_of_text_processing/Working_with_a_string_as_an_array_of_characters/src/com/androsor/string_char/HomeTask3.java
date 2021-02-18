package com.androsor.string_char;

import static com.androsor.string_char.Data.enterFromConsole;
import static java.lang.Character.isDigit;

/**
 * Find the number of digits in the string.
 */
public class HomeTask3 {

    public static void main(String[] args) {

        String strInitial = enterFromConsole("Ведите исходную строку"); //https://github.com/androsor99/MyLern/pull/4/files

        System.out.printf("В исходной строке %d цифр/цифрей/цифров.", findNumberOfDigitsInString(strInitial));
    }

    public static int findNumberOfDigitsInString(String strInitial) {
        char[] symbols = strInitial.toCharArray();
        int count = 0;
        for (char symbol : symbols) {
            if (isDigit(symbol)) {
                count++;
            }
        }
        return count;
    }
}
