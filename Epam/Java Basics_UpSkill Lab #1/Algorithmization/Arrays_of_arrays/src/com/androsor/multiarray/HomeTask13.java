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
        arrayWidth = ArrayCreator.inputParameterArray();

        System.out.println(" Исходный массив");
        int [][] myArray = fillArray(arrayWidth);
        printArrayInt(myArray);

        System.out.println(" Матрица с отсортированными по убыванию элементами столбцов: ");
        int[][] sortArray1 = sortColumnsInDescendingOrder(myArray);
        printArrayInt(sortArray1);

        System.out.println(" Матрица с отсортированными по возростанию элементами столбцов: ");
        int[][] sortArray2 = sortColumnsInAscendingOrder(myArray);
        printArrayInt(sortArray2);
    }

    private static int[][] sortColumnsInAscendingOrder(int[][] array) {
        int[][] copyArray = Arrays.stream(array).map(int[]::clone).toArray(int[][]::new);
        for (int j = 0; j < copyArray.length; j++) {
            for (int i = 0; i < copyArray.length; i++) {
                for (int k = i + 1; k < copyArray.length; k++) {
                    if (copyArray[k][j] < copyArray[i][j]) {
                        int temp = copyArray[k][j];
                        copyArray[k][j] = copyArray[i][j];
                        copyArray[i][j] = temp;
                    }
                }
            }
        }
        return copyArray;
    }

    private static int[][] sortColumnsInDescendingOrder(int[][] array) {
        int[][] copyArray = Arrays.stream(array).map(int[]::clone).toArray(int[][]::new);
        for (int j = 0; j < copyArray.length; j++) {
            for (int i = 0; i < copyArray.length; i++) {
                for (int k = i + 1; k < copyArray.length; k++) {
                    if (copyArray[k][j] > copyArray[i][j]) {
                        int temp = copyArray[k][j];
                        copyArray[k][j] = copyArray[i][j];
                        copyArray[i][j] = temp;
                    }
                }
            }
        }
        return copyArray;
    }
}
