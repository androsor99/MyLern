package com.androsor.string_object;

import java.util.Arrays;
import java.util.Comparator;

import static com.androsor.string_object.IOUtils.closeScanner;
import static com.androsor.string_object.IOUtils.enterStringFromConsole;
import static com.androsor.string_object.IOUtils.getInstance;

/**
 * A string of words is entered, separated by spaces. Find the longest word and display it on the screen.
 * The case when there may be several longest words, do not process.
 */
public class HomeTask8 {

    public static void main(String[] args) {

        String line = enterStringFromConsole("Введите строку:");

        System.out.printf("Самое длинное слово в строке : \"%s\"", findLargeWord(line));

        closeScanner(getInstance());
    }

    private static String findLargeWord (String string) {
        String[] words = string.split("\\s");
        Arrays.sort(words, new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o2.length(), o1.length());
            }
        });
        return words[0];
    }
}
