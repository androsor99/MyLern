package com.androsor.string_char;

import static com.androsor.string_char.Data.enterFromConsole;
import static java.lang.Character.*;

/**
 * Find the number of numbers in the string.
 */
public class HomeTask4 {

    public static void main(String[] args) {

        String strInitial = enterFromConsole("Ведите исходную строку"); //https://github.com/androsor9.9/MyLern/pull/4/files

        System.out.printf("В исходной строке %d чисел/xbckf.", countNumbers(strInitial));
    }

    private static int countNumbers (String line) {
        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            if (isDigit(line.charAt(i))) {
                if (!isDigit(line.charAt(i + 1)) && (isDigit(line.charAt(i + 2)))) {
                    counter++;
                } else if (i == line.length() - 1 || !isDigit(line.charAt(i + 1))){

                    counter++;
                }

            }
        }
        return counter;
    }

    public static int findNumberOfNumbersInString(String strInitial) {
        int count = 0;
        for (int i = 0; i < strInitial.length(); i++) {
            if (isDigit(strInitial.charAt(i))) {
                for (int j = i; j < strInitial.length(); j++) {
                    if (isDigit(strInitial.charAt(j))) {
                        if (i==strInitial.length()-1){
                            count++;
                        }
                    }
                    if (!isDigit(strInitial.charAt(j)) && (strInitial.charAt(j)=='.' || strInitial.charAt(j)==',')) {
                        continue;
                    }
                    if (!isDigit(strInitial.charAt(j))) {
                        i = j;
                        count++;
                        break;
                    }
                }
            }
        }
         return count;
    }
}

