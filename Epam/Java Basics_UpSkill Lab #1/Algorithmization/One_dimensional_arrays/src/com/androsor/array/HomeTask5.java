package com.androsor.array;

import java.util.Arrays;

/**
 * Integers a1, a2, ..., an are given. Print only those numbers for which ai> i.
 */
public class HomeTask5 {

    public static void main(String[] args) {

        int arrayWidth; // разрядность массива

        System.out.print(" Введите количество элементов ммассива arrayWidth = ");
        arrayWidth = HomeTask1.inputParameter();

        System.out.println(" Исходный массив: ");
        int[] myArray = HomeTask2.createArray(arrayWidth);
        System.out.println(" " + Arrays.toString(myArray));

        System.out.println(" Список элементов массива у которых значение больше их индекса :");
        findingItems(myArray);
    }

    private static void findingItems(int[] myArray) {

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > i) {
                System.out.print(myArray[i] + ", ");
            }
        }
    }
}
