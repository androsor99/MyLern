package com.androsor.sort;

import java.util.Random;

import static com.androsor.sort.IOUtils.enterParameterFromConsole;

/**
 * Creates an array and fills it with random numbers.
 */
public class ArrayCreator {

    public static int[] fillArrayRandom(int length) {
        int[] numbers = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            numbers[i] = random.nextInt(100);
        }
        return numbers;
    }

    public static int[] createArrayRandom() {
        System.out.print(" Введите количество элементов массива N = ");
        int length = enterParameterFromConsole();
        System.out.println(" Исходный массив с количеством элементов N = " + length);
        return fillArrayRandom(length);
    }
}
