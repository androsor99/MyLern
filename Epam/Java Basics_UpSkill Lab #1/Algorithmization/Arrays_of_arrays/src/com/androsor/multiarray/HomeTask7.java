package com.androsor.multiarray;

import static com.androsor.multiarray.ArrayCreator.inputParameterArray;
import static java.lang.Math.sin;
import static java.lang.Math.abs;
import static com.androsor.multiarray.ArrayPrinter.printArrayDouble;

/**
 * Form a square matrix of order n according to the rule:
 * a [i, j] = sin ((i ^ 2 - j ^ 2) / n)
 * and count the number of positive elements in it.
 */
public class HomeTask7 {

    public static void main(String[] args) {

        System.out.print(" Введите разрядность массива length = ");
        int length = abs(inputParameterArray());

        System.out.println(" Исходный массив");
        double[][] numbers = fillArray(length);
        printArrayDouble(numbers);

        System.out.println("Количество положительных элементов матрицы: " + getNumberOfPositiveElements(numbers));
    }

    private static double[][] fillArray(int length) {
        double[][] numbers = new double[length][length];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                numbers[i][j] = sin((double) (i * i - j * j) / numbers.length);
            }
        }
        return numbers;
    }

    private static int getNumberOfPositiveElements(double[][] numbers) {
        int count = 0;
        for (double[] items : numbers) {
            for (int j = 0; j < numbers.length; j++) {
                if (items[j] > 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
