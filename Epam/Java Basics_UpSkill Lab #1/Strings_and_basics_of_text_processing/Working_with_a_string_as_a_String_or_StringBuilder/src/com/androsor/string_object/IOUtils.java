package com.androsor.string_object;

import java.util.Scanner;

public class IOUtils {

    private static Scanner instance;

    public static synchronized Scanner getInstance() {
        if (instance == null) {
            instance = new Scanner(System.in);
        }
        return instance;
    }

    public static String enterStringFromConsole(String message) {
        Scanner scanner = getInstance();
        System.out.println(message);
        return scanner.nextLine();
    }

    public static char enterCharFromConsole(String message) {
        Scanner scanner = getInstance();
        System.out.println(message);
        return scanner.next().charAt(0);
    }

    public static void closeScanner(Scanner scanner) {
        scanner.close();
    }
}


