package com.androsor.sort;

import java.util.Scanner;

import static com.androsor.sort.ArrayCreator.createArrayRandom;
import static com.androsor.sort.IOUtils.enterParameterFromConsole;
import static com.androsor.sort.IOUtils.printArray;

/**
 * Two one-dimensional arrays with different number of elements and a natural number k are given.
 * Combine them into one array, including the second array between the kth and (k + 1) - th elements of the first,
 * without using an additional array.
 */
public class HomeTask1 {

    public static void main(String[] args) {

        System.out.print(" Введите количество элементов первого ммассива M = ");
        int length_M = enterParameterFromConsole();

        System.out.println(" Первый массив с количеством элементов M = " + length_M);
        int[] numbersM = createArrayRandom(length_M);
        printArray(numbersM);

        System.out.print(" Введите количество элементов первого ммассива N = ");
        int length_N = enterParameterFromConsole();

        System.out.println(" Второй массив с количеством элементов N = " + length_N);
        int[] numbersN = createArrayRandom(length_N);
        printArray(numbersN);

        System.out.print(" Введите индекс элемента первого массива после кторого будет вставлен второй массив, K = ");
        int index_K = inputIndex(length_M);

        System.out.println(" Объединенный массив с количеством элементов M + N = " + (length_M + length_N));
        int[] numbersMN = concatenateArrays(index_K, numbersM, numbersN);
        printArray(numbersMN);
    }

    private static int inputIndex(int length) {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        while ((index > length) || (index < 0)) {
            System.out.println(" Индекс элемента первого массива не должен превышать его длину и быть больше нуля");
            System.out.print(" Введите индекс элемента первого массива после кторого будет вставлен второй массив, K = ");
            index = scanner.nextInt();
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
