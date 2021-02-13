package com.androsor.multiarray;

import java.util.Arrays;

import static com.androsor.multiarray.ArrayCreator.fillArray;
import static com.androsor.multiarray.ArrayPrinter.printArrayInt;

/**
 * Sort matrix columns in ascending and descending order of element values.
 */
public class HomeTask13 {

    public static void main(String[] args) {

        int arrayWidth; // разрядность матрицы

        System.out.print(" Введите разрядность массива arrayWidth = ");
        arrayWidth = ArrayCreator.inputParameter();

        System.out.println(" Исходный массив");
        int [][] myArray = fillArray(arrayWidth);
        printArrayInt(myArray);


        System.out.println(" Матрица с отсортированными по убыванию элементами столбцов: ");
        int[][] sortArray1 = Arrays.stream(myArray).map(int[]::clone).toArray(int[][]::new);
        sortColumnsInDescendingOrder(sortArray1);
        printArrayInt(sortArray1);

        System.out.println(" Матрица с отсортированными по возростанию элементами столбцов: ");
        int[][] sortArray2 = Arrays.stream(myArray).map(int[]::clone).toArray(int[][]::new);
        sortColumnsInAscendingOrder(sortArray2);
        printArrayInt(sortArray2);
    }

    private static void sortColumnsInAscendingOrder(int[][] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length; i++) {
                for (int k = i + 1; k < array.length; k++) {
                    if (array[k][j] < array[i][j]) {
                        int temp = array[k][j];
                        array[k][j] = array[i][j];
                        array[i][j] = temp;
                    }
                }
            }
        }
    }


    private static void sortColumnsInDescendingOrder(int[][] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length; i++) {
                for (int k = i + 1; k < array.length; k++) {
                    if (array[k][j] > array[i][j]) {
                        int temp = array[k][j];
                        array[k][j] = array[i][j];
                        array[i][j] = temp;
                    }
                }
            }
        }
    }
}