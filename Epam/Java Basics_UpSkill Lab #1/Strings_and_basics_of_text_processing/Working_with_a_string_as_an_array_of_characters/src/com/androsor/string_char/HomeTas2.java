package com.androsor.string_char;

/**
 * Замените в строке все вхождения 'word' на 'letter'.
 */

public class HomeTas2 {

    public static void main(String[] args) {

        String strInitial;
        String strWordOne;
        String strWordTwo;

        strInitial = HomeTask1.enterFromConsole("Ведите исходную строку");
        strWordOne = HomeTask1.enterFromConsole("Ведите заменяемое слово");
        strWordOne = strWordOne.trim();
        strWordTwo = HomeTask1.enterFromConsole("Ведите заменяющее слово");
        strWordTwo = strWordTwo.trim();

        System.out.printf("Замененная строка \n %s", strInitial.replace(strWordOne, strWordTwo));

    }
}
