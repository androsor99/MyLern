package com.androsor.sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayCreator {

    public static int inputParameter() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int[] createArray(int m) {
        int[] array = new int[m];
        for (int i = 0; i < m; i++) {
            array[i] = new Random().nextInt(100);
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.println("----------------------------------------");
        System.out.println(" " + Arrays.toString(array));
        System.out.println("----------------------------------------");
    }
}

