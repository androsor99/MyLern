package com.androsor.multiarray;

import java.util.Scanner;
import static com.androsor.multiarray.ArrayPrinter.printArrayInt;

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

        int arrayWidth; // разрядность матрицы

        System.out.print(" Введите разрядность матрицы = ");
        arrayWidth = inputParameter();

        System.out.println(" Исходный массив");
        int [][] myArray = fillArray(arrayWidth);
        printArrayInt(myArray);
    }

    private static int[][] fillArray(int arrayWidth) {
        int[][] array = new int[arrayWidth][arrayWidth];
        int length = array.length; // укорачиваем каждую следующую строку на один элемент.
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < length; j++) {
                array[i][j] = i + 1;
            }
            length--;
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
