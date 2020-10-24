package com.androsor.decomp;

/**
 * Write a method (s) for finding the greatest common divisor of four natural numbers.
 */

public class HomeTask2 {

    public static void main(String[] args) {
        int a; // вводимы натуральные числа.
        int b;
        int c;
        int d;

        a = HomeTask1.dataInput("Введите натуральное число a:");
        b = HomeTask1.dataInput("Введите натуральное число b:");
        c = HomeTask1.dataInput("Введите натуральное число c:");
        d = HomeTask1.dataInput("Введите натуральное число d:");

        int gcdABCD = HomeTask1.greatestCommonDivisor(HomeTask1.greatestCommonDivisor(HomeTask1.greatestCommonDivisor(a, b), c), d);

        System.out.printf(" НОД(%d, %d, %d, %d) = %d", a, b, c, d, gcdABCD);
    }
}
