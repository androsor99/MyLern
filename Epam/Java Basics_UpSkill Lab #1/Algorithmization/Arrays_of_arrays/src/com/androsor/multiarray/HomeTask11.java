package com.androsor.multiarray;

import java.util.Random;

import static com.androsor.multiarray.ArrayCreator.inputParameter;

/**
 * Fill the 10x20 matrix with random numbers from 0 to 15. Display the matrix itself and the row numbers in which the
 * number 5 occurs three or more times.
 */
public class HomeTask11 {

    public static void main(String[] args){

        int numberOfRows; // число строк матрицы
        int numberOfColumns; // число столбцов матрицы
        int number = 5; // число по условию задачи
        int numberOfRepetitions = 3; // количество повторов

        System.out.print(" Введите число строк массива numberOfRows = ");
        numberOfRows = inputParameter();
        System.out.print(" Введите число столбцов массива numberOfColumns = ");
        numberOfColumns = inputParameter();

        System.out.println(" Исходный массив");
        int [][] myArray = fillArray(numberOfRows, numberOfColumns);
        printArray(myArray, numberOfColumns);

        printLineWithRepetitions(myArray, numberOfColumns, number, numberOfRepetitions);
    }

    private static int[][] fillArray(int rows, int columns) {
        int [][] array = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = new Random().nextInt(16);
            }
        }
        return array;
    }

    private static void printArray(int[][] array, int columns) {
        System.out.println("----------------------------------------------------------------------------------------");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------------------------");
    }

    private static void printLineWithRepetitions(int[][] array, int columns, int number, int numberOfRepetitions) {
        int count; // число встреч цифры 5 в строке матрицы.
        int flag = 0; // вводим временную переменную для определения несовпадения встреч цифры 5.
        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = 0; j < columns; j++) {
                if (array[i][j] == number) {
                    count++;
                }
            }
            if (count >= numberOfRepetitions) {
                flag++;
                System.out.printf(" %d-ая строка содержит цифру = %d, %d и более раз\n",(i + 1), number, numberOfRepetitions);
            }
        }
        if (flag == 0) {
            System.out.printf(" Число %d встречается реже %d раз во всех строках", number, numberOfRepetitions);
        }
    }
}
