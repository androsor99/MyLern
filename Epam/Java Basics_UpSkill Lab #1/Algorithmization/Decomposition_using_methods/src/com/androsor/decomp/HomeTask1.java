package com.androsor.decomp;

import java.util.Scanner;

/**
 * Write a method (methods) for finding the greatest common divisor and the least common multiple of two natural numbers:
 * LCM(a * b) = a * b / GCD(a, b)
 */

public class HomeTask1 {

    public static void main(String[] args) {
        int a; // вводимы натуральные числа.
        int b;

        a = dataInput("Введите натуральное число a = ");
        b = dataInput("Введите натуральное число b = ");

        System.out.println(" НОД(" + a + "," + b + ") = " + greatestCommonDivisor(a, b));
        System.out.println(" НОК(" + a + "," + b + ") = " + leastCommonMultiple(a, b));
    }

    // Метод ввода данных.
    public  static  int dataInput(String massage) {
        System.out.print(massage);
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println(" Введенные данные не являются натуральными числами. Повторите ввод.");
        }
        return sc.nextInt();
    }

    // Метод нахождения наибольшего общего делителя (НОД/GSD(Greatest common divisor))
    public static int greatestCommonDivisor(int a, int b) {
        if (b == 0) {
            return (Math.abs(a));
        }
        return greatestCommonDivisor(b, a % b);
    }

    // Метод нахождения наименьшего общего кратного (НОК/LSM(Least common multiple)
    public static int leastCommonMultiple(int a, int b) {
        return (a * b / greatestCommonDivisor(a, b));
    }
}
