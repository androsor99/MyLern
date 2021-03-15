package com.androsor.decomp;

import static com.androsor.decomp.Helper.fillArray;
import static com.androsor.decomp.IOUtils.enterParameterFromConsoleInt;
import static com.androsor.decomp.IOUtils.printArray;
import static java.util.Arrays.copyOf;
import static java.util.Arrays.sort;


/**
 * Write a program that finds the second largest number in the array A [N] (print out a number that is less than
 * the maximum element of the array, but larger than all other elements).
 */
public class HomeTask5 {

    public static void main(String[] args) {

        int length = enterParameterFromConsoleInt(" Введите длину массива length = ");

        System.out.println(" Исходный массив: ");
        int[] numbers = fillArray(length);
        printArray(numbers);

        int secondLargestElement = findSecondLargestElement(numbers);
        System.out.printf("\nВторой по величине элемент массива = %d", secondLargestElement);
    }

    public static int findSecondLargestElement(int[] numbers) {
        if (numbers.length < 2) {
            return numbers[0];
        } else {
            int[] copiedNumbers = copyOf(numbers, numbers.length);
            sort(copiedNumbers);
            return copiedNumbers[copiedNumbers.length - 2];
        }
    }
}
