package com.androsor.string_object;

import java.util.Scanner;

/**
 * Given text (string). Find the largest number of consecutive spaces in it.
 */

public class HomeTask1 {

    public static void main(String[] args) {

        String str =  enterFromConsole("Введите строку/строки с различным количеством прробелов:");

        StringBuilder stringMultiSpace = new StringBuilder(str);

        int count = 0;
        int temp = 0;

        for (int i = 0; i < stringMultiSpace.length(); i++) {

            if (Character.isSpaceChar(stringMultiSpace.charAt(i))) {
                temp++;

                if(count < temp){
                    count = temp;
                }
            }
            else temp = 0;
        }
        System.out.printf("Максимальное количество пробелов во введенной строке/строках = %d", count);
    }

    // Метод ввода строки с консоли
    public  static  String enterFromConsole(String message) {

        @SuppressWarnings("resurce")
        Scanner sc = new Scanner(System.in);
        System.out.println(message);

        String str;
        str = sc.nextLine();

        return str ;
    }
}



