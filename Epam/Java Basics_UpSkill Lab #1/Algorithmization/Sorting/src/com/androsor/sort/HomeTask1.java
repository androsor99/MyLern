package com.androsor.sort;

import static com.androsor.sort.ArrayCreator.fillArrayRandom;
import static com.androsor.sort.IOUtils.enterParameterFromConsole;
import static com.androsor.sort.IOUtils.printArray;

/**
 * Two one-dimensional arrays with different number of elements and a natural number k are given.
 * Combine them into one array, including the second array between the kth and (k + 1) - th elements of the first,
 * without using an additional array.
 */
public class HomeTask1 {

    public static void main(String[] args) {

        int length_M = enterParameterFromConsole("Введите количество элементов первого массива M = ");
        int[] numbersM = fillArrayRandom(length_M);
        printArray(numbersM, String.format(" Первый массив с количеством элементов M = %d", length_M));

        int length_N = enterParameterFromConsole("Введите количество элементов второго массива N = ");
        int[] numbersN = fillArrayRandom(length_N);
        printArray(numbersN, String.format("Второй массив с количеством элементов N = %d", length_N));

        int index_K = inputIndex(length_M, "Введите индекс элемента первого массива после кторого будет вставлен второй массив, K = ");
        int[] numbersMN = concatenateArrays(index_K, numbersM, numbersN);
        printArray(numbersMN, "Объединенный массив с количеством элементов M + N = %d" + (length_M + length_N));
    }

    private static int inputIndex(int length, String message) {
        int index = enterParameterFromConsole(message);
        if ((index > length) || (index < 0)) {
            System.out.println(" Индекс элемента первого массива не должен превышать его длину и быть больше нуля");
            return inputIndex(length, message);
        }
        return index;
    }

    private static int[] concatenateArrays(int index, int[] numbersM, int[] numbersN) {
        int[] numbers = new int [numbersM.length + numbersN.length];
        System.arraycopy(numbersM, 0, numbers, 0, index);
        System.arraycopy(numbersN, 0, numbers, index, numbersN.length);
        System.arraycopy(numbersM, index, numbers, (index + numbersN.length), (numbersM.length - index));
        return numbers;
    }
}
