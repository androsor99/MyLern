package com.androsor.decomp;

import java.util.Scanner;

/**
 * Two primes are called "twins" if they differ from each other by 2 (for example, 41 and 43). Find and print all pairs
 * of "twins" from the segment [n, 2n], where n is a given natural number greater than 2.
 * Use decomposition to solve the problem.
 */

public class HomeTask13 {

    public static void main(String[] args) {

        int n;

        n = dataInput(" Введите число N = ");
        System.out.printf(" На отрезке от %d до %d существуют следующие пары: \n", n, 2 * n);
        for (int i = n; i < (n * 2) - 2; i++) {
            if (primeNumber(i)) {
                System.out.printf(" Пара \"чисел-близнецов\": %d %d  \n", i, (i + 2));
            }
        }
    }

    // Метод ввода данных.
    public static int dataInput(String massage) {
        System.out.print(massage);
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println(" Введенные данные не являются натуральными числами. Повторите ввод.");
        }
        return sc.nextInt();
    }

    // Метод проверки на простоту.
    public static boolean primeNumber(int k) {
        for (int j = 2; j < Math.sqrt(k)+1; j++) {
            if (k % j == 0) {
                return false;
            }
        }
        return true;
    }
}
