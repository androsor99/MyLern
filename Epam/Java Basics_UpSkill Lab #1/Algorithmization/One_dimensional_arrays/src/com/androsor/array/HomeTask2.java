package com.androsor.array;

import java.util.Arrays;

import static com.androsor.array.ArrayCreator.*;

/**
 * A sequence of real numbers a1, a2, ..., an is given. Replace all its members greater than the given Z with this number.
 * Count the number of substitutions.
 */
public class HomeTask2 {

    public static void main(String[] args) {

        int arrayWidth; // разрядность массива
        int replacementNumber; // Число для замены
        int numberOfReplace; // Количество замен

        System.out.print(" Введите количество элементов массива arrayWidth = ");
        arrayWidth = inputParameter();

        System.out.print(" Введите число для замены replacementNumber = ");
        replacementNumber = inputParameter();

        System.out.println(" Исходный массив:");
        int[] myArray = createArray(arrayWidth);
        System.out.println(Arrays.toString(myArray));

        System.out.println(" Замененный массив:");
        numberOfReplace = getNumberOfReplace(myArray, replacementNumber);
        System.out.println(Arrays.toString(myArray));
        System.out.println(" Число замен =  " + numberOfReplace);
    }

    private static int getNumberOfReplace(int[] array, int replacementNumber) {
        int numberOfReplace = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > replacementNumber) {
                array[i] = replacementNumber;
                numberOfReplace++;
            }
        }
        return numberOfReplace;
    }
}


