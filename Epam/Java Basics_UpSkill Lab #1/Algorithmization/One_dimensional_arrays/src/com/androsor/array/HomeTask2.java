package com.androsor.array;

import java.util.Arrays;

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
        arrayWidth = HomeTask1.inputParameter();

        System.out.print(" Введите число для замены replacementNumber = ");
        replacementNumber = HomeTask1.inputParameter();

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

    public static int[] createArray( int arrayWidth) {

        System.out.println(" Заполните исходный массив элементами:");
        int[] myArray = new int[arrayWidth];
        for (int i = 0; i < arrayWidth; i++) { // заполняем массив arrayWidth числами
            System.out.print(" Введите элемент массива myArray[" + i + "] = ");
            myArray[i] = HomeTask1.inputParameter();
        }
        return myArray;
    }
}


