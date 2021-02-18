package com.androsor.string_char;

import static com.androsor.string_char.Data.enterFromConsole;

/**
 * Remove all extra spaces in the line, that is, replace series of consecutive spaces with single spaces.
 * Remove trailing spaces in the line.
 */

public class HomeTask5 {

    public static void main (String [] args) {

        String strDoubleSpace;
        strDoubleSpace = enterFromConsole("Введите строку с произвольным количеством пробелов между словами:");

        System.out.println("Отформатированная строка:");
        findingSpacesString(strDoubleSpace);
    }

    // Метод нахождения пробелов в строке.
    public static void findingSpacesString(String strDoubleSpace) {

        StringBuilder newString;
        newString = new StringBuilder();
        char[] charArray = strDoubleSpace.toCharArray();
        boolean flag;
        flag = false;


        for (int j = 0; j < charArray.length; j++) {

            char c = charArray[j];

            if (Character.isSpaceChar(c) && !flag) {
                flag = true;
                newString.append(c);
            }

            if (!Character.isSpaceChar(c)) {
                flag = false;
                newString.append(c);
            }
        }
        System.out.println(newString.toString().trim());
    }
}
