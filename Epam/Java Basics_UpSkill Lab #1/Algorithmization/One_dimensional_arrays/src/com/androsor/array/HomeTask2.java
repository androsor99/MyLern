package com.androsor.array;

import static com.androsor.array.ArrayCreator.inputParameter;
import static com.androsor.array.ArrayCreator.createArray;
import static com.androsor.array.ArrayCreator.printArray;

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
        printArray(myArray);

        System.out.println(" Замененный массив:");
        numberOfReplace = getNumberOfReplace(myArray, replacementNumber);
        printArray(myArray);
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


