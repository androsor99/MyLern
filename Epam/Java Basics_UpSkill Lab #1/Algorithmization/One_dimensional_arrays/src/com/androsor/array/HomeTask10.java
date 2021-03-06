package com.androsor.array;

import java.util.Arrays;

import static com.androsor.array.ArrayCreator.inputParameter;
import static com.androsor.array.ArrayCreator.createArray;
import static com.androsor.array.ArrayCreator.printArray;

/**
 * An integer array with elements of n is given. Compress the array, discarding every second element from it
 * (fill the released elements with zeros).
 */
public class HomeTask10 {

    public static void main (String[] args) {

        int arrayWidth; // разрядность массива.

        System.out.print(" Введите разрядность массива arrayWidth = ");
        arrayWidth = inputParameter();

        System.out.println(" Исходный массив ");
        int [] myArray = createArray(arrayWidth);
        printArray(myArray);

        System.out.println(" Сжатый массив");
        int [] myArrayCompressing = compressingAnArray(myArray);
        printArray(myArrayCompressing);
    }

    private static int[] compressingAnArray(int[] array) {
        int [] copyArray = Arrays.copyOf(array, array.length);
        for (int i = 1; i < copyArray.length - 1; i++) {
            copyArray[i] = copyArray[i + 1];
            for (int j = i + 1; j < copyArray.length - 1; j++) {
                copyArray[j] = copyArray[j + 1];
            }
            copyArray[array.length - 1] = 0;
        }
        return copyArray;
    }
}
