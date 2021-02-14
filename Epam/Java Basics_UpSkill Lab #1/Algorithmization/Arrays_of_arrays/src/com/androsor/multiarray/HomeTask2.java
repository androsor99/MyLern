package com.androsor.multiarray;

import static com.androsor.multiarray.ArrayCreator.*;
import static com.androsor.multiarray.ArrayPrinter.*;

/**
 * You are given a square matrix. Display the elements on the diagonal.
 */
public class HomeTask2 {

    public static void main (String[] args) {

        int arrayWidth; // разрядность массива.

        System.out.print(" Введите разрядность массива arrayWidth = ");
        arrayWidth = inputParameterArray();

        System.out.println(" Исходный массив");
        int [][] myArray = fillArray(arrayWidth);
        printArrayInt(myArray);

        printMainDiagonal(myArray);
        System.out.println();
        printSideDiagonal(myArray);
    }

    private static void printMainDiagonal(int[][] myArray) {
        System.out.print(" Диагональ 1:  ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i][i] + " ");
        }
    }

    private static void printSideDiagonal(int[][] myArray) {
        System.out.print(" Диагональ 2:  ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[myArray.length - 1 - i][i]  + " " );
        }
    }
}
