package com.androsor.multiarray;

import static com.androsor.multiarray.ArrayCreator.fillArrayRandom;
import static com.androsor.multiarray.IOUtils.enterParameterFromConsole;
import static com.androsor.multiarray.IOUtils.printArrayInt;
import static java.lang.Math.abs;

/**
 * You are given a square matrix. Display the elements on the diagonal.
 */
public class HomeTask2 {

    public static void main(String[] args) {

        System.out.print(" Введите разрядность массива length = ");
        int length = abs(enterParameterFromConsole());

        System.out.println(" Исходный массив");
        int[][] numbers = fillArrayRandom(length);
        printArrayInt(numbers);

        System.out.println(" Диагональ главная:");
        printMatrixDiagonal(numbers, true);

        System.out.println(" Диагональ побочная:");
        printMatrixDiagonal(numbers, false);
    }

    private static void printMatrixDiagonal(int[][] numbers, boolean diagonalSelection) {

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(diagonalSelection ? (numbers[i][i] + ", ") : (numbers[numbers.length - 1 - i][i]  + ", " ));
        }
        System.out.print("\b\b\n");
    }
}
