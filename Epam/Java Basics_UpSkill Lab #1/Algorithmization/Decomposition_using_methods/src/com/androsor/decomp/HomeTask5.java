package com.androsor.decomp;

import java.util.Arrays;
import java.util.Random;

import static com.androsor.decomp.Data.*;
import static java.lang.Math.*;

/**
 * Write a program that finds the second largest number in the array A [N] (print out a number that is less than
 * the maximum element of the array, but larger than all other elements).
 */
public class HomeTask5 {

    public static void main(String[] args) {

        int arrayWidth; // Разрядность массивов.

        arrayWidth = abs(inputDataInt(" Введите длину массива arrayWidth = "));

        System.out.println(" Исходный массив: ");
        int[] myArray = fillArray(arrayWidth);
        printArray(myArray);

        printSecondLargestElement(myArray);
    }

    private static int[] fillArray(int arrayWidth) {
        int[] array = new int[arrayWidth];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = 100 - (random.nextInt(200));
        }
        return array;
    }

    private static void printArray(int[] array) {
        System.out.println("----------------------------------------");
        System.out.println(" " + Arrays.toString(array));
        System.out.println("----------------------------------------");
    }

    public static void printSecondLargestElement(int[] array) {
        Arrays.sort(array); // Сортируем массив по возрастанию.
        if (array.length < 2) {
            System.out.println(" В массиве один элемент: " + array[0]);
        } else {
            System.out.println(" Второй по величине элемент массива = " + array[array.length - 2]);
        }
    }
}

