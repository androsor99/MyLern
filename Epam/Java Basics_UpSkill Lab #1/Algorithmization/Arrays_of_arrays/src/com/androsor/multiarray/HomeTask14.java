package com.androsor.multiarray;

import java.util.Random;

import static com.androsor.multiarray.ArrayCreator.inputParameter;
import static com.androsor.multiarray.ArrayPrinter.printArrayInt;

/**
 * Generate a random m x n matrix consisting of zeros and ones, with the number of ones in each column being equal
 * to the column number.
 */
public class HomeTask14 {

    public static void main(String[] args) {

        int arrayWidth; // разрядность матрицы

        System.out.print(" Введите разрядность массива arrayWidth = ");
        arrayWidth = inputParameter();

        System.out.println(" Исходная матрица:");
        int[][] myArray = fillArray(arrayWidth);
        printArrayInt(myArray);
    }

    private static int[][] fillArray(int arrayWidth) {
        int[][] array = new int[arrayWidth][arrayWidth];
        for (int j = 0; j < array.length; j++) {
            int count0 = 0; // счетчик встреч 0
            int count1 = 0; // счетчик встреч 1
            for (int i = 0; i < array.length; i++) {
                array[i][j] = new Random ().nextInt(2);
                if (array[i][j] == 1) {
                    count1++;
                } else {
                    count0++;
                }
                if ((array[i][j] == 1) && (count1 > j + 1)) {
                    array[i][j] = 0;
                }
                if ((array[i][j] == 0) && (count0) >= (array.length - j)) {
                    array[i][j] = 1;
                }
            }
        }
        return array;
    }
}
