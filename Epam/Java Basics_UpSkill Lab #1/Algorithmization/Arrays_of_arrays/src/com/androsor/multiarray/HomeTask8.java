package com.androsor.multiarray;

import java.util.Scanner;
import static com.androsor.multiarray.FillArray.fillArray;
import static com.androsor.multiarray.PrintArray.printArrayInt;

/**
 * In a numerical matrix, swap two columns of any column, that is, put all the elements of one column in the
 * corresponding positions of the other, and move its elements of the second to the first. Column numbers are entered
 * by the user from the keyboard.
 */

public class HomeTask8 {

    public static void main (String[] args) {

        int n; // разрядность матрицы
        int [][] myArray;
        int num1; // Номер первого заменяемого столбца.
        int num2; // Номер второго заменяемого столбца.

        Scanner sc = new Scanner(System.in);
        System.out.print(" Введите разрядность матрицы = ");
        n = sc.nextInt();
        myArray = new int[n][n];
        fillArray (myArray);


        System.out.println(" Введите номера заменямых столбцов");
        System.out.print(" Номер первого столбца = ");
        num1 = sc.nextInt();
        while (num1 > n) {
            System.out.println(" Значение заменяемого столбца не должно превышать разрядность матрицы");
            System.out.print(" Номер первого столбца =  ");
            num1 = sc.nextInt();
        }

        System.out.print(" Номер второго столбца = ");
        num2 = sc.nextInt();
        while (num2 > n) {
            System.out.println(" Значение заменяемого столбца не должно превышать разрядность матрицы");
            System.out.print(" Номер второго столбца = ");
            num2 = sc.nextInt();
        }

        System.out.println(" Исходная матрица:");
        printArrayInt (myArray);

        for (int i = 0; i < n; i++) {
            for (int j =0; j < n; j ++) {
                int temp = myArray[i][num1-1];
                myArray[i][num1-1] = myArray[i][num2-1];
                myArray[i][num2-1] = temp;
            }
        }
        System.out.println(" Матрица с измененными столбцами:");
        printArrayInt (myArray);
    }
}