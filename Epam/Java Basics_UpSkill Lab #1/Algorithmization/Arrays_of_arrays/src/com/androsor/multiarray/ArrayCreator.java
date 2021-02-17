package com.androsor.multiarray;

import java.util.Random;
import java.util.Scanner;

/**
 * Filling an array with random integers.
 */
public class ArrayCreator {

    public static int[][] fillArray (int length) {
        int[][] numbers = new int[length][length];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                numbers[i][j] = (random.nextInt(100) - 50);
            }
        }
        return numbers;
    }

    public static int[][] fillArrayStandard(int length) {
        int[][] numbers = new int[length][length];
        int number = 1;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                numbers[i][j] = number;
                number++;
            }
        }
        return numbers;
    }

    public static int inputParameterArray() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
