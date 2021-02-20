package com.androsor.sort;

import static com.androsor.sort.ArrayCreator.createArrayRandom;
import static com.androsor.sort.IOUtils.enterParameterFromConsole;
import static com.androsor.sort.IOUtils.printArray;
import static java.util.Arrays.copyOf;

/**
 * Implement Shell sort.
 */
public class HomeTask5 {

    public static void main(String[] args) {

        System.out.print(" Введите количество элементов массива N = ");
        int length = enterParameterFromConsole();

        System.out.println(" Исходный массив с количеством элементов N = " + length);
        int[] numbers = createArrayRandom(length);
        printArray(numbers);

        System.out.println(" Отсортированный массив по возрастанию ");
        int[] sortedNumbersAscending = sortAscending(numbers);
        printArray(sortedNumbersAscending);

        System.out.println(" Отсортированный массив по убыванию");
        int[] sortedNumbersDescending = sortDescending(numbers);
        printArray(sortedNumbersDescending);
    }

    private static int[] sortAscending(int[] array) {
        int[] copyArray = copyOf(array, array.length);
        int inner, outer, temp;
        int h = getSortingInterval(copyArray.length);
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

    private static int getSortingInterval(int length) {
        int h = 1; // интервал сортировки
        while (h <= length / 3) { // Ищем начальное значение интервала сортировки.
            h = h * 3 + 1; // (1, 4, 13, 40, 121, ...)
        }
        return h;
    }

    private static int[] sortDescending(int[] array) {
        int[] copyArray = copyOf(array, array.length);
        int inner, outer, temp;
        int h = getSortingInterval(copyArray.length);
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
