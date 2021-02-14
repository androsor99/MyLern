package com.androsor.multiarray;

import static com.androsor.multiarray.ArrayCreator.fillArray;
import static com.androsor.multiarray.ArrayPrinter.printArrayInt;

/**
 * Find the positive elements of the main diagonal of a square matrix.
 */
public class HomeTask10 {

    public static void main(String[] args) {

        int arrayWidth; // разрядность матрицы

        System.out.print(" Введите разрядность массива arrayWidth = ");
        arrayWidth = ArrayCreator.inputParameterArray();

        System.out.println(" Исходный массив");
        int [][] myArray = fillArray(arrayWidth);
        printArrayInt(myArray);

        System.out.print(" Элементы главной диагонали матрицы: ");
        printPositiveElementMainDiagonal(myArray);
    }

    private static void printPositiveElementMainDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i][i] > 0) {
                System.out.print(array[i][i] + " ");
            }
        }
    }
}
