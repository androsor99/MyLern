package com.androsor.multiarray;

import java.util.Random;

import static com.androsor.multiarray.ArrayCreator.inputParameterArray;
import static com.androsor.multiarray.ArrayPrinter.printArrayInt;
import static java.lang.Math.abs;

/**
 * Generate a random m x n matrix consisting of zeros and ones, with the number of ones in each column being equal
 * to the column number.
 */
public class HomeTask14 {

    public static void main(String[] args) {

        System.out.print(" Введите разрядность массива length = ");
        int length = abs(inputParameterArray());

        System.out.println(" Исходная матрица:");
        int[][] numbers = fillArray(length);
        printArrayInt(numbers);
    }

    private static int[][] fillArray(int length) {
        int[][] numbers = new int[length][length];
        for (int j = 0; j < numbers.length; j++) {
            int duplicateZero = 0; // счетчик встреч 0
            int duplicateOne = 0; // счетчик встреч 1
            for (int i = 0; i < numbers.length; i++) {
                numbers[i][j] = new Random ().nextInt(2);
                if (numbers[i][j] == 1) {
                    duplicateOne++;
                } else {
                    duplicateZero++;
                }
                if ((numbers[i][j] == 1) && (duplicateOne > j + 1)) {
                    numbers[i][j] = 0;
                }
                if ((numbers[i][j] == 0) && (duplicateZero) >= (numbers.length - j)) {
                    numbers[i][j] = 1;
                }
            }
        }
        return numbers;
    }
}
