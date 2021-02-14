package com.androsor.array;

import static com.androsor.array.ArrayCreator.*;
/**
 * Find the most frequent number in an array of integers with n elements. If there are several such numbers,
 * then determine the smallest of them.
 */
public class HomeTask9 {

    public static void main (String[] args) {

        int arrayWidth; // разрядность массива

        System.out.print(" Введите разрядность массива arrayWidth = ");
        arrayWidth = inputParameter();

        System.out.println(" Исходный массив: ");
        int[] myArray = createArray((arrayWidth));
        printArray(myArray);

        printDuplicateItems(myArray);
    }

    private static void printDuplicateItems(int[] array) {
        int mostDuplicateElementCurrent = array[0]; //текущий ниболее встречающийся элемент.
        int mostDuplicates = 0; // Наибольшее число повторов.
        int mostDuplicateElement = array[0]; // Наиболее часто встречающийся элемент массива.

        for (int i = 0; i < array.length - 1; i++) {
            int mostDuplicatesCurrent = 0; // устанавливаем\сбрасываем текущее число повторов.
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    mostDuplicateElementCurrent = array[i];
                    mostDuplicatesCurrent++;
                }
            }
            if (mostDuplicatesCurrent > mostDuplicates) {
                mostDuplicates = mostDuplicatesCurrent;
                mostDuplicateElement = array[i];
            } else if  (mostDuplicates == mostDuplicatesCurrent && mostDuplicateElement > mostDuplicateElementCurrent) {
                mostDuplicateElement = array[i];
            }
        }
        if (mostDuplicates == 0) {
            System.out.println(" Повторяющихся элементов в массиве нет");
        } else {
            System.out.println(" Наименьший часто встречающийся элемент массива = " + mostDuplicateElement);
        }
    }
}

