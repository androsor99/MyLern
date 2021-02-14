package com.androsor.array;

import java.util.Arrays;

import static com.androsor.array.ArrayCreator.*;

/**
 * Integers a1, a2, ..., an are given. Print only those numbers for which ai> i.
 */
public class HomeTask5 {

    public static void main(String[] args) {

        int arrayWidth; // разрядность массива

        System.out.print(" Введите количество элементов ммассива arrayWidth = ");
        arrayWidth = inputParameter();

        System.out.println(" Исходный массив: ");
        int[] myArray = createArray(arrayWidth);
        System.out.println(" " + Arrays.toString(myArray));

        System.out.println(" Список элементов массива у которых значение больше их индекса :");
        printListItems(myArray);
    }

    private static void printListItems(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > i) {
                System.out.print(myArray[i] + ", ");
            }
        }
    }
}
