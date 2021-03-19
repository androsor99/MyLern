package com.androsor.decomp;

import java.util.Random;

import static java.lang.Math.abs;

public class Helper {

    public static int getGreatestCommonDivisor(int a, int b) { // Метод нахождения наибольшего общего делителя (НОД/GSD(Greatest common divisor))
        if (b == 0) {
            return abs(a);
        }
        return getGreatestCommonDivisor(b, a % b);
    }

    public static int[] fillArray(int length) {
        int[] numbers = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            numbers[i] = 100 - (random.nextInt(200));
        }
        return numbers;
    }

    public static boolean isPrime(int... value) {
        return processGreatestCommonDivisorMulti(value) == 1;
    }

    public static int processGreatestCommonDivisorMulti(int... value) {
        int result = getGreatestCommonDivisor(value[0], value[1]);
        for (int i = 2; i < value.length; i++){
            result = getGreatestCommonDivisor(value[i], result);
        }
        return result;
    }
}
