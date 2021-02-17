package com.androsor.sort;

import java.util.Arrays;

import static com.androsor.sort.ArrayCreator.inputParameter;
import static com.androsor.sort.ArrayCreator.createArray;
import static com.androsor.sort.ArrayCreator.printArray;

/**
 * Implement insertion sort.
 */
public class HomeTask4 {

    public static void main(String[] args) {

        System.out.print(" Введите количество элементов массива N = ");
        int length = inputParameter();

        System.out.println(" Исходный массив с количеством элементов N = " + length);
        int[] numbers = createArray(length);
        printArray(numbers);

        System.out.println(" Отсортированный массив по возрастанию ");
        int[] sortedNumbersAscending = sortAscending(numbers);
        printArray(sortedNumbersAscending);

        System.out.println(" Отсортированный массив по убыванию");
        int[] sortedNumbersDescending = sortDescending(numbers);
        printArray(sortedNumbersDescending);
    }

    private static int[] sortAscending(int[] numbers) {
        int[] copyArray = Arrays.copyOf(numbers, numbers.length);
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

    private static int[] sortDescending(int[] numbers) {
        int[] copyArray = Arrays.copyOf(numbers, numbers.length);
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
