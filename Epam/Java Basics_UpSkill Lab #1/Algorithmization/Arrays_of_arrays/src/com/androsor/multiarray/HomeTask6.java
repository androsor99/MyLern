package com.androsor.multiarray;

import static com.androsor.multiarray.IOUtils.enterEvenParameterFromConsole;
import static com.androsor.multiarray.IOUtils.printArrayInt;

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

        System.out.print(" Введите разрядность матрицы = ");
        int length = enterEvenParameterFromConsole();

        System.out.println(" Исходный массив");
        printArrayInt(fillyArray(length));
    }

    private static int[][] fillyArray(int length) {
        int[][] numbers = new int[length][length];
        for (int i = 0; i < length / 2 + 1; i++) { // заполняем первую половину строк.
            for (int j = i; j < length - i; j++) {
                numbers[i][j] = 1;
                numbers[length - i - 1][j] = 1;
            }
        }
        return numbers;
    }
}
