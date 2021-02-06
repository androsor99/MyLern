package com.androsor.decomp;

import java.util.Scanner;

/**
 * Write a method (s) that checks whether the given three numbers are comprise.
 */

public class HomeTask6 {

    public static void main(String[] args){

        int number1;
        int number2;
        int number3;

        Scanner sc = new Scanner(System.in);
        System.out.print(" Введите первое число: ");
        number1 = sc.nextInt();
        System.out.print(" Введите второе число: ");
        number2 = sc.nextInt();
        System.out.print(" Введите третье число: ");
        number3 = sc.nextInt();

        if (primeNumber(number1, number2, number3)) {
            System.out.printf(" Числа %d, %d, %d являются взаимно простыми.", number1, number2, number3);
        } else {
            System.out.printf(" Числа %d, %d, %d не являются взаимно простыми.", number1, number2, number3);
        }
    }

    // Метод нахождения взаимно простых чисе.
    public static boolean primeNumber(int a, int b, int c) {
        // Числа являются взаимно простыми, если их НОД равен 1
        return HomeTask1.greatestCommonDivisor(HomeTask1.greatestCommonDivisor(a, b), c) == 1;
    }
}
