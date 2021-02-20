package com.androsor.decomp;

import static com.androsor.decomp.IOUtils.enterParameterFromConsoleInt;
import static java.lang.Math.abs;

/**
 * Write a method (methods) for finding the greatest common divisor and the least common multiple of two natural numbers:
 * LCM(a * b) = a * b / GCD(a, b)
 */
public class HomeTask1 {

    public static void main(String[] args) {

        int a = enterParameterFromConsoleInt("Введите натуральное число a = ");
        int b = enterParameterFromConsoleInt("Введите натуральное число b = ");

        System.out.println(" НОД (" + a + "," + b + ") = " + getGreatestCommonDivisor(a, b));
        System.out.println(" НОК (" + a + "," + b + ") = " + getLeastCommonMultiple(a, b));
    }

    private static int getGreatestCommonDivisor(int a, int b) { // Метод нахождения наибольшего общего делителя (НОД/GSD(Greatest common divisor))
        if (b == 0) {
            return (abs(a));
        }
        return getGreatestCommonDivisor(b, a % b);
    }

    private static int getLeastCommonMultiple(int a, int b) { // Метод нахождения наименьшего общего кратного (НОК/LSM(Least common multiple)
        return (a * b / getGreatestCommonDivisor(a, b));
    }
}
