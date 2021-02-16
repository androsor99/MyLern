package com.androsor.decomp;

import static java.lang.Math.abs;
import static com.androsor.decomp.Data.inputDataInt;

/**
 * Write a method (s) that checks whether the given three numbers are comprise.
 */
public class HomeTask6 {

    public static void main(String[] args){

        int number1 = inputDataInt(" Введите первое число: ");
        int number2 = inputDataInt(" Введите второе число: ");
        int number3 = inputDataInt(" Введите третье число: ");

        printResultCheckNumbers(number1, number2, number3);
    }

    private static int getGreatestCommonDivisor(int a, int b) { // Метод нахождения наибольшего общего делителя (НОД/GSD(Greatest common divisor))
        if (b == 0) {
            return (abs(a));
        }
        return getGreatestCommonDivisor(b, a % b);
    }

    private static boolean isPrime(int a, int b, int c) { // Числа являются взаимно простыми, если их НОД равен 1
        return getGreatestCommonDivisor(getGreatestCommonDivisor(a, b), c) == 1;
    }

    private static void printResultCheckNumbers(int number1, int number2, int number3) {
        if (isPrime(number1, number2, number3)) {
            System.out.printf(" Числа %d, %d, %d являются взаимно простыми.", number1, number2, number3);
        } else {
            System.out.printf(" Числа %d, %d, %d не являются взаимно простыми.", number1, number2, number3);
        }
    }
}
