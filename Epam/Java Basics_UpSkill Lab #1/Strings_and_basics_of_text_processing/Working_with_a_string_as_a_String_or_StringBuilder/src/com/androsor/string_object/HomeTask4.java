package com.androsor.string_object;
import static com.androsor.string_object.Data.enterStringFromConsole;
/**
 * Using the copy function and the concatenation operation, form the word "торт" from the parts of the word "информатика".
 */

public class HomeTask4 {

    public static void main(String[] args) {

        String str;
        str = enterStringFromConsole("Введите слово или строку");

        System.out.printf("Было: %s \n", str);
        System.out.printf("Стало: %s \n", changeString(str));
    }

    public static String changeString(String string) {

        StringBuilder strTemp = new StringBuilder();

        strTemp.append(string.charAt(string.indexOf("т")));
        strTemp.append(string.charAt(string.indexOf("о")));
        strTemp.append(string.charAt(string.indexOf("р")));
        strTemp.append(string.charAt(string.indexOf("т")));

        String word = strTemp.toString();

        if (!word.equals("торт")) {

            System.out.println(" Слово ТОРТ составить невозможно!");
        }

        return word;
    }
}
