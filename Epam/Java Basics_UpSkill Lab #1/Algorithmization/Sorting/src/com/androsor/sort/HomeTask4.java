package com.androsor.sort;

import java.util.Arrays;

import static com.androsor.sort.ArrayCreator.*;
import static com.androsor.sort.ArrayCreator.printArray;

/**
 * Implement insertion sort.
 */
public class HomeTask4 {

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
            int temp = copyArray[i];
            int j = i - 1;
            while (j >= 0 && copyArray[j] > temp) {
                copyArray[j + 1] = copyArray[j];
                j = j - 1;
            }
            copyArray[j + 1] = temp;
        }
        return copyArray;
    }

    private static int[] sortDescending(int[] array) {
        int[] copyArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < copyArray.length; i++) {
            int temp = copyArray[i];
            int j = i - 1;
            while (j >= 0 && copyArray[j] < temp) {
                copyArray[j + 1] = copyArray[j];
                j = j - 1;
            }
            copyArray[j + 1] = temp;
        }
        return copyArray;
    }
}
