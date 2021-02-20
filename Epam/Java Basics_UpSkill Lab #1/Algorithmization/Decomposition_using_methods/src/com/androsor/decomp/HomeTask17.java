package com.androsor.decomp;

import static com.androsor.decomp.IOUtils.enterParameterFromConsoleInt;
import static java.lang.Math.abs;

/**
 * Write a program that determines the sum of n - digit numbers containing only odd digits. Also determine how many
 * even digits are in the found amount. To solve the problem, use decomposition.
 */
public class HomeTask17 {

    public static void main(String [] args) {

        int number = abs(enterParameterFromConsoleInt(" Введите число N = "));

        System.out.printf(" Количество действий над числом (согласно условию задачи) = %d ", getNumberOfActions(number));
    }

    private static int getNumberOfActions(int number) {
        int count = 0;
        while (number > 0) {
            number = number - getSumDigitsOfNumber(number);
            count++;
        }
        return count;
    }

    private static int getSumDigitsOfNumber(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
}
