package com.androsor.array;

import java.util.Arrays;

/**
 * You are given an array of real numbers, the dimension of which is N.
 * Calculate how many negative, positive and zero elements it contains.
 */
public class HomeTask3 {

    public static void main(String[] args) {

        int arrayWidth; // разрядность массива

        System.out.print(" Введите количество элементов ммассива arrayWidth = ");
        arrayWidth = HomeTask1.inputParameter();

        System.out.println(" Исходный массив:");
        int[] myArray = HomeTask2.createArray(arrayWidth);
        System.out.println(Arrays.toString(myArray));

        countingTheNumberOfElements(myArray);
    }

    private static void countingTheNumberOfElements(int[] array) {

        int numberOfPositive = 0; // Количество положительных элементов
        int numberOfNegative = 0; // Количество отрицательных элементов
        int numberOfZero = 0; // Количество элементов равных нулю
        for (int elem : array) {
            if (elem == 0) {
                numberOfZero++;
                continue;
            }
            if (elem > 0) {
                numberOfPositive++;
                continue;
            }
            numberOfNegative++;
        }
        System.out.println(" Количество положительных элементов =  " + numberOfPositive);
        System.out.println(" Количество отрицательных элементов =  " + numberOfNegative);
        System.out.println(" Количество элементов равных 0 =  " + numberOfZero);
    }
}
