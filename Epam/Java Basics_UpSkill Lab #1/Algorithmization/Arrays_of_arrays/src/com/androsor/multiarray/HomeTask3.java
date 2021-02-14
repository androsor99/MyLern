package com.androsor.multiarray;

import java.util.Scanner;

import static com.androsor.multiarray.ArrayCreator.*;
import static com.androsor.multiarray.ArrayPrinter.*;

/**
 * A matrix is given. Print the k-th row and p-th column of the matrix.
 */
public class HomeTask3 {

    public static void main (String[] args) {

        int arrayWidth; // разрядность матрицы
        int row; // номер выводимой строки.
        int column; // Номер выводимого столбца

        System.out.print(" Введите разрядность массива arrayWidth = ");
        arrayWidth = ArrayCreator.inputParameterArray();


        System.out.println(" Исходный массив");
        int [][] myArray = fillArray(arrayWidth);
        printArrayInt(myArray);

        System.out.print(" Введите номер выводимой строки = ");
        row = inputParameter(arrayWidth);
        printRowMatrix(row, myArray);

        System.out.println();

        System.out.print(" Введите номер выводимого столбца = ");
        column = inputParameter(arrayWidth);
        printColumnMatrix(column, myArray);
    }

    private static int inputParameter(int arrayWidth) {
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        while (temp > arrayWidth) {
            System.out.println(" Значение выводимой строки/столбца не должно превышать разрядность матрицы");
            System.out.print(" Повторите ввод = ");
            temp = scanner.nextInt();
        }
        return temp;
    }
    private static void printColumnMatrix(int column, int[][] myArray) {
        System.out.println( column + "-ый столбец матрицы:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i][column -1]);
        }
    }

    private static void printRowMatrix(int row, int[][] myArray) {
        System.out.print( row +"-ая строка матрицы:  ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[row -1][i] + " ");
        }
    }
}
