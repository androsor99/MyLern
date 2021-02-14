package com.androsor.multiarray;

import static com.androsor.multiarray.ArrayCreator.fillArray;
import static com.androsor.multiarray.ArrayPrinter.printArrayInt;

/**
 * A matrix of non-negative numbers is given. Calculate the sum of the items in each column. Determine which
 * the column contains the maximum amount.
 */
public class HomeTask9 {

    public static void main (String[] args) {

        int arrayWidth; // разрядность матрицы

        System.out.print(" Введите разрядность массива arrayWidth = ");
        arrayWidth = ArrayCreator.inputParameterArray();

        System.out.println(" Исходный массив");
        int [][] myArray = fillArray(arrayWidth);
        printArrayInt(myArray);

        printSumOfColumnElements(myArray);
    }

    private static void printSumOfColumnElements(int[][] array) {
        int maxSumOfColumnElements = 0; // Максимальная сумма элементов в столбцах матрицы.
        int column = 0; // Индекс столбца матрицы с маусимальной суммой элементов.

        for (int j = 0; j < array.length; j++) {
            int sumOfColumnElements = 0; // Сумма элементов столбца матрицы
            for (int i = 0; i < array.length; i ++) {
                sumOfColumnElements += array[i][j];
                if (sumOfColumnElements > maxSumOfColumnElements) {
                    maxSumOfColumnElements = sumOfColumnElements;
                    column = j;
                }
            }
            System.out.println(j + 1+ "-ый столбец содержит " + array.length + " элементов сумма которых = " + sumOfColumnElements);
        }
        System.out.println(column + 1 + "-ый столбец содержит максимальную сумму элементов.");
    }
}
