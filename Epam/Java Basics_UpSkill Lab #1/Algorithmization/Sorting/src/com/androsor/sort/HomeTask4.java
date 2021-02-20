package com.androsor.sort;

import static com.androsor.sort.ArrayCreator.createArrayRandom;
import static com.androsor.sort.IOUtils.enterParameterFromConsole;
import static com.androsor.sort.IOUtils.printArray;
import static java.util.Arrays.copyOf;

/**
 * Implement insertion sort.
 */
public class HomeTask4 {

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
        int[] copyArray = copyOf(numbers, numbers.length);
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
