package com.androsor.multiarray;

import java.util.Random;

/**
 * Filling an array.
 */
public class ArrayCreator {

    public static int[][] fillArrayRandom(int length) {
        int[][] numbers = new int[length][length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                numbers[i][j] = (random.nextInt(100) - 50);
            }
        }
        return numbers;
    }

    public static int[][] fillArrayStandard(int length) {
        int[][] numbers = new int[length][length];
        int number = 1;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                numbers[i][j] = number;
                number++;
            }
        }
        return numbers;
    }
}
