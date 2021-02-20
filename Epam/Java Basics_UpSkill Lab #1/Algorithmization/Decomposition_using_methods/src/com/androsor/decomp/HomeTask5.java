package com.androsor.decomp;

import java.util.Arrays;
import java.util.Random;

import static com.androsor.decomp.IOUtils.enterParameterFromConsoleInt;
import static java.lang.Math.abs;
import static java.util.Arrays.sort;


/**
 * Write a program that finds the second largest number in the array A [N] (print out a number that is less than
 * the maximum element of the array, but larger than all other elements).
 */
public class HomeTask5 {

    public static void main(String[] args) {

        int length = abs(enterParameterFromConsoleInt(" Введите длину массива length = "));

        System.out.println(" Исходный массив: ");
        int[] numbers = fillArray(length);
        printArray(numbers);

        printSecondLargestElement(numbers);
    }

    private static int[] fillArray(int length) {
        int[] numbers = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            numbers[i] = 100 - (random.nextInt(200));
        }
        return numbers;
    }

    private static void printArray(int[] numbers) {
        System.out.println("----------------------------------------");
        System.out.println(" " + Arrays.toString(numbers));
        System.out.println("----------------------------------------");
    }

    public static void printSecondLargestElement(int[] numbers) {
        sort(numbers); // Сортируем массив по возрастанию.
        if (numbers.length < 2) {
            System.out.println(" В массиве один элемент: " + numbers[0]);
        } else {
            System.out.println(" Второй по величине элемент массива = " + numbers[numbers.length - 2]);
        }
    }
}
