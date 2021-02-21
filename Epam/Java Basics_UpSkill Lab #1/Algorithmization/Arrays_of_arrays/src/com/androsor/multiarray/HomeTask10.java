package com.androsor.multiarray;

import static com.androsor.multiarray.ArrayCreator.fillArrayRandom;
import static com.androsor.multiarray.IOUtils.enterParameterFromConsole;
import static com.androsor.multiarray.IOUtils.printArrayInt;
import static java.lang.Math.abs;

/**
 * Find the positive elements of the main diagonal of a square matrix.
 */
public class HomeTask10 {

    public static void main(String[] args) {

        System.out.print(" Введите разрядность массива arrayWidth = ");
        int length = abs(enterParameterFromConsole());

        System.out.println(" Исходный массив");
        int[][] numbers = fillArrayRandom(length);
        printArrayInt(numbers);

        printPositiveElementMainDiagonal(numbers);
    }

    private static void printPositiveElementMainDiagonal(int[][] numbers) {
        int count = 0;
        System.out.print(" Положительные элементы главной диагонали матрицы: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i][i] > 0) {
                System.out.print(numbers[i][i] + ", ");
                count++;
            }
        }
        if (count == 0) {
            System.out.print("\n Главная диагональ не содержит положительных элементов.");
        }
    }
}
