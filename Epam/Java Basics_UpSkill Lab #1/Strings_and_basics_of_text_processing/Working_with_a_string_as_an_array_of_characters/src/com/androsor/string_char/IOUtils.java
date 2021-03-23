package com.androsor.string_char;

import java.util.Scanner;

public class IOUtils {

    public static String enterFromConsole(String message) {
       Scanner scanner = new Scanner(System.in);
            System.out.println(message);
            return scanner.nextLine();
    }
}
