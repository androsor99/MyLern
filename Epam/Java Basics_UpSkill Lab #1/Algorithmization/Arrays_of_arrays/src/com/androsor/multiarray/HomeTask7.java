package com.androsor.multiarray;

import java.util.Scanner;
import static java.lang.Math.sin;
import static com.androsor.multiarray.PrintArray.printArrayDouble;

/**
 * Form a square matrix of order n according to the rule:
 * a [i, j] = sin ((i ^ 2 - j ^ 2) / n)
 * and count the number of positive elements in it.
 */

public class HomeTask7 {
    public static void main(String[] args) {

        int n; // разрядность матрицы
        double[][] myArray;
        int countPositive = 0; // счетчик положительных элементов

        Scanner sc = new Scanner(System.in);
        System.out.print(" Введите разрядность матрицы = ");
        n = sc.nextInt();

        myArray = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                myArray[i][j] = sin((i * i - j * j) / n);
                if (myArray[i][j] > 0) {
                    countPositive++;
                }
            }
        }
        System.out.println(" Исходная матрица:");
        printArrayDouble(myArray);
        System.out.println("Количество положительных элементов матрицы: " + countPositive);
    }
}