package com.androsor.sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Implement Shell sort.
 */

public class HomeTask5 {

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


        System.out.println(" Отсортированный массив по возрастанию ");
        shellSortArray(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    // Метод сортировки по Шеллу на возрастание.
    public static void shellSortArray(int[] array) {

        int inner, outer;
        int temp;

        int h = 1;
        // Ищем начальное значение интервала сортировки.
        while (h <= array.length / 3) {
            h = h * 3 + 1; // (1, 4, 13, 40, 121, ...)
        }

        while (h > 0) {
            // Сдвигаемся на 1 шаг, для h-сортировки следующей группы элементов массива.
            for (outer = h; outer < array.length; outer++) {
                temp = array[outer];
                inner = outer;
                // Сортируем массив с шагом h.
                while (inner > h - 1 && array[inner - h] >= temp) {
                    array[inner] = array[inner - h];
                    inner -= h;
                }
                array[inner] = temp;
            }
            //на каждом шаге уменьшаем h
            h = (h - 1) / 3;
        }
    }
}