package com.androsor.string_object;

import java.util.Scanner;

public class IOUtils {

    private static final Scanner INSTANCE = new Scanner(System.in);

    public static String enterStringFromConsole(String message) {
        System.out.println(message);
        return INSTANCE.nextLine();
    }

    public static char enterCharFromConsole(String message) {
        System.out.println(message);
        return INSTANCE.next().charAt(0);
    }

    public static void closeScanner() {
        INSTANCE.close();
    }
}
