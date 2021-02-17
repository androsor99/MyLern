package com.androsor.sort;

import java.util.Arrays;

import static com.androsor.sort.ArrayCreator.inputParameter;
import static com.androsor.sort.ArrayCreator.createArray;
import static com.androsor.sort.ArrayCreator.printArray;

/**
 * Implement exchange sort.
 */
public class HomeTask3 {

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
        int[] copyArray = Arrays.copyOf(numbers, numbers.length);
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
