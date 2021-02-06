package com.androsor.multiarray;

import java.util.Scanner;
import static com.androsor.multiarray.FillArray.fillArray;
import static com.androsor.multiarray.PrintArray.printArrayInt;

/**
 * Find the positive elements of the main diagonal of a square matrix.
 */

public class HomeTask10 {

    public static void main(String[] args) {

        int n; // разрядность матрицы
        int[][] myArray;

        Scanner sc = new Scanner(System.in);
        System.out.print(" Введите разрядность матрицы = ");
        n = sc.nextInt();
        myArray = new int[n][n];
        fillArray(myArray);

        System.out.println(" Исходная матрица:");
        printArrayInt(myArray);

        System.out.print(" Элементы главной диагонали матрицы: ");
        for (int i = 0; i < n; i++) {
            if (myArray[i][i] > 0) {
                System.out.print(myArray[i][i] + " ");
            }
        }
    }
}