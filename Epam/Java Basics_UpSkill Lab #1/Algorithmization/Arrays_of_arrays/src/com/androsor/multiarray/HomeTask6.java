package com.androsor.multiarray;

import static com.androsor.multiarray.IOUtils.enterParameterFromConsole;
import static com.androsor.multiarray.IOUtils.printArrayInt;
import static java.lang.Math.abs;

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
        int length = inputParameter();

        System.out.println(" Исходный массив");
        printArrayInt(fillyArray(length));
    }

    private static int inputParameter() {
        int parameter = abs(enterParameterFromConsole());
        if (parameter % 2 != 0) {
            System.out.println(" Значение разрядности должно быть четным по условию. Повторите ввод:");
            return inputParameter();
        }
        return parameter;
    }

    private static int[][] fillyArray(int length) {
        int[][] numbers = new int[length][length];
        for (int i = 0; i < length / 2 + 1; i++) { // заполняем первую половину строк.
            for (int j = i; j < length - i; j++) {
                numbers[i][j] = 1;
            }
        }
        for (int i = length / 2; i < length; i++) { // заполняем вторую половину строк.
            for (int j = length - i - 1; j < i + 1; j++) {
                numbers[i][j] = 1;
            }
        }
        return numbers;
    }
}
