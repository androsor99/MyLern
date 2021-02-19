package com.androsor.multiarray;

import static com.androsor.multiarray.IOUtils.enterParameterFromConsole;
import static com.androsor.multiarray.IOUtils.printArrayInt;
import static java.lang.Math.abs;

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

        System.out.print(" Введите разрядность массива length = ");
        int length = abs(enterParameterFromConsole());

        System.out.println(" Исходная матрица:");
        printArrayInt(fillArray(length));
    }

    private static int[][] fillArray(int length) {
        int[][] numbers = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i % 2 == 0) {
                    numbers[i][j] = j + 1;
                } else {
                    numbers[i][j] = length - j;
                }
            }
        }
        return numbers;
    }
}
