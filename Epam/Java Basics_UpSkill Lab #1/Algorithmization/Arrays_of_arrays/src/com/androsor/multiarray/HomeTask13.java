package com.androsor.multiarray;

import java.util.Scanner;
import static com.androsor.multiarray.FillArray.fillArray;
import static com.androsor.multiarray.PrintArray.printArrayInt;

/**
 * Sort matrix columns in ascending and descending order of element values.
 */

public class HomeTask13 {

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


        System.out.println(" Матрица с отсортированными по убыванию элементами столбцов: ");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                for (int k = i+1; k < n; k++) {
                    if (myArray[k][j] > myArray[i][j]) {
                        int temp = myArray[k][j];
                        myArray[k][j] = myArray[i][j];
                        myArray[i][j] = temp;
                    }
                }
            }
        }
        printArrayInt(myArray);

        System.out.println(" Матрица с отсортированными по возростанию элементами столбцов: ");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                for (int k = i+1; k < n; k++) {
                    if (myArray[k][j] < myArray[i][j]) {
                        int temp = myArray[k][j];
                        myArray[k][j] = myArray[i][j];
                        myArray[i][j] = temp;
                    }
                }
            }
        }
        printArrayInt(myArray);
    }
}