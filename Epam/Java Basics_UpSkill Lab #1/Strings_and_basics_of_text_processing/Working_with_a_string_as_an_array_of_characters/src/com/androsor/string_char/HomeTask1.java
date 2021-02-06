package com.androsor.string_char;

import java.util.Scanner;

/**
 * Given an array of camelCase variable names. Convert titles to snake_case.
 */

public class HomeTask1 {

    public static void main(String[] args) {

        String strCamelCase;
        strCamelCase = enterFromConsole("Ведите строку с использованием стиля camelCase:"); // строка для проверки camelCase epamTrening systemOutPrint.

        String[] stringArray;
        stringArray = new String[] {strCamelCase};

        System.out.println("Исходная строка с использованием стиля snake_case:");
        camelCaseToSnakeCase(stringArray);
    }

    // Метод перевода camelCase в snake_case.
    public static void camelCaseToSnakeCase(String[] stringArray) {

        for (int i = 0; i < stringArray.length; i++) {
            char[] charArray = stringArray[i].toCharArray();
            stringArray[i] = "";

            for (int j = 0; j < charArray.length; j++) {
                char c = charArray[j];
                if (Character.isUpperCase(c))
                    stringArray[i] += "_" + String.valueOf(c).toLowerCase();

                else
                    stringArray[i] += c;
            }
        }

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i] + " ");

        }
    }


    // Метод ввода строки с консоли
    public  static  String enterFromConsole(String message) {

        @SuppressWarnings("resurce")
        Scanner sc = new Scanner(System.in);
        System.out.println(message);

        String str;
        str = sc.nextLine();

        return str ;
    }
}
