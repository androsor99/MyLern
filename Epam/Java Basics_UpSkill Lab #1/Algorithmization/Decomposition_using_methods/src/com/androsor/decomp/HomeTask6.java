package com.androsor.decomp;

import static com.androsor.decomp.Helper.getGreatestCommonDivisor;
import static com.androsor.decomp.IOUtils.enterParameterFromConsoleInt;

/**
 * Write a method (s) that checks whether the given three numbers are comprise.
 */
public class HomeTask6 {

    public static void main(String[] args){

        int number1 = enterParameterFromConsoleInt(" Введите первое число: ");
        int number2 = enterParameterFromConsoleInt(" Введите второе число: ");
        int number3 = enterParameterFromConsoleInt(" Введите третье число: ");

        printResultCheckNumbers(number1, number2, number3);
    }

    private static void printResultCheckNumbers(int number1, int number2, int number3) {
        if (isPrime(number1, number2, number3)) {
            System.out.printf(" Числа %d, %d, %d являются взаимно простыми.", number1, number2, number3);
        } else {
            System.out.printf(" Числа %d, %d, %d не являются взаимно простыми.", number1, number2, number3);
        }
    }

    private static boolean isPrime(int a, int b, int c) { // Числа являются взаимно простыми, если их НОД равен 1
        return getGreatestCommonDivisor(getGreatestCommonDivisor(a, b), c) == 1;
    }
}
