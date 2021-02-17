package com.androsor.multiarray;

/**
 * Print array.
 */
public class ArrayPrinter {

    public  static void printArrayInt (int [][] numbers) {
        System.out.println("-----------------------------------------------");
        for (int[] items : numbers) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.printf("%7d", items[j]);
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------");
    }

    public  static void printArrayDouble (double [][] numbers) {
        System.out.println("----------------------------------------------");
        for (double[] items : numbers) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.printf("%9.3f", items[j]);
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------");
    }
}
