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
        int k; // номер выводимой строки.
        int p; // Номер выводимого столбца

        System.out.print(" Введите разрядность массива arrayWidth = ");
        arrayWidth = ArrayCreator.inputParameter();

        System.out.println(" Исходный массив");
        int [][] myArray = fillArray(arrayWidth);
        printArrayInt(myArray);

        System.out.print(" Введите номер выводимой строки = ");
        k = inputParameter(arrayWidth);
        printStringMatrix(k, myArray);

        System.out.println();

        System.out.print(" Введите номер выводимого столбца = ");
        p = inputParameter(arrayWidth);
        printColumnMatrix(p, myArray);
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
    private static void printColumnMatrix(int p, int[][] myArray) {
        System.out.println( +p + "-ый столбец матрицы:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i][p -1]);
        }
    }

    private static void printStringMatrix(int k, int[][] myArray) {
        System.out.print( +k +"-ая строка матрицы:  ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[k -1][i] + " ");
        }
    }
}
