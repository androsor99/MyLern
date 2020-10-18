package com.androsor.cycle;

/**
 * Two numbers are given. Determine the numbers included in the recording of both the first and second numbers.
 */
public class HomeTask7 {

    public static void main(String[] args) {
        int numberOne = 2496;
        int numberTwo = 789;
        String stringOne = "";
        String stringTwo = "";
        int symbolOne = 0;
        int symbolTwo = 0;

        stringOne = Integer.toString(numberOne);
        stringTwo = Integer.toString(numberTwo);

        for (int i = 0; i < stringOne.length(); i++) {
            symbolOne = stringOne.charAt(i) - '0';
            for (int j = 0; j < stringTwo.length(); j++) {
                symbolTwo = stringTwo.charAt(j) - '0';
                if (symbolTwo == symbolOne) {
                    System.out.println(" Совпадающие цифры - " + symbolOne);
                }
            }
        }
    }
}


