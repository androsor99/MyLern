package com.androsor.sort;

import java.util.Random;

/**
 * Creates an array and fills it with random numbers.
 */
public class ArrayCreator {

    public static int[] fillArrayRandom(final int length) {
        int[] numbers = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            numbers[i] = random.nextInt(100);
        }
        return numbers;
    }
}
