package com.androsor.string_char;

import static java.lang.Character.isUpperCase;

/**
 * Given an array of camelCase variable names. Convert titles to snake_case.
 */
public class HomeTask1 {

    public static void main(String[] args) {

        System.out.println(" Строки с использованием стиля camelCase:");
        String[] strings = new String[] {"strCamelCase", "epamTraining", "systemOutPrintln"};
        printToConsole(strings);

        System.out.println(" Строки с использованием стиля snake_case:");
        String[] stringsNew = transformCamelCaseToSnakeCase(strings);
        printToConsole(stringsNew);
    }

    public static String[] transformCamelCaseToSnakeCase(String[] strings) {
        String[] stringsNew = new String[strings.length];
        for (int i = 0; i < stringsNew.length; i++) {
            char[] symbols = strings[i].toCharArray();
            stringsNew[i] = "";
            for (char symbol : symbols) {
                if (isUpperCase(symbol)) {
                    stringsNew[i] += "_" + String.valueOf(symbol).toLowerCase();
                } else {
                    stringsNew[i] += symbol;
                }
            }
        }
        return stringsNew;
    }

    private static void printToConsole(String[] strings) {
        for (String string : strings) {
            System.out.printf("\t\t%s\n", string);
        }
    }
}
