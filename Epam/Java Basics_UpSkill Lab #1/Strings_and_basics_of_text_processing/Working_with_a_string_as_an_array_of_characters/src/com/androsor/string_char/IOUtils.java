package com.androsor.string_char;

import java.util.Scanner;

public class IOUtils implements AutoCloseable {

    public static String enterFromConsole(String message) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(message);
            return scanner.nextLine();
        }
    }

    @Override
    public void close() throws Exception {

    }
}
