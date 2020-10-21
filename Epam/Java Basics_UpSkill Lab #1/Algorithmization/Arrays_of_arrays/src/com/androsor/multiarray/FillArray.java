package com.androsor.multiarray;

import java.util.Random;

/**
 * Filling an array with random integers.
 */

public class FillArray {

    public  static void fillArray (int [][] array) {

        Random random = new Random ();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = random.nextInt(100);
            }
        }
    }

    public  static void standardFillArray(int [][] array) {

        int count = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = count;
                count++;
            }
        }
    }
}
