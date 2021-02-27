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
        int[] sortedNumbersAscending = sort(numbers, true);
        printArray(sortedNumbersAscending);

        System.out.println(" Отсортированный массив по убыванию");
        int[] sortedNumbersDescending = sort(numbers, false);
        printArray(sortedNumbersDescending);
    }

    private static int[] sort(int[] numbers, boolean sortSelection) {
        int[] copiedArray = copyOf(numbers, numbers.length);
        for (int i = 0; i < copiedArray.length; i++) {
            int minOrMaxItem = copiedArray[i];
            int indexMinOrMaxItem = i;
            for (int j = i + 1; j < copiedArray.length; j++) {
                if (sortSelection ? (copiedArray[j] < minOrMaxItem) : (copiedArray[j] > minOrMaxItem)){
                    minOrMaxItem = copiedArray[j];
                    indexMinOrMaxItem = j;
                }
            }
            copiedArray[indexMinOrMaxItem] = copiedArray[i];
            copiedArray[i] = minOrMaxItem;
        }
        return copiedArray;
    }
}
