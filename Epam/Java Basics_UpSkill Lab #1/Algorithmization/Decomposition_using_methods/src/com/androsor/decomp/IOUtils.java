package com.androsor.decomp;

import java.util.Scanner;

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
        return scanner.nextInt();
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
}
