package com.androsor.multiarray;

import java.util.Scanner;

import static com.androsor.multiarray.ArrayCreator.fillArrayRandom;
import static com.androsor.multiarray.IOUtils.enterParameterFromConsole;
import static com.androsor.multiarray.IOUtils.printArrayInt;
import static java.lang.Math.abs;

/**
 * A matrix is given. Print the k-th row and p-th column of the matrix.
 */
public class HomeTask3 {

    public static void main(String[] args) {

        System.out.print(" Введите разрядность массива length = ");
        int length = abs(enterParameterFromConsole());


        System.out.println(" Исходный массив");
        int[][] numbers = fillArrayRandom(length);
        printArrayInt(numbers);

        System.out.print(" Введите номер выводимой строки = ");
        int row = inputParameter(length);
        printRowMatrix(row, numbers);

        System.out.println();

        System.out.print(" Введите номер выводимого столбца = ");
        int column = inputParameter(length);
        printColumnMatrix(column, numbers);
    }

    private static int inputParameter(int length) {
        Scanner scanner = new Scanner(System.in);
        int parameter = scanner.nextInt();
        while (parameter > length) {
            System.out.println(" Значение выводимой строки/столбца не должно превышать разрядность матрицы");
            System.out.print(" Повторите ввод = ");
            parameter = abs(scanner.nextInt());
        }
        return parameter;
    }

    private static void printRowMatrix(int row, int[][] numbers) {
        System.out.printf(" %d-ая строка матрицы: ", row);
        for (int i = 0; i < numbers[0].length; i++) {
            System.out.printf("%d, ",numbers[row -1][i]);
        }
        System.out.print("\b\b");
    }
    private static void printColumnMatrix(int column, int[][] numbers) {
        System.out.printf(" %d-ый столбец матрицы:\n", column);
        for (int j = 0; j < numbers.length; j++) {
            System.out.printf(" %d\n", numbers[j][column - 1]);
        }
    }
}
