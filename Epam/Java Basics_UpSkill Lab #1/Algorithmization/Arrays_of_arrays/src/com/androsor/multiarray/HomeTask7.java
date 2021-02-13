package com.androsor.multiarray;

import static com.androsor.multiarray.ArrayCreator.inputParameter;
import static java.lang.Math.sin;
import static com.androsor.multiarray.ArrayPrinter.printArrayDouble;

/**
 * Form a square matrix of order n according to the rule:
 * a [i, j] = sin ((i ^ 2 - j ^ 2) / n)
 * and count the number of positive elements in it.
 */

public class HomeTask7 {

    public static void main(String[] args) {

        int arrayWidth; // разрядность массива.

        System.out.print(" Введите разрядность массива arrayWidth = ");
        arrayWidth = inputParameter();

        System.out.println(" Исходный массив");
        double[][] myArray = fillArray(arrayWidth);
        printArrayDouble(myArray);

        System.out.println("Количество положительных элементов матрицы: " + getCounterPositiveElement(myArray));
    }

    private static double[][] fillArray(int arrayWidth) {
        double[][] array = new double[arrayWidth][arrayWidth];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = sin((double) (i * i - j * j) / array.length);
            }
        }
        return array;
    }

    private static int getCounterPositiveElement(double[][] array) {
        int countPositive = 0;
        for (double[] doubles : array) {
            for (int j = 0; j < array.length; j++) {
                if (doubles[j] > 0) {
                    countPositive++;
                }
            }
        }
        return countPositive;
    }
}