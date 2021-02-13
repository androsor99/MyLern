package com.androsor.multiarray;

import java.util.Scanner;
import static com.androsor.multiarray.ArrayPrinter.printArrayInt;

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

        int arrayWidth; // разрядность матрицы

        System.out.print(" Введите разрядность матрицы = ");
        arrayWidth = inputParameter();

        System.out.println(" Исходный массив");
        int [][] myArray = fillyArray(arrayWidth);
        printArrayInt(myArray);
    }

    private static int[][] fillyArray(int arrayWidth) {
        int[][] array = new int[arrayWidth][arrayWidth];
        for (int i = 0; i < array.length / 2 + 1; i++) { // заполняем первую половину строк.
            for (int j = i; j < array.length - i; j++) {
                array[i][j] = 1;
            }
        }
        for (int i = array.length / 2; i < array.length; i++) { // заполняем вторую половину строк.
            for (int j = array.length - i - 1; j < i + 1; j++) {
                array[i][j] = 1;
            }
        }
        return array;
    }

    private static int inputParameter() {
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        while (temp % 2 != 0) {
            System.out.println(" Значение разрядности должно быть четным по условию");
            System.out.print(" Введите разрядность матрицы = ");
            temp = scanner.nextInt();
        }
        return temp;
    }
}