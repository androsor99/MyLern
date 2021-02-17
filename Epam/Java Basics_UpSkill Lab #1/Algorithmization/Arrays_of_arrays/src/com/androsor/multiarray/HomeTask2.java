package com.androsor.multiarray;

import static com.androsor.multiarray.ArrayCreator.inputParameterArray;
import static com.androsor.multiarray.ArrayCreator.fillArray;
import static com.androsor.multiarray.ArrayPrinter.printArrayInt;
import static java.lang.Math.abs;

/**
 * You are given a square matrix. Display the elements on the diagonal.
 */
public class HomeTask2 {

    public static void main (String[] args) {

        System.out.print(" Введите разрядность массива length = ");
        int length = abs(inputParameterArray());

        System.out.println(" Исходный массив");
        int [][] numbers = fillArray(length);
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
    }

    private static void printSideDiagonal(int[][] numbers) {
        System.out.print(" Диагональ побочная:  ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[numbers.length - 1 - i][i]  + ", " );
        }
    }
}
