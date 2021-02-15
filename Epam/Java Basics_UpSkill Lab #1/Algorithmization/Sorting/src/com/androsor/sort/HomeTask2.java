package com.androsor.sort;

import java.util.Arrays;

import static com.androsor.sort.ArrayCreator.*;

/**
 * Implement selection sort.
 */
public class HomeTask2 {

    public static void main(String[] args) {

        int arrayWidth; // Разрядность массивов.

        System.out.print(" Введите количество элементов массива N = ");
        arrayWidth = inputParameter();

        System.out.println(" Исходный массив с количеством элементов N = " + arrayWidth);
        int[] myArray = createArray(arrayWidth);
        printArray(myArray);

        System.out.println(" Отсортированный массив по возрастанию ");
        int[] ascendingSortedArray = sortAscending(myArray);
        printArray(ascendingSortedArray);

        System.out.println(" Отсортированный массив по убыванию");
        int[] descendingSortedArray = sortDescending(myArray);
        printArray(descendingSortedArray);
    }

    private static int[] sortAscending(int[] array) {
        int[] copyArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < copyArray.length; i++) {
            int minItem = copyArray[i];
            int indexMinItem = i;
            for (int j = i + 1; j < copyArray.length; j++) {
                if (copyArray[j] < minItem) {
                    minItem = copyArray[j];
                    indexMinItem = j;
                }
            }
            if (i != indexMinItem) {
                int temp = copyArray[i];
                copyArray[i] = copyArray[indexMinItem];
                copyArray[indexMinItem] = temp;
            }
        }
        return copyArray;
    }

    private static int[] sortDescending(int[] array) {
        int[] copyArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < copyArray.length; i++) {
            int maxItem = copyArray[i];
            int indexMaxItem = i;
            for (int j = i + 1; j < copyArray.length; j++) {
                if (copyArray[j] > maxItem) {
                    maxItem = copyArray[j];
                    indexMaxItem = j;
                }
            }
            if (i != indexMaxItem) {
                int temp = copyArray[i];
                copyArray[i] = copyArray[indexMaxItem];
                copyArray[indexMaxItem] = temp;
            }
        }
        return copyArray;
    }
}
