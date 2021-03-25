package com.androsor.string_object;

import static com.androsor.string_object.IOUtils.closeScanner;
import static com.androsor.string_object.IOUtils.enterStringFromConsole;
import static com.androsor.string_object.IOUtils.getScannerInstance;

/**
 * Count the number of lowercase (small) and uppercase (uppercase) letters in the entered line.
 * Consider only English letters.
 */
public class HomeTask9 {

    public static void main(String[] args) {

        String line = enterStringFromConsole("Введите строку:");

        System.out.printf("В заданной строке содержится %d строчных английских букв и %d прописных английских букв.",
                findEnglishLetter(line)[0], findEnglishLetter(line)[1]);

        closeScanner(getScannerInstance());
    }
    
    public static int[] findEnglishLetter(String line) {
        int countLower = 0;
        int countUpper = 0;
        for (int i = 0; i < line.length(); i++) {
            if (String.valueOf(line.charAt(i)).matches("[a-z]")) {
                countLower++;
            }
            if (String.valueOf(line.charAt(i)).matches("[A-Z]")) {
                countUpper++;
            }
        }
        return new int[] {countLower, countUpper};
    }
}
