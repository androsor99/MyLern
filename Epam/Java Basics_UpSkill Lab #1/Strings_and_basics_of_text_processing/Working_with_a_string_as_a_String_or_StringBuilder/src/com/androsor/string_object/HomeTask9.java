package com.androsor.string_object;

import static com.androsor.string_object.IOUtils.enterStringFromConsole;

/**
 * Count the number of lowercase (small) and uppercase (uppercase) letters in the entered line.
 * Consider only English letters.
 */
public class HomeTask9 {

    public static void main(String[] args) {

        String line = enterStringFromConsole("Введите строку:");

        int[] counts = findEnglishLetter(line);

        System.out.printf("В заданной строке содержится %d строчных английских букв и %d прописных английских букв.",
                counts[0], counts[1]);
    }
    
    public static int[] findEnglishLetter(String line) {
        int countLower = 0;
        int countUpper = 0;
        for (int i = 0; i < line.length(); i++) {
            char symbol = line.charAt(i);
            if (String.valueOf(symbol).matches("[a-z]")) {
                countLower++;
            }
            if (String.valueOf(symbol).matches("[A-Z]")) {
                countUpper++;
            }
        }
        return new int[] {countLower, countUpper};
    }
}
