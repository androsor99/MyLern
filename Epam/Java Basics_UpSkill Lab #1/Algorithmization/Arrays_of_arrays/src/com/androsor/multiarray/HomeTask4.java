package com.androsor.multiarray;

import static com.androsor.multiarray.ArrayPrinter.*;

/**
 * Form a square matrix of order n according to a given pattern (n is even):
 * 1 2 3 ... n
 * n n-1 n-2 ... 1
 * 1 2 3 ... n
 * n n-1 n-2 ... 1
 * ...............
 * n n-1 n-2 ... 1
 */
public class HomeTask4 {

    public static void main(String[] args) {

        int arrayWidth; // разрядность матрицы

        System.out.print(" Введите разрядность массива arrayWidth = ");
        arrayWidth = ArrayCreator.inputParameter();

        System.out.println(" Исходная матрица:");
        int[][] myArray = fillArray(arrayWidth);
        printArrayInt(myArray);
    }

    private static int[][] fillArray(int arrayWidth) {
        int[][] array = new int[arrayWidth][arrayWidth];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i % 2 == 0) {
                    array[i][j] = j + 1;
                } else {
                    array[i][j] = array.length - j;
                }
            }
        }
        return array;
    }
}
