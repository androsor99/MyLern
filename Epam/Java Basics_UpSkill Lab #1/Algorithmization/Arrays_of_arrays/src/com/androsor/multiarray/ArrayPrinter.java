package com.androsor.multiarray;

/**
 * Print array.
 */

public class ArrayPrinter {

    public  static void printArrayInt (int [][] array) {
        System.out.println("-----------------------------------------------");
        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------");
    }

    public  static void printArrayDouble (double [][] array) {
        System.out.println("----------------------------------------------");
        for (double[] doubles : array) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("%9.3f", doubles[j]);
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------");
    }
}
