package com.androsor.multiarray;

import java.util.Scanner;
import static com.androsor.multiarray.FillArray.fillArray;
import static com.androsor.multiarray.PrintArray.printArrayInt;

/**
 * A matrix is given. Print the k-th row and p-th column of the matrix.
 */

public class HomeTask3 {
    public static void main (String[] args) {

        int n; // разрядность матрицы
        int [][] myArray;
        int k; // номер выводимой строки.
        int p; // Номер выводимого столбца

        Scanner sc = new Scanner(System.in);
        System.out.print(" Введите разрядность матрицы = ");
        n = sc.nextInt();
        myArray = new int[n][n];
        fillArray (myArray);
        System.out.println(" Исходная матрица:");
        printArrayInt (myArray);

        System.out.print(" Введите номер выводимой строки = ");
        k = sc.nextInt();
        while (k >n) {
            System.out.println(" Значение выводимой строки не должно превышать разрядность матрицы");
            System.out.print(" Введите номер выводимой строки = ");
            k = sc.nextInt();
        }

        System.out.print(" Введите номер выводимого столбца = ");
        p = sc.nextInt();
        while (p > n) {
            System.out.println(" Значение выводимого столбца не должно превышать разрядность матрицы");
            System.out.print(" Введите номер выводимого столбца = ");
            p = sc.nextInt();
        }

        System.out.print( + k +"-ая строка матрицы:  ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[k-1][i] + " ");
        }

        System.out.println();

        System.out.println( + p + "-ый столбец матрицы:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i][p-1]);
        }
    }
}
