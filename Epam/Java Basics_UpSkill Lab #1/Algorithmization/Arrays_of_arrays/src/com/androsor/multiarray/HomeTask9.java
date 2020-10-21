package com.androsor.multiarray;

import java.util.Scanner;
import static com.androsor.multiarray.FillArray.fillArray;
import static com.androsor.multiarray.PrintArray.printArrayInt;


/**
 * A matrix of non-negative numbers is given. Calculate the sum of the items in each column. Determine which
 * the column contains the maximum amount.
 */

public class HomeTask9 {

    public static void main (String[] args) {

        int n; // разрядность матрицы
        int [][] myArray;
        int myArraySumColumn; // Сумма элементов столбца матрицы
        int myArrayMaxSumColumn =0; // Максимальная сумма элементов столбцов матрицы.
        int indexColumn =0; // Индекс столбца матрицы с маусимальной суммой элементов.

        Scanner sc = new Scanner(System.in);
        System.out.print(" Введите разрядность матрицы = ");
        n = sc.nextInt();
        myArray = new int[n][n];
        fillArray (myArray);

        System.out.println(" Исходная матрица:");
        printArrayInt (myArray);

        for (int j = 0; j < n; j++) {
            myArraySumColumn =0;
            for (int i = 0; i < n; i ++) {
                myArraySumColumn += myArray[i][j];
                if (myArraySumColumn > myArrayMaxSumColumn) {
                    myArrayMaxSumColumn = myArraySumColumn;
                    indexColumn = j;
                }
            }

            System.out.println(j + 1+ "-ый столбец содержит элементов сумма которых = " + myArraySumColumn);
        }

        System.out.println(indexColumn + 1 + "-ый столбец содержит максимальную сумму элементов");
    }
}
