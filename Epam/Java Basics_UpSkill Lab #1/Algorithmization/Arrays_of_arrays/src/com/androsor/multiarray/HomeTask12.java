package com.androsor.multiarray;

import static com.androsor.multiarray.ArrayCreator.fillArrayRandom;
import static com.androsor.multiarray.IOUtils.copyArrayInt;
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
        int[][] sortedArrayDescendingOrder = sortRowItems(numbers, true);
        printArrayInt(sortedArrayDescendingOrder);

        System.out.println(" Матрица с отсортированными по возростанию элементами строк: ");
        int[][] sortedArrayAscendingOrder = sortRowItems(numbers, false);
        printArrayInt(sortedArrayAscendingOrder);
    }

    private static int[][] sortRowItems(int[][] numbers, boolean sortSelection) {
        int[][] copiedArray = copyArrayInt(numbers);
        for (int i = 0; i < copiedArray.length; i++) {
            for (int j = 0; j < copiedArray[i].length; j++) {
                for (int k = j + 1; k < copiedArray[i].length; k++) {
                    if (isReplace(copiedArray[i][k], copiedArray[i][j], sortSelection)) {
                        int temp = copiedArray[i][k];
                        copiedArray[i][k] = copiedArray[i][j];
                        copiedArray[i][j] = temp;
                    }
                }
            }
        }
        return copiedArray;
    }

    private static boolean isReplace(int numberFrom, int numberTo, boolean sortSelection) {
        if (sortSelection) {
            return numberFrom > numberTo;
        } else {
            return numberFrom < numberTo;
        }
    }
}
