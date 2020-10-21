package com.androsor.multiarray;

import java.util.Scanner;
import static com.androsor.multiarray.PrintArray.printArrayInt;

/**
 * Form a square matrix of order n according to a given pattern (n is even):
 * 1 2 3 ... n
 * n n-1 n-2 ... 1
 * 1 2 3 ... n
 * n n-1 n-2 ... 1
 * ...............
 * n n-1 n-2 ... 1
 */

public class HomeTask4 {
    public static void main(String[] args) {

        int n; // разрядность матрицы
        int[][] myArray;


        Scanner sc = new Scanner(System.in);
        System.out.print(" Введите разрядность матрицы = ");
        n = sc.nextInt();

        myArray = new int[n][n];
        for ( int i = 0; i < n; i ++ ) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0){
                    myArray[i][j] = j+1;
                }else {
                    myArray[i][j] = n-j;
                }
            }
        }

        System.out.println(" Исходная матрица:");
        printArrayInt(myArray);
    }
}