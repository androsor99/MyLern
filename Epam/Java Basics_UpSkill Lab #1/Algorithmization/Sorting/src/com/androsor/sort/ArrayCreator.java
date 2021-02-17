package com.androsor.sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.abs;

public class ArrayCreator {

    public static int inputParameter() {
        Scanner scanner = new Scanner(System.in);
        return abs(scanner.nextInt());
    }

    public static int[] createArray(int length) {
        int[] numbers = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            numbers[i] = random.nextInt(100);
        }
        return numbers;
    }

    public static void printArray(int[] array) {
        System.out.println("----------------------------------------");
        System.out.println(" " + Arrays.toString(array));
        System.out.println("----------------------------------------");
    }
}

