package com.androsor.multiarray;

import java.util.Scanner;
import static com.androsor.multiarray.FillArray.fillArray;
import static com.androsor.multiarray.PrintArray.printArrayInt;

/**
 * You are given a square matrix. Display the elements on the diagonal.
 */

public class HomeTask2 {

    public static void main (String[] args) {

        int n; // разрядность матрицы
        int [][] myArray;

        Scanner sc = new Scanner(System.in);
        System.out.print(" Введите разрядность матрицы = ");
        n = sc.nextInt();

        myArray = new int[n][n];
        fillArray (myArray);
        System.out.println(" Исходная матрица:");
        printArrayInt (myArray);

        System.out.print(" Диагональ 1:  ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i][i] + " ");
        }

        System.out.println();

        System.out.print(" Диагональ 2:  ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[n-1-i][i]  + " " );
        }
    }
}
