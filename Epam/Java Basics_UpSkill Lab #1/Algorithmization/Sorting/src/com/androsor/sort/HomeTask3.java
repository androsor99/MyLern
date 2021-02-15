package com.androsor.sort;

import java.util.Arrays;

import static com.androsor.sort.ArrayCreator.*;

/**
 * Implement exchange sort.
 */
public class HomeTask3 {

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

    private static int[] sortDescending(int[] array) {
        int[] copyArray = Arrays.copyOf(array, array.length);
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
