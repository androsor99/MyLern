package com.androsor.decomp;

import static com.androsor.decomp.Data.inputDataInt;
import static java.lang.Math.pow;

/**
 * A natural number with n digits is called an Armstrong number if the sum of its digits raised to the power n is equal
 * to the number itself. Find all Armstrong numbers from 1 to k. To solve the problem, use decomposition.
 */
public class HomeTask14 {

    public static void main(String[] args) {

        int numberK = getNumber(inputDataInt(" Введите число К = "));

        System.out.printf(" В промежутке от 1 до %d существуют следующие числа Армстронга: \n", numberK);
        printArmstrongNumber(numberK);
    }

    private static int getNumber(int number) {
        while (number < 0) {
            System.out.println(" Число должно быть положительным!");
            number = inputDataInt(" Введите число К = ");
        }
        return number;
    }

    private static void printArmstrongNumber(int number) {
        for (int i = 1; i < number ; i++) {
            if (isArmstrongNumber(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isArmstrongNumber(int number) { // Метод проверки является ли число числом Армстронга.
        int sumDigits = 0;
        int pow = getNumberDigits(number);
        int buffer = number;
        while (buffer != 0) {
            int digit = buffer % 10;
            buffer = buffer / 10;
            sumDigits += (int) pow(digit, pow);
        }
        return number == sumDigits;
    }

    private static int getNumberDigits(int number) { // Метод нахождения количества цифр у числа.
        int counter = 0;
        while (number != 0) {
            number = number / 10;
            counter++;
        }
        return counter;
    }
}
