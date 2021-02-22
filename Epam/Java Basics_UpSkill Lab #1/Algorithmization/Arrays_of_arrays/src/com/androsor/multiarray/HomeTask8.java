package com.androsor.multiarray;

import java.util.Scanner;

import static com.androsor.multiarray.ArrayCreator.fillArrayRandom;
import static com.androsor.multiarray.IOUtils.enterParameterFromConsole;
import static com.androsor.multiarray.IOUtils.printArrayInt;
import static java.lang.Math.abs;

/**
 * In a numerical matrix, swap two columns of any column, that is, put all the elements of one column in the
 * corresponding positions of the other, and move its elements of the second to the first. Column numbers are entered
 * by the user from the keyboard.
 */
public class HomeTask8 {

    public static void main(String[] args) {

        System.out.print(" Введите разрядность массива length = ");
        int length = abs(enterParameterFromConsole());

        System.out.println(" Исходный массив");
        int [][] numbers = fillArrayRandom(length);
        printArrayInt(numbers);

        System.out.println(" Введите номера заменямых столбцов");
        System.out.print(" Номер первого столбца = ");
        int column_1 = inputNumberColumn(length);
        System.out.print(" Номер второго столбца = ");
        int column_2 = inputNumberColumn(length);

        System.out.println(" Матрица с измененными столбцами:");
        printArrayInt(replaceColumns(column_1, column_2, numbers));
    }

    private static int inputNumberColumn(int length) {
        Scanner scanner = new Scanner(System.in);
        int column = abs(scanner.nextInt());
        while (column > length) {
            System.out.println(" Значение заменяемого столбца не должно превышать разрядность матрицы");
            System.out.print(" Номер столбца =  ");
            column = abs(scanner.nextInt());
        }
        return column;
    }

    private static int[][] replaceColumns(int column_1, int column_2, int[][] numbers) {
        for (int i = 0; i < numbers[0].length; i++) {
            for (int j = 0; j < numbers.length; j ++) {
                int temp = numbers[i][column_1 - 1];
                numbers[i][column_1 - 1] = numbers[i][column_2 - 1];
                numbers[i][column_2 - 1] = temp;
            }
        }
        return numbers;
    }
}
