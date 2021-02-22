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

        printMainDiagonal(numbers);
        System.out.println();
        printSideDiagonal(numbers);
    }

    private static void printMainDiagonal(int[][] numbers) {
        System.out.print(" Диагональ главная:  ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i][i] + ", ");
        }
        System.out.print("\b\b");
    }

    private static void printSideDiagonal(int[][] numbers) {
        System.out.print(" Диагональ побочная:  ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[numbers.length - 1 - i][i]  + ", " );
        }
        System.out.print("\b\b");
    }

}
