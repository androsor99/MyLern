package com.androsor.multiarray;

import java.util.Random;

import static com.androsor.multiarray.IOUtils.enterParameterFromConsole;
import static com.androsor.multiarray.IOUtils.printArrayInt;
import static java.lang.Math.abs;

/**
 * Generate a random m x n matrix consisting of zeros and ones, with the number of ones in each column being equal
 * to the column number.
 */
public class HomeTask14 {

    public static void main(String[] args) {

        System.out.print(" Введите число строк массива rows = ");
        int rows = abs(enterParameterFromConsole());
        System.out.print(" Введите число столбцов columns = ");
        int columns = abs(enterParameterFromConsole());

        System.out.println(" Исходная матрица:");
        int[][] numbers = fillArray(rows, columns);
        printArrayInt(numbers);
    }

    private static int[][] fillArray(int rows, int columns) {
        int[][] numbers = new int[rows][columns];
        for (int j = 0; j < columns; j++) {
            int duplicateZero = 0; // счетчик встреч 0
            int duplicateOne = 0; // счетчик встреч 1
            for (int i = 0; i < rows; i++) {
                int randomNumber = new Random().nextInt(2);
                boolean isOneAllowed = randomNumber == 1 ? ++duplicateOne <= j + 1 : ++duplicateZero >= rows - j;
                if (isOneAllowed) {
                    numbers[i][j] = 1;
                }
            }
        }
        return numbers;
    }
}
