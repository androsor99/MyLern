package com.androsor.decomp;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Write a program that finds the second largest number in the array A [N] (print out a number that is less than
 * the maximum element of the array, but larger than all other elements).
 */

public class HomeTask5 {


    public static void main(String[] args) {

        int n; // Разрядность массивов.

        Scanner sc = new Scanner(System.in);
        System.out.print(" Введите количество элементов массива N = ");
        n = sc.nextInt();
        int[] myArray = new int[n];

        enterArray(myArray);
        System.out.println(" Исходный массив: ");
        System.out.println(" " + Arrays.toString(myArray));
        secondMax(myArray);
    }

    // Метод заполнения массива .
    public static void enterArray (int[] myArray) {
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
        }
    }

    // Метод нахожления второго по величине элемента массива.
    public static void secondMax(int[] array) {
        Arrays.sort(array); // Сортируем массив по возрастанию.
        // System.out.println(" " + Arrays.toString(array));
        if (array.length < 2) {
            System.out.println(" В массиве один элемент: " + array[0]);
        } else {
            System.out.println(" Второй по величине элемент массива = " + array[array.length - 2]);
        }
    }
}

