package com.androsor.multiarray;

import java.util.Scanner;

import static com.androsor.multiarray.ArrayCreator.fillArray;
import static com.androsor.multiarray.ArrayPrinter.printArrayInt;

/**
 * In a numerical matrix, swap two columns of any column, that is, put all the elements of one column in the
 * corresponding positions of the other, and move its elements of the second to the first. Column numbers are entered
 * by the user from the keyboard.
 */
public class HomeTask8 {

    public static void main (String[] args) {

        int arrayWidth; // разрядность матрицы
        int column1; // Номер первого заменяемого столбца.
        int column2; // Номер второго заменяемого столбца.

        System.out.print(" Введите разрядность массива arrayWidth = ");
        arrayWidth = ArrayCreator.inputParameterArray();

        System.out.println(" Исходный массив");
        int [][] myArray = fillArray(arrayWidth);
        printArrayInt(myArray);


        System.out.println(" Введите номера заменямых столбцов");
        System.out.print(" Номер первого столбца = ");
        column1 = inputNumberColumn(arrayWidth);
        System.out.print(" Номер второго столбца = ");
        column2 = inputNumberColumn(arrayWidth);

        System.out.println(" Матрица с измененными столбцами:");
        printArrayInt (replacingColumns(column1, column2, myArray));
    }

    private static int inputNumberColumn(int arrayWidth) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (num > arrayWidth) {
            System.out.println(" Значение заменяемого столбца не должно превышать разрядность матрицы");
            System.out.print(" Номер столбца =  ");
            num = scanner.nextInt();
        }
        return num;
    }

    private static int[][] replacingColumns(int column1, int column2, int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j ++) {
                int temp = array[i][column1 - 1];
                array[i][column1 - 1] = array[i][column2 - 1];
                array[i][column2 - 1] = temp;
            }
        }
        return array;
    }
}
