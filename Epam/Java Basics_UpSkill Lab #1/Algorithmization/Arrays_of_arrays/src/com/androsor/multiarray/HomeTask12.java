package com.androsor.multiarray;

import java.util.Arrays;

import static com.androsor.multiarray.ArrayCreator.fillArrayRandom;
import static com.androsor.multiarray.IOUtils.enterParameterFromConsole;
import static com.androsor.multiarray.IOUtils.printArrayInt;
import static java.lang.Math.abs;

/**
 * Sort matrix rows in ascending and descending order of element values.
 */
public class HomeTask12 {

    public static void main(String[] args) {

        System.out.print(" Введите разрядность массива length = ");
        int length = abs(enterParameterFromConsole());

        System.out.println(" Исходный массив");
        int[][] numbers = fillArrayRandom(length);
        printArrayInt(numbers);

        System.out.println(" Матрица с отсортированными по убыванию элементами строк: ");
        int[][] sortedArray_1 = sortRowsInDescendingOrder(numbers);
        printArrayInt(sortedArray_1);

        System.out.println(" Матрица с отсортированными по возростанию элементами строк: ");
        int[][] sortedArray_2 = sortRowsInAscendingOrder(numbers);
        printArrayInt(sortedArray_2);
    }

    private static int[][] sortRowsInAscendingOrder(int[][] numbers) {
        int[][] copyArray = Arrays.stream(numbers).map(int[]::clone).toArray(int[][]::new);
        for (int i = 0; i < copyArray.length; i++) {
            for (int j = 0; j < copyArray.length; j++) {
                for (int k = j + 1; k < copyArray.length; k++) {
                    if (copyArray[i][k] < copyArray[i][j]) {
                        int temp = copyArray[i][k];
                        copyArray[i][k] = copyArray[i][j];
                        copyArray[i][j] = temp;
                    }
                }
            }
        }
        return copyArray;
    }

    private static int[][] sortRowsInDescendingOrder(int[][] numbers) {
        int[][] copyArray = Arrays.stream(numbers).map(int[]::clone).toArray(int[][]::new);
        for (int i = 0; i < copyArray.length; i++) {
            for (int j = 0; j < copyArray.length; j++) {
                for (int k = j + 1; k < copyArray.length; k++) {
                    if (copyArray[i][k] > copyArray[i][j]) {
                        int temp = copyArray[i][k];
                        copyArray[i][k] = copyArray[i][j];
                        copyArray[i][j] = temp;
                    }
                }
            }
        }
        return copyArray;
    }
}
