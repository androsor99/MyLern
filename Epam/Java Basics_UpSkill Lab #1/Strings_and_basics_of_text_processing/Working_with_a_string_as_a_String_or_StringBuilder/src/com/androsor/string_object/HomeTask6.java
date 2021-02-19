package com.androsor.string_object;
import static com.androsor.string_object.Data.enterStringFromConsole;
/**
 * Get a new one from the given string by repeating each character twice.
 */

public class HomeTask6 {

    public static void main (String [] args){

        String str1;
        str1 = enterStringFromConsole("Введите строку");
        StringBuilder str2 = new StringBuilder (str1.length()*2);

        for (int i = 0; i<str1.length(); i++){

            str2.append(str1.charAt(i));
            str2.append(str1.charAt(i));

        }

        System.out.printf("Строка с задвоенными символами:\n%s", str2);
    }
}
