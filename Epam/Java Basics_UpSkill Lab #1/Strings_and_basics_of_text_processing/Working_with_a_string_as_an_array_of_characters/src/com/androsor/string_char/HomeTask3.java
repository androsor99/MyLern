package com.androsor.string_char;

/**
 * Find the number of digits in the string.
 */

public class HomeTask3 {

    public static void main(String[] args) {

        String strInitial;

        strInitial = HomeTask1.enterFromConsole("Ведите исходную строку");

        System.out.printf("В исходной строке %d цифр/цифрей/цифров. ", findingNumberDigitString(strInitial));
    }

    // Метод нахождения количества цифер в строке.
    public static int findingNumberDigitString(String strInitial) {

        char[] Array;
        Array = strInitial.toCharArray();

        int count;
        count = 0;

        for (char c : Array) {

            if (Character.isDigit(c)) {
                count++;
            }
        }

        return count;
    }
}
