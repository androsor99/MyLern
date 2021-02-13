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
        arrayWidth = ArrayCreator.inputParameter();

        System.out.println(" Исходный массив");
        int [][] myArray = fillArray(arrayWidth);
        printArrayInt(myArray);

        printSumOfColumnElements(myArray);
    }

    private static void printSumOfColumnElements(int[][] array) {
        int arrayMaxSumColumn = 0; // Максимальная сумма элементов столбцов матрицы.
        int indexColumn = 0; // Индекс столбца матрицы с маусимальной суммой элементов.

        for (int j = 0; j < array.length; j++) {
            int arraySumColumn = 0; // Сумма элементов столбца матрицы
            for (int i = 0; i < array.length; i ++) {
                arraySumColumn += array[i][j];
                if (arraySumColumn > arrayMaxSumColumn) {
                    arrayMaxSumColumn = arraySumColumn;
                    indexColumn = j;
                }
            }
            System.out.println(j + 1+ "-ый столбец содержит " + array.length + " элементов сумма которых = " + arraySumColumn);
        }
        System.out.println(indexColumn + 1 + "-ый столбец содержит максимальную сумму элементов.");
    }
}
