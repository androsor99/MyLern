package com.androsor.string_object;

/**
 * A string is entered. It is required to remove duplicate characters and all spaces from it. For example,
 * if "abc cde def" was entered, then "abcdef" should be output.
 */

public class HomeTask7 {

    public static void main (String [] arg){

        String str;

        str = HomeTask1.enterFromConsole("Введите строку:");

        String newString = deleteRepeat(str);

        System.out.printf("Строка без пробелов и повторяющихся символов\n%s", newString);

    }

    // Метод удаления всех пробелов.
    public static String deleteAllSpaces(String strNotSpace) {

        strNotSpace = strNotSpace.trim();

        StringBuilder sbString = new StringBuilder();

        for (int i = 0; i < strNotSpace.length(); i++) {
            if (!Character.isWhitespace(strNotSpace.charAt(i))) {
                sbString.append(strNotSpace.charAt(i));
            }
        }
        strNotSpace = sbString.toString();
        return strNotSpace;
    }

    //Метод удаления повторяющихся символов.
    public static String deleteRepeat(String string) {

        String newString = deleteAllSpaces(string);
        StringBuilder sbString = new StringBuilder();

        for (int i = 0; i < newString.length(); i++) {

            if (newString.indexOf(newString.charAt(i)) == i) {

                sbString.append(newString.charAt(i));

            }
        }

        newString = sbString.toString();

        return newString;
    }
}

