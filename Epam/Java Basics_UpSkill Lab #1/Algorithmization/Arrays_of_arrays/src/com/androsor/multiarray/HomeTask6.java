package com.androsor.multiarray;

import java.util.Scanner;
import static com.androsor.multiarray.ArrayPrinter.printArrayInt;
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
        Scanner scanner = new Scanner(System.in);
        int parameter = abs(scanner.nextInt());
        while (parameter % 2 != 0) {
            System.out.println(" Значение разрядности должно быть четным по условию");
            System.out.print(" Введите разрядность матрицы = ");
            parameter = abs(scanner.nextInt());
        }
        return parameter;
    }

    private static int[][] fillyArray(int length) {
        int[][] numbers = new int[length][length];
        for (int i = 0; i < numbers.length / 2 + 1; i++) { // заполняем первую половину строк.
            for (int j = i; j < numbers.length - i; j++) {
                numbers[i][j] = 1;
            }
        }
        for (int i = numbers.length / 2; i < numbers.length; i++) { // заполняем вторую половину строк.
            for (int j = numbers.length - i - 1; j < i + 1; j++) {
                numbers[i][j] = 1;
            }
        }
        return numbers;
    }
}
