package com.androsor.multiarray;

import java.util.Scanner;
import static com.androsor.multiarray.PrintArray.printArrayInt;

/**
 * Form a square matrix of order n according to a given pattern (n is even):
 *    1 1 1 ... 1 1 1
 *    2 2 2 ... 2 2 0
 *    3 3 3 ... 3 0 0
 *    ...............
 *    n-1 n-1 ..0 0 0
 *    n 0 0 ... 0 0 0
 */

public class HomeTask5 {
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
        int m = n; // укорачиваем каждую следующую строку на один элемент.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                myArray[i][j] = i + 1;
            }
            m--;
        }

        printArrayInt(myArray);
    }
}