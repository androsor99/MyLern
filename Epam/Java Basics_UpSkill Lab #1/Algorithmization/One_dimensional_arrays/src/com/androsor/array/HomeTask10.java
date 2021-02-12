package com.androsor.array;

import java.util.Arrays;
import java.util.Random;

/**
 * An integer array with elements of n is given. Compress the array, discarding every second element from it
 * (fill the released elements with zeros).
 */
public class HomeTask10 {

    public static void main (String[] args) {

        int arrayWidth; // разрядность массива.

        System.out.print(" Введите разрядность массива arrayWidth = ");
        arrayWidth = HomeTask1.inputParameter();

        System.out.println(" Исходный массив ");
        int [] myArray = createArray(arrayWidth);
        printArray(myArray);

        System.out.println(" Сжатый массив");
        int [] myArrayCompressing = compressingAnArray(myArray);
        printArray(myArrayCompressing);
    }

    private static int[] compressingAnArray(int[] array) {

        for (int i = 1; i < array.length - 1; i++) {
            array[i] = array[i + 1];

            for (int j = i + 1; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = 0;
        }
        return array;
    }

    private static void printArray(int[] myArray) {

        System.out.println("----------------------------------------");
        System.out.println(" " + Arrays.toString(myArray));
        System.out.println("----------------------------------------");
    }

    private static int[] createArray(int arrayWidth) {

        int[] myArray = new int[arrayWidth];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = new Random().nextInt(30);
        }
        return myArray;
    }
}
