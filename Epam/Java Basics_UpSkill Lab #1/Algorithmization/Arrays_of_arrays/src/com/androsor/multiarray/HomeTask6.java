package com.androsor.multiarray;

import java.util.Scanner;
import static com.androsor.multiarray.PrintArray.printArrayInt;

/**
 * Form a square matrix of order n according to a given pattern (n is even):
 * 1 1 1 1 1 1
 * 0 1 1 1 1 0
 * 0 0 1 1 0 0
 * 0 1 1 1 1 0
 * 1 1 1 1 1 1
 */

public class HomeTask6 {
    public static void main(String[] args) {

        int n; // разрядность матрицы
        int[][] myArray;

        Scanner sc = new Scanner(System.in);
        System.out.print(" Введите разрядность матрицы = ");
        n = sc.nextInt();
        while (n % 2 != 0) {
            System.out.println(" Значение разрядности должно быть четным по условию");
            System.out.print(" Введите разрядность матрицы = ");
            n = sc.nextInt();
        }

        myArray = new int[n][n];

        for (int i = 0; i < n / 2 + 1; i++) { // заполняем первую половину строк.
            for (int j = i; j < n - i; j++) {
                myArray[i][j] = 1;
            }
        }
        for (int i = n / 2; i < n; i++) { // заполняем вторую половину строк.
            for (int j = n - i - 1; j < i + 1; j++) {
                myArray[i][j] = 1;
            }
        }

        System.out.println(" Исходная матрица:");
        printArrayInt(myArray);
    }
}