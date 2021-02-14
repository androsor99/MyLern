package com.androsor.array;

import java.util.Arrays;

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
        System.out.println(" ------------------------------------------------------- ");
        int[] myArray = createArray((arrayWidth));
        System.out.println(" " + Arrays.toString(myArray));
        System.out.println(" ------------------------------------------------------- ");

        printDuplicateItems(myArray);
    }

    private static void printDuplicateItems(int[] myArray) {
        int mostCommonNumberCurrent = myArray[0]; //текущий ниболее встречающийся элемент.
        int counterLargest = 1; // Наибольшее число повторов.
        int mostCommonNumber = 0; // Наиболее часто встречающийся элемент массива.

        for (int i = 0; i < myArray.length - 1; i++) {
            int counter = 1; // устанавливаем\сбрасываем счетчик.
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]) {
                    counter++;
                    mostCommonNumberCurrent = myArray[i];
                }
            }
            if (counter > counterLargest) {
                counterLargest = counter;
                mostCommonNumber = myArray[i];
            } else if  (counterLargest == counter && mostCommonNumber > mostCommonNumberCurrent) {
                mostCommonNumber = myArray[i];
            }
        }
        if (counterLargest == 1) {
            System.out.println(" Повторяющихся элементов в массиве нет");
        }
        else {
            System.out.println(" Наименьший часто встречающийся элемент массива = " + mostCommonNumber);
        }
    }
}

