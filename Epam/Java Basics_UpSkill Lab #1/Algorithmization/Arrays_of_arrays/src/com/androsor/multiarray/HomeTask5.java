package com.androsor.multiarray;

import static com.androsor.multiarray.IOUtils.enterEvenParameterFromConsole;
import static com.androsor.multiarray.IOUtils.printArrayInt;

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

        System.out.print(" Введите разрядность матрицы = ");
        int light = enterEvenParameterFromConsole();

        System.out.println(" Исходный массив");
        printArrayInt(fillArray(light));
    }

    private static int[][] fillArray(int length) {
        int[][] numbers = new int[length][length];
        int lengthCurrent = length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < lengthCurrent; j++) {
                numbers[i][j] = i + 1;
            }
            lengthCurrent--;
        }
        return numbers;
    }
}
