package com.androsor.string_object;

import static com.androsor.string_object.Data.enterStringFromConsole;
import static java.lang.Character.isWhitespace;

/**
 * A string is entered. It is required to remove duplicate characters and all spaces from it. For example,
 * if "abc cde def" was entered, then "abcdef" should be output.
 */

public class HomeTask7 {

    public static void main(String [] arg){

        String line = enterStringFromConsole("Введите строку:");

        System.out.printf("Строка без пробелов и повторяющихся символов\n%s", deleteAllSpacesAndDuplicateCharacters(line));
    }

    public static String deleteAllSpacesAndDuplicateCharacters(String line) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            if (!isWhitespace(line.charAt(i)) && (line.indexOf(line.charAt(i)) == i)) {
                stringBuilder.append(line.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}