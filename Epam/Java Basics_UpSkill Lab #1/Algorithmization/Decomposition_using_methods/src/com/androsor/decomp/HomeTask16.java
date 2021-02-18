package com.androsor.decomp;

import static com.androsor.decomp.Data.inputDataInt;
import static java.lang.Math.abs;

/**
 * Write a program that determines the sum of n - digit numbers containing only odd digits. Also determine how many
 * even digits are in the found amount. To solve the problem, use decomposition.
 */
public class HomeTask16 {

    public static void main(String [] args) {

        int number = abs(inputDataInt(" Введите число N = "));

        int sum = getSumElementsArray(fillArray(number));

        System.out.printf(" Сумма нечетных цифр числа равна %d = ", sum);

        System.out.printf(" Колличество четных цифр в найденной сумме: %d", getNumberOfEvenDigits(sum));
    }

    public static int getSumElementsArray(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                sum = sum + number;
            }
        }
        return sum;
    }

    private static int[] fillArray(int number) {
        int[] numbers = new int[getNumberOfDigits(number)];
        int temp = number;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = temp % 10;
            temp = temp / 10;
        }
        return numbers;
    }

    private static int getNumberOfDigits(int number) {
        int value = 0;
        while (number != 0) {
            number = number / 10;
            value++;
        }
        return value;
    }

    public static int getNumberOfEvenDigits(int number) {
        int[] numbers = new int[getNumberOfDigits(number)];
        int temp = number;
        int countEven = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = temp % 10;
            if (numbers[i] % 2 == 0) {
                countEven++;
            }
            temp = temp / 10;
        }
        return countEven;
    }
}
