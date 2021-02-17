package com.androsor.sort;

import java.util.Arrays;

import static com.androsor.sort.ArrayCreator.inputParameter;
import static com.androsor.sort.ArrayCreator.createArray;
import static com.androsor.sort.ArrayCreator.printArray;

/**
 * Implement selection sort.
 */
public class HomeTask2 {

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
            int minItem = copyArray[i];
            int indexMinItem = i;
            for (int j = i + 1; j < copyArray.length; j++) {
                if (copyArray[j] < minItem) {
                    minItem = copyArray[j];
                    indexMinItem = j;
                }
            }
            rearrangeArrayElements(copyArray, i, indexMinItem);
        }
        return copyArray;
    }

    private static int[] sortDescending(int[] numbers) {
        int[] copyArray = Arrays.copyOf(numbers, numbers.length);
        for (int i = 0; i < copyArray.length; i++) {
            int maxItem = copyArray[i];
            int indexMaxItem = i;
            for (int j = i + 1; j < copyArray.length; j++) {
                if (copyArray[j] > maxItem) {
                    maxItem = copyArray[j];
                    indexMaxItem = j;
                }
            }
            rearrangeArrayElements(copyArray, i, indexMaxItem);
        }
        return copyArray;
    }

    private static void rearrangeArrayElements(int[] numbers, int indexFrom, int indexTo) {
        if (indexFrom != indexTo) {
            int temp = numbers[indexFrom];
            numbers[indexFrom] = numbers[indexTo];
            numbers[indexTo] = temp;
        }
    }
}
