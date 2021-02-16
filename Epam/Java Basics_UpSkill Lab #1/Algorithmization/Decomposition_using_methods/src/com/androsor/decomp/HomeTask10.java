package com.androsor.decomp;

import java.util.Arrays;

import static com.androsor.decomp.Data.inputDataInt;
import static java.lang.Math.abs;

/**
 * A natural number N is given. Write a method (methods) for forming an array,
 * the elements of which are the digits of the number N.
 */
public class HomeTask10 {

    public static void main(String[] args) {

        int number = abs(inputDataInt(" Введите натуральное число: "));

        System.out.println(" Массив из цифр введенного числа: ");
        int[] myArray = fillArray(number, getArrayWidth(number));
        printArray(myArray);
    }

    public static int[] fillArray(int number, int arrayWidth) { // Метод разбиения числа на цифры
        int[] array = new int[arrayWidth];
        while (number != 0) {
            for (int i = array.length -1; i >= 0; i--) {
                int digit = number % 10;
                array[i] = digit;
                number = number / 10;
            }
        }
        return array;
    }

    public static int getArrayWidth(int number) { // Метод нахождения длины массива (равен количеству цифер числа)
        int value = 0;
        while (number != 0) {
            number = number / 10;
            value++;
        }
        return value;
    }

    private static void printArray(int[] array) {
        System.out.println("----------------------------------------");
        System.out.println(" " + Arrays.toString(array));
        System.out.println("----------------------------------------");
    }
}
