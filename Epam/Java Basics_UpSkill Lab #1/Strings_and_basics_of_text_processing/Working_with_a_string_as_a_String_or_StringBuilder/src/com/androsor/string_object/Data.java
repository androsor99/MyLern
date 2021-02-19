package com.androsor.string_object;

import java.util.Scanner;

public class Data {

    public static String enterStringFromConsole(String message) {
        @SuppressWarnings("resurce")
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }

    public static char enterCharFromConsole(String message) {
        @SuppressWarnings("resurce")
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.next().charAt(0);
    }
}
