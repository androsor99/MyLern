package com.androsor.multiarray;

import static com.androsor.multiarray.ArrayCreator.fillArrayRandom;
import static com.androsor.multiarray.IOUtils.copyArrayInt;
import static com.androsor.multiarray.IOUtils.enterParameterFromConsole;
import static com.androsor.multiarray.IOUtils.printArrayInt;
import static java.lang.Math.abs;

/**
 * Sort matrix columns in ascending and descending order of element values.
 */
public class HomeTask13 {

    public static void main(String[] args) {

        System.out.print(" Введите разрядность массива length = ");
        int length = abs(enterParameterFromConsole());

        System.out.println(" Исходный массив");
        int[][] numbers = fillArrayRandom(length);
        printArrayInt(numbers);

        System.out.println(" Матрица с отсортированными по убыванию элементами столбцов: ");
        int[][] sortedArrayDescendingOrder = sortColumnItems(numbers, true);
        printArrayInt(sortedArrayDescendingOrder);

        System.out.println(" Матрица с отсортированными по возростанию элементами столбцов: ");
        int[][] sortedArrayAscendingOrder = sortColumnItems(numbers, false);
        printArrayInt(sortedArrayAscendingOrder);
    }

    private static int[][] sortColumnItems(int[][] numbers, boolean sortSelection) {
        int[][] copiedArray = copyArrayInt(numbers);
        for (int j = 0; j < copiedArray[0].length; j++) {
            for (int i = 0; i < copiedArray.length; i++) {
                for (int k = i + 1; k < copiedArray.length; k++) {
                    if (sortSelection ? (copiedArray[k][j] > copiedArray[i][j]) : (copiedArray[k][j] < copiedArray[i][j])) {
                        int temp = copiedArray[k][j];
                        copiedArray[k][j] = copiedArray[i][j];
                        copiedArray[i][j] = temp;
                    }
                }
            }
        }
        return copiedArray;
    }
}
