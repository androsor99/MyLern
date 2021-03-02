package com.androsor.sort;

import static com.androsor.sort.ArrayCreator.createFullArrayRandom;
import static com.androsor.sort.IOUtils.isReplace;
import static com.androsor.sort.IOUtils.printArray;
import static java.util.Arrays.copyOf;

/**
 * Implement insertion sort.
 */
public class HomeTask4 {

    public static void main(String[] args) {

        int[] numbers = createFullArrayRandom();
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
        for (int i = 1; i < copiedArray.length; i++) {
            int temp = copiedArray[i];
            int j = i - 1;
            while (j >= 0 && (isReplace(copiedArray[j], temp, sortSelection))) {
                copiedArray[j + 1] = copiedArray[j];
                j = j - 1;
            }
            copiedArray[j + 1] = temp;
        }
        return copiedArray;
    }
}
