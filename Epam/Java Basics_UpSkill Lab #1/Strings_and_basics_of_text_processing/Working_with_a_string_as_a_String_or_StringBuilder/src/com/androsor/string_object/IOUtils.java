package com.androsor.string_object;

import java.util.Scanner;

public class IOUtils {

    private static Scanner instance;

    public static synchronized Scanner getScannerInstance() {
        if (instance == null) {
            instance = new Scanner(System.in);
        }
        return instance;
    }

    public static String enterStringFromConsole(String message) {
        System.out.println(message);
        return getScannerInstance().nextLine();
    }

    public static char enterCharFromConsole(String message) {
        System.out.println(message);
        return getScannerInstance().next().charAt(0);
    }

    public static void closeScanner(Scanner scanner) {
        scanner.close();
    }
}
