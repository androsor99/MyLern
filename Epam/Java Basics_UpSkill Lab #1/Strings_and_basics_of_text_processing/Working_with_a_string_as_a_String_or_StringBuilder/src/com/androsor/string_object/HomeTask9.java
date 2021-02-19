package com.androsor.string_object;
import static com.androsor.string_object.Data.enterStringFromConsole;
/**
 * Count the number of lowercase (small) and uppercase (uppercase) letters in the entered line.
 * Consider only English letters.
 */

public class HomeTask9 {

    public static void main(String[] args) {

        String str;

        str = enterStringFromConsole("Введите строку:");

        System.out.printf("В заданной строке содержится %d строчных английских букв и " +
                "%d прописных английских букв.",  findLowerCaseEnglish(str), findUpperCaseEnglish(str));
    }


    // Метод нахождения количества строчных английских букв.
    public static int findLowerCaseEnglish (String string) {

        int countLower = 0;

        for (int i = 0; i < string.length(); i++) {

            if (String.valueOf(string.charAt(i)).matches("[a-z]")) {
                countLower++;
            }
        }

        return countLower;
    }


    // Метод нахождения количества прописных английских букв.
    public static int findUpperCaseEnglish (String string) {

        int countUpper = 0;

        for (int i = 0; i < string.length(); i++) {

            if (String.valueOf(string.charAt(i)).matches("[A-Z]")) {
                countUpper++;
            }
        }

        return countUpper;
    }
}
