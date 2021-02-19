package com.androsor.string_object;

import java.util.Scanner;

public class Data {

    public static String enterFromConsole(String message) {
        @SuppressWarnings("resurce")
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
