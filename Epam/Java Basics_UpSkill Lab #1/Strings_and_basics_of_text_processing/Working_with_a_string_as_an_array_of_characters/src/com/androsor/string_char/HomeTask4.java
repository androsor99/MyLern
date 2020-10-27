package com.androsor.string_char;

/**
 * Find the number of numbers in the string.
 */

public class HomeTask4 {

    public static void main(String[] args) {

        String strInitial;

        strInitial = HomeTask1.enterFromConsole("Ведите исходную строку");

        System.out.printf("В исходной строке %d чисел.", findingNumberNumbersString(strInitial));
    }

    // Метод нахождения количества чисел в строке.
    public static int findingNumberNumbersString(String strInitial) {

        int count;
        count = 0;

        for (int i = 0; i < strInitial.length(); i++) {

            if (Character.isDigit(strInitial.charAt(i))) {

                for (int j = i; j<strInitial.length(); j++) {

                    if (Character.isDigit(strInitial.charAt(j))) {

                        if (i==strInitial.length()-1){
                            count++;
                        }
                    }

                    if (!Character.isDigit(strInitial.charAt(j)) && (strInitial.charAt(j)=='.' || strInitial.charAt(j)==',')) {
                        continue;
                    }

                    if (!Character.isDigit(strInitial.charAt(j))) {
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

