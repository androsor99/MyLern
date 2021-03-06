package com.androsor.multiarray;

import static com.androsor.multiarray.IOUtils.enterParameterFromConsole;
import static com.androsor.multiarray.IOUtils.printArrayDouble;
import static java.lang.Math.sin;
import static java.lang.Math.abs;

/**
 * Form a square matrix of order n according to the rule:
 * a [i, j] = sin ((i ^ 2 - j ^ 2) / n)
 * and count the number of positive elements in it.
 */
public class HomeTask7 {

    public static void main(String[] args) {

        System.out.print(" Введите разрядность массива length = ");
        int length = abs(enterParameterFromConsole());
        double[][] defaultNumbers = new double[length][length];

        System.out.println(" Исходный массив");
        double[][] numbers = fillArray(defaultNumbers);
        printArrayDouble(numbers);

        System.out.println("Количество положительных элементов матрицы: " + getNumberOfPositiveElements(numbers));
    }

    private static double[][] fillArray(double[][] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = getSin(i, j, numbers.length);
            }
        }
        return numbers;
    }

    private static double getSin(int... value) {
        return sin((double) (value[0] * value[0] - value[1] * value[1]) / value[2]);
    }

    private static int getNumberOfPositiveElements(double[][] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] > 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
