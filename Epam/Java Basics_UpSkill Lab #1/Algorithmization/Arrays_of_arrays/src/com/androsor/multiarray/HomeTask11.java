package com.androsor.multiarray;

import java.util.Random;

/**
 * Fill the 10x20 matrix with random numbers from 0 to 15. Display the matrix itself and the row numbers in which the
 * number 5 occurs three or more times.
 */
public class HomeTask11 {

    public static void main(String[] args){

        int rows = 10; // число строк матрицы
        int columns = 20; // число столбцов матрицы
        int numbers = 15; // случайные числа от 0 до 15
        int number = 5; // число по условию задачи
        int iteration = 3; // количество повторов

        System.out.println(" Исходный массив");
        int [][] elements = fillArray(rows, columns, numbers);
        printArray(elements, columns);

        printRowWithIteration(elements, columns, number, iteration);
    }

    private static int[][] fillArray(int rows, int columns, int numbers) {
        int [][] elements = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                elements[i][j] = new Random().nextInt(numbers + 1);
            }
        }
        return elements;
    }

    private static void printArray(int[][] elements, int columns) {
        System.out.println("----------------------------------------------------------------------------------------");
        for (int[] element : elements) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("%4d", element[j]);
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------------------------");
    }

    private static void printRowWithIteration(int[][] elements, int columns, int number, int iteration) {
        boolean flag = false; // вводим временную переменную для определения несовпадения количества встреч цифры 5.
        for (int i = 0; i < elements.length; i++) {
            int count = 0;// число встреч цифры 5 в строке матрицы.
            for (int j = 0; j < columns; j++) {
                if (elements[i][j] == number) {
                    count++;
                }
            }
            if (count >= iteration) {
                System.out.printf(" %d-ая строка содержит цифру = %d, %d и более раз\n", (i + 1), number, iteration);
                flag = true;
            }
        }
        if (!flag) {
            System.out.printf(" Число %d встречается реже %d раз во всех строках", number, iteration);
        }
    }
}
