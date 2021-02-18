package com.androsor.decomp;

import static com.androsor.decomp.Data.inputDataInt;
import static java.lang.Math.abs;

/**
 * Write a program that determines the sum of n - digit numbers containing only odd digits. Also determine how many
 * even digits are in the found amount. To solve the problem, use decomposition.
 */
public class HomeTask17 {

    public static void main(String [] args) {

        int number = abs(inputDataInt(" Введите число N = "));

        System.out.printf(" Количество действий над числом (согласно условию задачи) = %d ", getNumberOfActions(number));
    }

    private static int getNumberOfActions(int number) {
        int buffer = number;
        int count = 0;
        while (buffer > 0) {
            buffer = buffer - getSum(buffer);
            count++;
        }
        return count;
    }

    private static int getSum(int number) {
        int[] numbers = new int[getNumberOfDigits(number)];
        int sum = 0;
        int temp = number;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = temp % 10;
            sum += numbers[i];
            temp = temp / 10;
        }
        return sum;
    }

    private static int getNumberOfDigits(int number) {
        int value = 0;
        while (number != 0) {
            number = number / 10;
            value++;
        }
        return value;
    }
}
