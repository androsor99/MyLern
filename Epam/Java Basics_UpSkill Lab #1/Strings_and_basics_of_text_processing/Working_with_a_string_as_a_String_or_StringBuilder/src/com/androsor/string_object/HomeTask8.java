package com.androsor.string_object;
import static com.androsor.string_object.Data.enterStringFromConsole;
/**
 * A string of words is entered, separated by spaces. Find the longest word and display it on the screen.
 * The case when there may be several longest words, do not process.
 */

public class HomeTask8 {

    public static void main(String[] args) {

        String str;

        str = enterStringFromConsole("Введите строку:");

        System.out.printf("Самое длинное слово в строке : \"%s\"", findLargeWord(str));

    }

    // Метод нахождения самого длинного слова в строке.
    public static String findLargeWord (String string) {

        String[] array = string.split(" ");

        int lengthMax = 0;
        int largeIndex = 0;

        for (int i = 0; i < array.length; i++) {

            if (lengthMax < array[i].length()) {
                lengthMax = array[i].length();
                largeIndex = i;
            }
        }

        return array[largeIndex];
    }
}
