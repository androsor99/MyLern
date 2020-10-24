package com.androsor.decomp;

import java.util.Scanner;

/**
 * Write a method (s) for calculating the sum of the factorials of all odd numbers from 1 to 9.
 */

public class HomeTask7 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print(" Введите значение числа для которого нужно посчитать сумму всех нечетных чисел в промежутке от 1 до N = ");
        n = sc.nextInt();
        System.out.println(" Сумма факториалов всех нечетных чисел от 1 до " + n + " равен " + sumFactorial(n));
    }

    // Метод нахождения суммы факториалов.
    public static long sumFactorial(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += factorial(i);
        }
        return sum;
    }

    // Метод нахождения факториала.
    public static long factorial(int a) {
        long f = 1;
        for (int i = 1; i <= a; i++) {
            f *= i;
        }
        return f;
    }
}


