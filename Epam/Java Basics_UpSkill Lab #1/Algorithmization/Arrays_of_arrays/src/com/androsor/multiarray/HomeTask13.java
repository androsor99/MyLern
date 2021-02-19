package com.androsor.multiarray;

import static com.androsor.multiarray.ArrayCreator.fillArrayRandom;
import static com.androsor.multiarray.IOUtils.enterParameterFromConsole;
import static com.androsor.multiarray.IOUtils.printArrayInt;
import static java.lang.Math.abs;
import static java.util.Arrays.stream;

/**
 * Sort matrix columns in ascending and descending order of element values.
 */
public class HomeTask13 {

    public static void main(String[] args) {

        System.out.print(" Введите разрядность массива length = ");
        int length =abs(enterParameterFromConsole());

        System.out.println(" Исходный массив");
        int [][] numbers = fillArrayRandom(length);
        printArrayInt(numbers);

        System.out.println(" Матрица с отсортированными по убыванию элементами столбцов: ");
        int[][] sortedArray_1 = sortColumnsInDescendingOrder(numbers);
        printArrayInt(sortedArray_1);

        System.out.println(" Матрица с отсортированными по возростанию элементами столбцов: ");
        int[][] sortedArray_2 = sortColumnsInAscendingOrder(numbers);
        printArrayInt(sortedArray_2);
    }

    private static int[][] sortColumnsInAscendingOrder(int[][] numbers) {
        int[][] copyArray = stream(numbers).map(int[]::clone).toArray(int[][]::new);
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

    private static int[][] sortColumnsInDescendingOrder(int[][] numbers) {
        int[][] copyArray = stream(numbers).map(int[]::clone).toArray(int[][]::new);
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
