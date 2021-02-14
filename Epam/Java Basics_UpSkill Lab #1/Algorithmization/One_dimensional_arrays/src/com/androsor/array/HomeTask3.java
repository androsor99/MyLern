package com.androsor.array;

import static com.androsor.array.ArrayCreator.*;

/**
 * You are given an array of real numbers, the dimension of which is N.
 * Calculate how many negative, positive and zero elements it contains.
 */
public class HomeTask3 {

    public static void main(String[] args) {

        int arrayWidth; // разрядность массива

        System.out.print(" Введите количество элементов массива arrayWidth = ");
        arrayWidth = inputParameter();

        System.out.println(" Исходный массив:");
        int[] myArray = createArray(arrayWidth);
        printArray(myArray);

        printNumberOfElements(myArray);
    }

    private static void printNumberOfElements(int[] array) {
        int numberOfPositive = 0; // Количество положительных элементов
        int numberOfNegative = 0; // Количество отрицательных элементов
        int numberOfZero = 0; // Количество элементов равных нулю
        for (int elem : array) {
            if (elem == 0) {
                numberOfZero++;
            } else if (elem > 0) {
                numberOfPositive++;
            } else {
            numberOfNegative++;
            }
        }
        System.out.println(" Количество положительных элементов =  " + numberOfPositive);
        System.out.println(" Количество отрицательных элементов =  " + numberOfNegative);
        System.out.println(" Количество элементов равных 0 =  " + numberOfZero);
    }
}
