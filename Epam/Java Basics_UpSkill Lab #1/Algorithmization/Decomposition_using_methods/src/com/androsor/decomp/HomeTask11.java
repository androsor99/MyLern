package com.androsor.decomp;

import static com.androsor.decomp.Data.inputDataInt;

/**
 * Write a method (s) that determines which of the given two numbers has more digits.
 */
public class HomeTask11 {

    public static void main(String[] args) {

        int number1 = inputDataInt(" Введите первое число: ");
        int number2 = inputDataInt(" Введите второе число: ");

        printDigitsOfNumber(number1, number2);
    }

    public static int getNumberOfDigits(int number) {
        int value = 0;
        while (number != 0) {
            number = number / 10;
            value++;
        }
        return value;
    }

    public static void printDigitsOfNumber( int number1, int number2) {
        int counter1 = getNumberOfDigits(number1);
        int counter2 = getNumberOfDigits(number2);
        if (counter1 > counter2) {
            System.out.println(" В первом числе  цифр больше ");
        }
        if (counter1 < counter2) {
            System.out.println(" Во втором числе цифр больше");
        } else {
            System.out.println(" Кол-во  цифр в каждом числе одинаково");
        }
    }
}