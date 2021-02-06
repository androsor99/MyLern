package com.androsor.decomp;

/**
 * A natural number with n digits is called an Armstrong number if the sum of its digits raised to the power n is equal
 * to the number itself. Find all Armstrong numbers from 1 to k. To solve the problem, use decomposition.
 */

public class HomeTask14 {

    public static void main(String[] args) {

        int k = HomeTask1.dataInput(" Введите число К = ");
        while (k < 0) {
            System.out.println(" Число должно быть положительным!");
            k = HomeTask1.dataInput(" Введите число К = ");
        }

        System.out.printf(" В промежутке от 1 до %d существуют следующие числа Армстронга: \n", k);
        showArmstrongNumber(k);
    }

    // Вывод числа Армстронга.
    public static void showArmstrongNumber ( int k) {

        for (int i = 1; i < k ; i++) {
            if (isArmstrongNumber(i)) {
                System.out.println(i);
            }
        }
    }

    // Метод нахождения количества цифр у числа.
    public static int findCounter(int number) {

        int counter = 0;
        while (number != 0) {
            counter++;
            number = number / 10;
        }
        return counter;
    }

    // Метод проверки является ли число числом Армстронга.
    public static boolean isArmstrongNumber(int number) {

        int digitSum = 0;
        int pow = findCounter(number);
        int numberBuff = number;

        while (numberBuff != 0) {
            int digit = numberBuff % 10;
            numberBuff = numberBuff / 10;
            digitSum += (int) Math.pow(digit, pow);
        }

        return number == digitSum;
    }
}
