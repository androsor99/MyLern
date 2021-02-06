package com.androsor.sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Implement insertion sort.
 */

public class HomeTask4 {

    public static void main(String[] args) {

        int[] myArray; // массив с N количеством элементов.
        int n; // Разрядность массивов.

        Scanner sc = new Scanner(System.in);
        System.out.print(" Введите количество элементов первого ммассива N = ");
        n = sc.nextInt();
        Random random = new Random();
        myArray = new int[n];
        for (int i = 0; i < n; i++) {
            myArray[i] = random.nextInt(100);
        }

        System.out.println(" Исходный массив с количеством элементов N = " + n);
        System.out.println(Arrays.toString(myArray));
        System.out.println();

        // Сортируем по возрастанию.

        for (int i = 0; i < myArray.length; i++) {
            int value = myArray[i];
            int j = i - 1;
            while (j >= 0 && myArray[j] > value) {
                myArray[j + 1] = myArray[j];
                j = j - 1;
            }

            myArray[j + 1] = value;
        }

        System.out.println(" Отсортированный массив по возрастанию ");
        System.out.println(Arrays.toString(myArray));
        System.out.println();

        // Сортируем по убыванию.

        for (int i = 0; i < myArray.length; i++) {
            int value = myArray[i];
            int j = i - 1;
            while (j >= 0 && myArray[j] < value) {
                myArray[j + 1] = myArray[j];
                j = j - 1;
            }

            myArray[j + 1] = value;
        }

        System.out.println(" Отсортированный массив по убыванию");
        System.out.println(Arrays.toString(myArray));
    }
}

