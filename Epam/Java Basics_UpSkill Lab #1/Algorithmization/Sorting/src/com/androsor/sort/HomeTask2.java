package com.androsor.sort;

import static com.androsor.sort.ArrayCreator.createArrayRandom;
import static com.androsor.sort.IOUtils.enterParameterFromConsole;
import static com.androsor.sort.IOUtils.printArray;
import static java.util.Arrays.copyOf;

/**
 * Implement selection sort.
 */
public class HomeTask2 {

    public static void main(String[] args) {

        System.out.print(" Введите количество элементов массива N = ");
        int length = enterParameterFromConsole();

        System.out.println(" Исходный массив с количеством элементов N = " + length);
        int[] numbers = createArrayRandom(length);
        printArray(numbers);

        System.out.println(" Отсортированный массив по возрастанию ");
        int[] sortedNumbersAscending = sortAscending(numbers);
        printArray(sortedNumbersAscending);

        System.out.println(" Отсортированный массив по убыванию");
        int[] sortedNumbersDescending = sortDescending(numbers);
        printArray(sortedNumbersDescending);
    }

    private static int[] sortAscending(int[] numbers) {
        int[] copyArray = copyOf(numbers, numbers.length);
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
        int[] copyArray = copyOf(numbers, numbers.length);
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
