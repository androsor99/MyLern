package com.androsor.array;

import java.util.Arrays;

/**
 * Given are real numbers a1, a2, ..., an. Swap the largest and smallest items.
 */
public class HomeTask4 {

    public static void main(String[] args) {

        int arrayWidth; // разрядность массива

        System.out.print(" Введите количество элементов ммассива arrayWidth = ");
        arrayWidth = HomeTask1.inputParameter();

        System.out.println(" Исходный массив:");
        int[] myArray = HomeTask2.createArray(arrayWidth);
        System.out.println(" " + Arrays.toString(myArray));

        System.out.println("-----------------");

        System.out.println(" Конечный массив: ");
        int[] swapArray = swapMaxAndMinElements(myArray);
        System.out.println(" " + Arrays.toString(swapArray));
    }

    public static int[] swapMaxAndMinElements(int[] array) {

        int itemMin = array[0]; // Принимаеи за мин. начальный элемент массива.
        int itemMax = array[0]; // Принимаем за max. первый элемент массива.
        int indexMax = 0; // Индекс максимального элемента
        int indexMin = 0; // Индекс минимального элемента

        for (int i = 1; i < array.length; i++) {
            if (array[i] < itemMin) {
                itemMin = array[i];
                indexMin = i;
            }
            else {
                if (array[i] > itemMax) {
                    itemMax = array[i];
                    indexMax = i;
                }
            }
        }
        int temp = array[indexMin]; // временная переменная
        array[indexMin] = array[indexMax]; // меняем местами min. и max.
        array[indexMax] = temp;
        return array;
    }
}
