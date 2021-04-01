package com.androsor.string_object;

import static com.androsor.string_object.IOHelper.enterStringFromConsole;

/**
 * Count the number of lowercase (small) and uppercase (uppercase) letters in the entered line.
 * Consider only English letters.
 */
public class HomeTask9 {

    private static final String INPUT_MESSAGE = "Введите строку:";
    private static final String OUTPUT_MESSAGE = "В заданной строке содержится %d строчных английских букв и %d прописных английских букв.";

    public static void main(String[] args) {

        String line = enterStringFromConsole(INPUT_MESSAGE);

        int[] counts = findNumberOfLetters(line);

        System.out.printf(OUTPUT_MESSAGE, counts[0], counts[1]);
    }
    
    public static int[] findNumberOfLetters(String line) {
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
