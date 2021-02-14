package com.androsor.multiarray;

import java.util.Random;

import static com.androsor.multiarray.ArrayCreator.inputParameterArray;

/**
 * Fill the 10x20 matrix with random numbers from 0 to 15. Display the matrix itself and the row numbers in which the
 * number 5 occurs three or more times.
 */
public class HomeTask11 {

    public static void main(String[] args){

        int numberOfRows; // число строк матрицы
        int numberOfColumns; // число столбцов матрицы
        int number = 25; // число по условию задачи
        int numberOfDuplicates = 3; // количество повторов

        System.out.print(" Введите число строк массива numberOfRows = ");
        numberOfRows = inputParameterArray();
        System.out.print(" Введите число столбцов массива numberOfColumns = ");
        numberOfColumns = inputParameterArray();

        System.out.println(" Исходный массив");
        int [][] myArray = fillArray(numberOfRows, numberOfColumns);
        printArray(myArray, numberOfColumns);

        printLineWithRepetitions(myArray, numberOfColumns, number, numberOfDuplicates);
    }

    private static int[][] fillArray(int numberOfRows, int numberOfColumns) {
        int [][] array = new int[numberOfRows][numberOfColumns];
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                array[i][j] = new Random().nextInt(16);
            }
        }
        return array;
    }

    private static void printArray(int[][] array, int numberOfColumns) {
        System.out.println("----------------------------------------------------------------------------------------");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------------------------");
    }

    private static void printLineWithRepetitions(int[][] array, int numberOfColumns, int number, int numberOfDuplicates) {
        boolean flag = false; // вводим временную переменную для определения несовпадения количества встреч цифры 5.
        for (int i = 0; i < array.length; i++) {
            int numberOfDuplicatesCurrent = 0;// число встреч цифры 5 в строке матрицы.
            for (int j = 0; j < numberOfColumns; j++) {
                if (array[i][j] == number) {
                    numberOfDuplicatesCurrent++;
                }
            }
            if (numberOfDuplicatesCurrent >= numberOfDuplicates) {
                flag = true;
                System.out.printf(" %d-ая строка содержит цифру = %d, %d и более раз\n",(i + 1), number, numberOfDuplicates);
            }
        }
        if (!flag) {
            System.out.printf(" Число %d встречается реже %d раз во всех строках", number, numberOfDuplicates);
        }
    }
}
