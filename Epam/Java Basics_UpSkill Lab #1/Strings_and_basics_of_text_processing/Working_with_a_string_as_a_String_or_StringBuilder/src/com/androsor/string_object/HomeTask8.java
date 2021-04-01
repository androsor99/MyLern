package com.androsor.string_object;

import java.util.Arrays;

import static com.androsor.string_object.IOHelper.enterStringFromConsole;

/**
 * A string of words is entered, separated by spaces. Find the longest word and display it on the screen.
 * The case when there may be several longest words, do not process.
 */
public class HomeTask8 {

    private static final String INPUT_MESSAGE = "Введите строку:";
    private static final String OUTPUT_MESSAGE = "Самое длинное слово в строке : \"%s\"";

    public static void main(String[] args) {

        String line = enterStringFromConsole(INPUT_MESSAGE);

        String largeWord = findLargeWord(line);

        System.out.printf(OUTPUT_MESSAGE, largeWord );
    }

    private static String findLargeWord(String line) {
        String[] words = line.split("[^А-Яа-я-]*");
        Arrays.sort(words, (o1, o2) -> Integer.compare(o2.length(), o1.length()));
        return words[0];
    }
}
