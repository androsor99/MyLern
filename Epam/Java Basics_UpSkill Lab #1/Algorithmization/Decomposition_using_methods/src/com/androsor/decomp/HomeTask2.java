package com.androsor.decomp;

import static com.androsor.decomp.Helper.getGreatestCommonDivisor;
import static com.androsor.decomp.IOUtils.enterParameterFromConsoleInt;

/**
 * Write a method (s) for finding the greatest common divisor of four natural numbers.
 */
public class HomeTask2 {

    public static void main(String[] args) {

        int a = enterParameterFromConsoleInt("Введите натуральное число a = ");
        int b = enterParameterFromConsoleInt("Введите натуральное число b = ");
        int c = enterParameterFromConsoleInt("Введите натуральное число c = ");
        int d = enterParameterFromConsoleInt("Введите натуральное число d = ");

        int gcdABCD = processGreatestCommonDivisorMulti(a, b, c, d);

        printGreatestCommonDivisor(a, b, c, d, gcdABCD);
    }

    private static int processGreatestCommonDivisorMulti(int... value) {
        int result = getGreatestCommonDivisor(value[0], value[1]);
        for (int i = 2; i < value.length; i++){
            result = getGreatestCommonDivisor(value[i], result);
        }
        return result;
    }

    private static void printGreatestCommonDivisor(int gcd, int... value) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("НОД (");
        for (int i = 0; i < value.length - 1; i++) {
            stringBuilder.append(value[i]);
            stringBuilder.append(", ");
        }
        stringBuilder.append("\b\b) = ");
        stringBuilder.append(gcd);
        System.out.println(stringBuilder.toString());
    }
}
