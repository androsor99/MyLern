package com.androsor.sort;

import java.util.Arrays;
import java.util.Scanner;

import static com.androsor.sort.ArrayCreator.fillArrayRandom;

/**
 * Entering parameters and printing an array
 */
public class IOUtils {

    public static int enterParameterFromConsole(String message) {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Введенные данные не являются натуральными числами. Повторите ввод.");
        }
        return scanner.nextInt();
    }

    public static int[] createArrayRandom() {
        int length = enterParameterFromConsole("Введите количество элементов массива N = ");
        System.out.println(" Исходный массив с количеством элементов N = " + length);
        return fillArrayRandom(length);
    }

    public static void printArray(int[] array, String message) {
        System.out.println(message);
        System.out.println("----------------------------------------");
        System.out.println(" " + Arrays.toString(array));
        System.out.println("----------------------------------------");
    }
}
