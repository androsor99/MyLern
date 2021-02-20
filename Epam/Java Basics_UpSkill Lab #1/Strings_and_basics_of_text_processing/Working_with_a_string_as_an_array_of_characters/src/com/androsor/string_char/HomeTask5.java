package com.androsor.string_char;

import static com.androsor.string_char.IOUtils.enterFromConsole;
import static java.lang.Character.isWhitespace;

/**
 * Remove all extra spaces in the line, that is, replace series of consecutive spaces with single spaces.
 * Remove trailing spaces in the line.
 */
public class HomeTask5 {

    public static void main(String [] args) {

        String strDuplicateSpaces = enterFromConsole("Введите строку с произвольным количеством пробелов между словами:");

        System.out.println("Отформатированная строка:");
        System.out.println(replaceDuplicateSpaces(strDuplicateSpaces));
    }

    public static String replaceDuplicateSpaces(String line) {
        StringBuilder newString = new StringBuilder();
        char[] symbols = line.trim().toCharArray();
        for (int i = 0; i < symbols.length; i++) {
            newString.append(symbols[i]);
            if (isWhitespace(symbols[i])) {
                while (isWhitespace(symbols[i])){
                    i++;
                }
                i--;
            }
        }
        return newString.toString();
    }
}
