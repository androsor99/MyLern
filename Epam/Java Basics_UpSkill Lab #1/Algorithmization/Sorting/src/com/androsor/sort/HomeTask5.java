package com.androsor.sort;

import java.util.Arrays;

import static com.androsor.sort.ArrayCreator.inputParameter;
import static com.androsor.sort.ArrayCreator.createArray;
import static com.androsor.sort.ArrayCreator.printArray;

/**
 * Implement Shell sort.
 */
public class HomeTask5 {

    public static void main(String[] args) {

        System.out.print(" Введите количество элементов массива N = ");
        int length = inputParameter();

        System.out.println(" Исходный массив с количеством элементов N = " + length);
        int[] numbers = createArray(length);
        printArray(numbers);

        System.out.println(" Отсортированный массив по возрастанию ");
        int[] sortedNumbersAscending = sortAscending(numbers);
        printArray(sortedNumbersAscending);

        System.out.println(" Отсортированный массив по убыванию");
        int[] sortedNumbersDescending = sortDescending(numbers);
        printArray(sortedNumbersDescending);
    }

    private static int[] sortAscending(int[] array) {
        int[] copyArray = Arrays.copyOf(array, array.length);
        int inner, outer, temp;
        int h = 1; // интервал сортировки
        while (h <= copyArray.length / 3) { // Ищем начальное значение интервала сортировки.
            h = h * 3 + 1; // (1, 4, 13, 40, 121, ...)
        }
        while (h >= 1) {
            for (outer = h; outer < copyArray.length; outer++) { // Сдвигаемся на 1 шаг, для h-сортировки следующей группы элементов массива.
                temp = copyArray[outer];
                inner = outer;
                while (inner > h - 1 && copyArray[inner - h] >= temp) { // Сортируем массив с шагом h.
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
            for (outer = h; outer < copyArray.length; outer++) { // Сдвигаемся на 1 шаг, для h-сортировки следующей группы элементов массива.
                temp = copyArray[outer];
                inner = outer;
                while (inner > h - 1 && copyArray[inner - h] <= temp) { // Сортируем массив с шагом h.
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
