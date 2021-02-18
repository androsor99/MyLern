package com.androsor.string_char;

import java.util.Scanner;

public class Data {

    public  static  String enterFromConsole(String message) {
        @SuppressWarnings("resurce")
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
