package com.androsor.multiarray;

import java.util.Random;

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
        int[][] numbers = fillArrayRandomlyWithPositiveElements(length);
        printArrayInt(numbers);

        printSumOfColumnElements(numbers);
    }

    public static int[][] fillArrayRandomlyWithPositiveElements(int length) {
        int[][] numbers = new int[length][length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                numbers[i][j] = random.nextInt(100);
            }
        }
        return numbers;
    }

    private static void printSumOfColumnElements(int[][] numbers) {
        int maxSumOfColumnElements = 0; // Максимальная сумма элементов в столбцах матрицы.
        int columnMaxSumElement = 0; // Индекс столбца матрицы с маусимальной суммой элементов.
        for (int j = 0; j < numbers[0].length; j++) {
            int sumOfColumnElements = 0; // Сумма элементов столбца матрицы
            for (int i = 0; i < numbers.length; i++) {
                sumOfColumnElements += numbers[i][j];
            }
            if (sumOfColumnElements > maxSumOfColumnElements) {
                maxSumOfColumnElements = sumOfColumnElements;
                columnMaxSumElement = j;
            }
            System.out.println(j + 1 + "-ый столбец содержит <" + numbers.length + "> элементов сумма которых = " + sumOfColumnElements);
        }
        System.out.println(columnMaxSumElement + 1 + "-ый столбец содержит максимальную сумму элементов.");
    }
}
