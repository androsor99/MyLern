package com.androsor.multiarray;

import java.util.Scanner;
import static com.androsor.multiarray.FillArray.fillArray;
import static com.androsor.multiarray.PrintArray.printArrayInt;

/**
 * Find the largest element of the matrix and replace all odd elements with it.
 */

public class HomeTask15 {

    public static void main(String[] args) {

        int n; // разрядность матрицы
        int[][] myArray;
        int myArrayMax; // Максимальный элемент матрицы.
        int indexArrayMaxI = 0; // Индекс строки максимального элемента.
        int indexArrayMaxJ = 0; // Индекс столбца максимального элемента


        Scanner sc = new Scanner(System.in);
        System.out.print(" Введите разрядность матрицы = ");
        n = sc.nextInt();
        myArray = new int[n][n];
        fillArray(myArray);

        System.out.println(" Исходная матрица:");
        printArrayInt(myArray);

        myArrayMax = myArray[0][0];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (myArray[i][j] > myArrayMax) {
                    myArrayMax = myArray[i][j];
                    indexArrayMaxI = i;
                    indexArrayMaxJ = j;
                }
            }
        }
        System.out.println(" Максимальный элемент матрицы N [" + indexArrayMaxI + ";" + indexArrayMaxJ + "] = " + myArrayMax);

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (myArray[i][j] % 2 != 0) {
                     myArray[i][j] = myArrayMax;
                }
            }
        }

        System.out.println(" Матрица с замененными нечетными элементами :");
        printArrayInt(myArray);
    }
}