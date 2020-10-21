package com.androsor.multiarray;

import java.util.Random;
import java.util.Scanner;
import static com.androsor.multiarray.PrintArray.printArrayInt;

/**
 * Generate a random m x n matrix consisting of zeros and ones, with the number of ones in each column being equal
 * to the column number.
 */

public class HomeTask14 {

    public static void main(String[] args) {

        int n; // разрядность матрицы
        int[][] myArray;

        Scanner sc = new Scanner(System.in);
        System.out.print(" Введите разрядность матрицы = ");
        n = sc.nextInt();
        myArray = new int[n][n];
        Random random = new Random ();
        for (int j = 0; j < n; j++) {
            int count0 = 0; // счетчик встреч 0.
            int count1 = 0; // счетчик встреч 1.
            for (int i = 0; i < n; i++) {
                myArray[i][j] = random.nextInt(2);
                if (myArray[i][j] == 1) {
                    count1++;
                } else {
                    count0++;
                }
                if ((myArray[i][j] == 1) && (count1 > j+1)) {
                    myArray[i][j] = 0;
                }
                if ((myArray[i][j] == 0) && (count0) >= (n-j)) {
                    myArray [i][j] = 1;
                }
            }
        }

        System.out.println(" Исходная матрица:");
        printArrayInt(myArray);
    }
}
