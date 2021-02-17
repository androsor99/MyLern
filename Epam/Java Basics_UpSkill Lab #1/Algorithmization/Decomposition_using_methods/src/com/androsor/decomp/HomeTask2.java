package com.androsor.decomp;

import static com.androsor.decomp.Data.inputDataInt;
import static java.lang.Math.abs;

/**
 * Write a method (s) for finding the greatest common divisor of four natural numbers.
 */
public class HomeTask2 {

    public static void main(String[] args) {

        int a = inputDataInt("Введите натуральное число a = ");
        int b = inputDataInt("Введите натуральное число b = ");
        int c = inputDataInt("Введите натуральное число c = ");
        int d = inputDataInt("Введите натуральное число d = ");

        int gcdABCD = getGreatestCommonDivisor(getGreatestCommonDivisor(getGreatestCommonDivisor(a, b), c), d);

        printGreatestCommonDivisor(a, b, c, d, gcdABCD);
    }

    private static int getGreatestCommonDivisor(int a, int b) { // Метод нахождения наибольшего общего делителя (НОД/GSD(Greatest common divisor))
        if (b == 0) {
            return (abs(a));
        }
        return getGreatestCommonDivisor(b, a % b);
    }

    private static void printGreatestCommonDivisor(int a, int b, int c, int d, int gcdABCD) {
        System.out.printf(" НОД (%d, %d, %d, %d) = %d", a, b, c, d, gcdABCD);
    }
}
