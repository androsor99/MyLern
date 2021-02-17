package com.androsor.multiarray;

import java.util.Scanner;

import static com.androsor.multiarray.ArrayPrinter.printArrayInt;
import static java.lang.Math.abs;

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
        int light = inputParameter();

        System.out.println(" Исходный массив");
        printArrayInt(fillArray(light));
    }

    private static int inputParameter() {
        Scanner scanner = new Scanner(System.in);
        int parameter = abs(scanner.nextInt());
        while (parameter % 2 != 0) {
            System.out.println(" Значение разрядности должно быть четным по условию");
            System.out.print(" Введите разрядность матрицы = ");
            parameter = abs(scanner.nextInt());
        }
        return parameter;
    }

    private static int[][] fillArray(int length) {
        int[][] numbers = new int[length][length];
        int lengthCurrent = numbers.length;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < lengthCurrent; j++) {
                numbers[i][j] = i + 1;
            }
            lengthCurrent--;
        }
        return numbers;
    }
}
