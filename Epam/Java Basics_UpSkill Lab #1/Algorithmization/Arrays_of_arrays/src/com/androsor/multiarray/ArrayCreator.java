package com.androsor.multiarray;

import java.util.Random;
import java.util.Scanner;

/**
 * Filling an array with random integers.
 */

public class ArrayCreator {

    public static int[][] fillArray (int n) {
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = new Random().nextInt(100);
            }
        }
        return array;
    }

    public static int inputParameter() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int[][] standardFillArray(int n) {
        int[][] array = new int[n][n];
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
