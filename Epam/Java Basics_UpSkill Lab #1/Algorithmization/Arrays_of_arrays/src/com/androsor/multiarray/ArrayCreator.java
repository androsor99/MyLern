package com.androsor.multiarray;

import java.util.Random;
import java.util.Scanner;

/**
 * Filling an array with random integers.
 */
public class ArrayCreator {

    public static int[][] fillArray (int arrayWidth) {
        int[][] array = new int[arrayWidth][arrayWidth];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (new Random().nextInt(100) - 50);
            }
        }
        return array;
    }

    public static int inputParameterArray() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int[][] standardFillArray(int arrayWidth) {
        int[][] array = new int[arrayWidth][arrayWidth];
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = count;
                count++;
            }
        }
        return array;
    }
}
