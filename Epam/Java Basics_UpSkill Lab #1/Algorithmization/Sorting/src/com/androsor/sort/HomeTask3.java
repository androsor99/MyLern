package com.androsor.sort;

import static com.androsor.sort.ArrayCreator.createArrayRandom;
import static com.androsor.sort.IOUtils.enterParameterFromConsole;
import static com.androsor.sort.IOUtils.printArray;
import static java.util.Arrays.copyOf;

/**
 * Implement exchange sort.
 */
public class HomeTask3 {

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
        for(int i = copyArray.length-1 ; i > 0 ; i--) {
            for(int j = 0 ; j < i ; j++) {
                if( copyArray[j] > copyArray[j+1] ) {
                    int temp = copyArray[j];
                    copyArray[j] = copyArray[j+1];
                    copyArray[j+1] = temp;
                }
            }
        }
        return copyArray;
    }

    private static int[] sortDescending(int[] numbers) {
        int[] copyArray = copyOf(numbers, numbers.length);
        for(int i = copyArray.length-1 ; i > 0 ; i--) {
            for(int j = 0 ; j < i ; j++) {
                if( copyArray[j] < copyArray[j+1] ) {
                    int temp = copyArray[j];
                    copyArray[j] = copyArray[j+1];
                    copyArray[j+1] = temp;
                }
            }
        }
        return copyArray;
    }
}
