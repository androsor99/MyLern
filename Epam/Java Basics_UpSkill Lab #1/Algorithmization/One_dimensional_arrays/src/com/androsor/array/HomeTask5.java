package com.androsor.array;

import static com.androsor.array.ArrayCreator.inputParameter;
import static com.androsor.array.ArrayCreator.createArray;
import static com.androsor.array.ArrayCreator.printArray;

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
        printArray(myArray);

        System.out.println(" Список элементов массива у которых значение больше их индекса :");
        printListItems(myArray);
    }

    private static void printListItems(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.print(array[i] + ", ");
            }
        }
    }
}
