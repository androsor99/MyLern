package com.androsor.string_object;
import static com.androsor.string_object.Data.enterStringFromConsole;
/**
 * Using the copy function and the concatenation operation, form the word "торт" from the parts of the word "информатика".
 */

public class HomeTask4 {

    public static void main(String[] args) {

        String line = enterStringFromConsole("Введите слово или строку");

        System.out.printf("Было: %s \n", line);
        System.out.printf("Стало: %s \n", makeWordFromLetters(line));
    }

    public static String makeWordFromLetters(String string) {
        StringBuilder word = new StringBuilder();

        word.append(string.charAt(string.indexOf("т")));
        word.append(string.charAt(string.indexOf("о")));
        word.append(string.charAt(string.indexOf("р")));
        word.append(string.charAt(string.indexOf("т")));
        if (!word.toString().equals("торт")) {
            System.out.println(" Слово ТОРТ составить невозможно!");
        }
        return word.toString();
    }
}
