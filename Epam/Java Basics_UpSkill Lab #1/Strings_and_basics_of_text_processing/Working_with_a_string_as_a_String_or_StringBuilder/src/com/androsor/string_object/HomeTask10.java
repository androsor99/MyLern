package com.androsor.string_object;

import java.util.StringTokenizer;

import static com.androsor.string_object.IOUtils.closeScanner;
import static com.androsor.string_object.IOUtils.enterStringFromConsole;
import static com.androsor.string_object.IOUtils.getScannerInstance;

/**
 * Line X consists of several sentences, each ending with a period, exclamation mark, or question mark.
 * Determine the number of sentences in line X.
 */
public class HomeTask10 {

    public static void main(String[] args) {

        String line = enterStringFromConsole("Введите строку:"); //.привет. пока пролд. отм?

        StringTokenizer str = new StringTokenizer(line.strip(), ".!?");
        System.out.println(str.countTokens());

        System.out.printf("Предложенный текст состоит из %d предложений.\n", countSentence(line));

        closeScanner(getScannerInstance());
    }

    public static int countSentence(String line) {
        return line.strip().replaceAll("^\\.*", "").split("[.!?]+").length;
    }
}
