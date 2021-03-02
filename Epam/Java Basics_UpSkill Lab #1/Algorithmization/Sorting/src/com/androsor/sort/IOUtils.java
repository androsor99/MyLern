package com.androsor.sort;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.abs;

/**
 * Entering parameters and printing an array
 */
public class IOUtils {

    public static int enterParameterFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return abs(scanner.nextInt());
    }

    public static boolean isReplace(int numberFrom, int numberTo, boolean sortSelection) {
        if (sortSelection) {
            return numberFrom > numberTo;
        } else {
            return numberFrom < numberTo;
        }
    }

    public static void printArray(int[] array) {
        System.out.println("----------------------------------------");
        System.out.println(" " + Arrays.toString(array));
        System.out.println("----------------------------------------");
    }
}