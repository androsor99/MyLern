package com.androsor.multiarray;

import static com.androsor.multiarray.ArrayCreator.fillArrayRandom;
import static com.androsor.multiarray.IOUtils.enterParameterFromConsole;
import static com.androsor.multiarray.IOUtils.printArrayInt;
import static java.lang.Math.abs;

/**
 * A matrix of non-negative numbers is given. Calculate the sum of the items in each column. Determine which
 * the column contains the maximum amount.
 */
public class HomeTask9 {

    public static void main(String[] args) {

        System.out.print(" Введите разрядность массива length = ");
        int length = abs(enterParameterFromConsole());

        System.out.println(" Исходный массив");
        int[][] numbers = fillArrayRandom(length);
        printArrayInt(numbers);

        printSumOfColumnElements(numbers);
    }

    private static void printSumOfColumnElements(int[][] numbers) {
        int maxSumOfColumnElements = 0; // Максимальная сумма элементов в столбцах матрицы.
        int column = 0; // Индекс столбца матрицы с маусимальной суммой элементов.
        for (int j = 0; j < numbers.length; j++) {
            int sumOfColumnElements = 0; // Сумма элементов столбца матрицы
            for (int[] number : numbers) {
                sumOfColumnElements += number[j];
                if (sumOfColumnElements > maxSumOfColumnElements) {
                    maxSumOfColumnElements = sumOfColumnElements;
                    column = j;
                }
            }
            System.out.println(j + 1 + "-ый столбец содержит <" + numbers.length + "> элементов сумма которых = " + sumOfColumnElements);
        }
        System.out.println(column + 1 + "-ый столбец содержит максимальную сумму элементов.");
    }
}
