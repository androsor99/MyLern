package com.androsor.multiarray;

import java.util.Arrays;

import static com.androsor.multiarray.ArrayCreator.fillArray;
import static com.androsor.multiarray.ArrayPrinter.printArrayInt;

/**
 * Sort matrix rows in ascending and descending order of element values.
 */
public class HomeTask12 {

    public static void main(String[] args) {

        int arrayWidth; // разрядность матрицы

        System.out.print(" Введите разрядность массива arrayWidth = ");
        arrayWidth = ArrayCreator.inputParameterArray();

        System.out.println(" Исходный массив");
        int [][] myArray = fillArray(arrayWidth);
        printArrayInt(myArray);


        System.out.println(" Матрица с отсортированными по убыванию элементами строк: ");
        int[][] sortArray1 = Arrays.stream(myArray).map(int[]::clone).toArray(int[][]::new);
        sortRowsInDescendingOrder(sortArray1);
        printArrayInt(sortArray1);

        System.out.println(" Матрица с отсортированными по возростанию элементами строк: ");
        int[][] sortArray2 = Arrays.stream(myArray).map(int[]::clone).toArray(int[][]::new);
        sortRowsInAscendingOrder(sortArray2);
        printArrayInt(sortArray2);
    }

    private static void sortRowsInAscendingOrder(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i][k] < array[i][j]) {
                        int temp = array[i][k];
                        array[i][k] = array[i][j];
                        array[i][j] = temp;
                    }
                }
            }
        }
    }

    private static void sortRowsInDescendingOrder(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i][k] > array[i][j]) {
                        int temp = array[i][k];
                        array[i][k] = array[i][j];
                        array[i][j] = temp;
                    }
                }
            }
        }
    }
}
