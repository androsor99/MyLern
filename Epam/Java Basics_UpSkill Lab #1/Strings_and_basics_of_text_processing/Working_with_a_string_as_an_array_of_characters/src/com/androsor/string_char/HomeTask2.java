package com.androsor.string_char;

import static com.androsor.string_char.IOUtils.enterFromConsole;

/**
 * Замените в строке все вхождения 'word' на 'letter'.
 */
public class HomeTask2 {

    public static void main(String[] args) {

        String strInitial = enterFromConsole("Ведите исходную строку:"); // мама мыла раму.
        String wordOne = enterFromConsole("Ведите заменяемое слово:");

        String wordTwo = enterFromConsole("Ведите заменяющее слово:");

        System.out.printf("Замененная строка \n %s", strInitial.replace(wordOne.trim(), wordTwo.trim()));
    }
}
