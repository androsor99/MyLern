package com.androsor.multiarray;

/**
 * Print array.
 */

public class PrintArray {

    public  static void printArrayInt (int [][] array) {

        System.out.println("-----------------------------------------------");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------");
    }

    public  static void printArrayDouble (double [][] array) {

        System.out.println("----------------------------------------------");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("%9.3f",array[i][j]);
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------");
    }


}
