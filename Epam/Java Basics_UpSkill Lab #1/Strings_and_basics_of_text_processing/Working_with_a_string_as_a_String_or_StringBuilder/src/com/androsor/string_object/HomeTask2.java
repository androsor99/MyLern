package com.androsor.string_object;

import java.util.Scanner;

/**
 * In the line insert after each 'a' character 'b'.
 */

public class HomeTask2 {

    public static void main(String[] args) {

        String stringReplaceable;
        char symbolA;
        char symbolB;

        stringReplaceable = HomeTask1.enterFromConsole("Введите строку:");
        symbolA = enterCharFromConsole("Введите заменяемый символ:");
        symbolB = enterCharFromConsole("Введите заменяющий символ:");

        StringBuilder newString = new StringBuilder(stringReplaceable);

        for ( int i = 0; i < newString.length(); i++) {

            if (newString.charAt(i) == symbolA) {
                newString.insert(i + 1, symbolB);
            }
        }

        System.out.printf("Измененная строка:\n %s", newString);

    }
    // Метод ввода символов с консоли
    public  static  char enterCharFromConsole(String message) {

        @SuppressWarnings("resurce")
        Scanner sc = new Scanner(System.in);
        System.out.println(message);

        return sc.next().charAt(0);
    }
}
