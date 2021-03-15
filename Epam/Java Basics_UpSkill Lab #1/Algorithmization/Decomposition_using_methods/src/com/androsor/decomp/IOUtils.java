package com.androsor.decomp;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.*;

/**
 * Entering parameters from the console.
 */
public class IOUtils {

    private static final String MESSAGE_INVALID = " Введенные данные не являются натуральными числами. Повторите ввод.";

    public static int enterParameterFromConsoleInt(String message) {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println(MESSAGE_INVALID);
        }
        return abs(scanner.nextInt());
    }

    public  static double enterParameterFromConsoleDouble(String message) {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.println(MESSAGE_INVALID);
        }
        return scanner.nextDouble();
    }

    public static void printArray(int[] numbers) {
        System.out.println("----------------------------------------");
        System.out.println(" " + Arrays.toString(numbers));
        System.out.println("----------------------------------------");
    }

    public static void printList(List<Integer> numbers) {
    System.out.println("----------------------------------------");
            System.out.println(" " + numbers.toString());
            System.out.println("----------------------------------------");
    }
}
