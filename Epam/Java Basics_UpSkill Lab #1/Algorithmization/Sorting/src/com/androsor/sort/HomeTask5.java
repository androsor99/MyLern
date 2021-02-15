package com.androsor.sort;

import java.util.Arrays;

import static com.androsor.sort.ArrayCreator.*;

/**
 * Implement Shell sort.
 */
public class HomeTask5 {

    public static void main(String[] args) {

        int arrayWidth; // Разрядность массивов.

        System.out.print(" Введите количество элементов массива N = ");
        arrayWidth = inputParameter();

        System.out.println(" Исходный массив с количеством элементов N = " + arrayWidth);
        int[] myArray = createArray(arrayWidth);
        printArray(myArray);

        System.out.println(" Отсортированный массив по возрастанию ");
        int[] ascendingSortedArray = sortAscending(myArray);
        printArray(ascendingSortedArray);

        System.out.println(" Отсортированный массив по убыванию");
        int[] descendingSortedArray = sortDescending(myArray);
        printArray(descendingSortedArray);
    }

    private static int[] sortAscending(int[] array) {
        int[] copyArray = Arrays.copyOf(array, array.length);
        int inner, outer, temp;
        int h = 1; // интервал сортировки
        while (h <= copyArray.length / 3) { // Ищем начальное значение интервала сортировки.
            h = h * 3 + 1; // (1, 4, 13, 40, 121, ...)
        }
        while (h >= 1) {
            for (outer = h; outer < copyArray.length; outer++) {// Сдвигаемся на 1 шаг, для h-сортировки следующей группы элементов массива.
                temp = copyArray[outer];
                inner = outer;
                while (inner > h - 1 && copyArray[inner - h] >= temp) {// Сортируем массив с шагом h.
                    copyArray[inner] = copyArray[inner - h];
                    inner -= h;
                }
                copyArray[inner] = temp;
            }
            h = (h - 1) / 3; //на каждом шаге уменьшаем h
        }
        return copyArray;
    }

    private static int[] sortDescending(int[] array) {
        int[] copyArray = Arrays.copyOf(array, array.length);
        int inner, outer, temp;
        int h = 1; // интервал сортировки
        while (h <= copyArray.length / 3) { // Ищем начальное значение интервала сортировки.
            h = h * 3 + 1; // (1, 4, 13, 40, 121, ...)
        }
        while (h >= 1) {
            for (outer = h; outer < copyArray.length; outer++) {// Сдвигаемся на 1 шаг, для h-сортировки следующей группы элементов массива.
                temp = copyArray[outer];
                inner = outer;
                while (inner > h - 1 && copyArray[inner - h] <= temp) {// Сортируем массив с шагом h.
                    copyArray[inner] = copyArray[inner - h];
                    inner -= h;
                }
                copyArray[inner] = temp;
            }
            h = (h - 1) / 3; //на каждом шаге уменьшаем h
        }
        return copyArray;
    }
}
