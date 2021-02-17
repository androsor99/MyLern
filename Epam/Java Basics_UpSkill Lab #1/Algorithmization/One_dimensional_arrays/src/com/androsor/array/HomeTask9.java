package com.androsor.array;

import static com.androsor.array.ArrayCreator.inputParameter;
import static com.androsor.array.ArrayCreator.createArray;
import static com.androsor.array.ArrayCreator.printArray;

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
        int duplicateElement = array[0]; // Наиболее часто встречающийся элемент массива.
        int iteration = 1; // Наибольшее число встреч.
        int minElement = array[0]; // мин элемент массива.
        for (int i = 0; i < array.length - 1; i++) {
            int count = 1; // устанавливаем\сбрасываем текущее число повторов.
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                } else if (minElement > array[j]) {
                    minElement = array[j];
                }
            }
            if (count > iteration) {
                iteration = count;
                duplicateElement = array[i];
            } else if (iteration == count && duplicateElement > array[i]) {
                duplicateElement = array[i];
            }
        }
        if (iteration == 1) {
            System.out.println(" Наименьший часто встречающийся элемент массива = " + minElement);
        } else {
            System.out.println(" Наименьший часто встречающийся элемент массива = " + duplicateElement);
        }
    }
}
