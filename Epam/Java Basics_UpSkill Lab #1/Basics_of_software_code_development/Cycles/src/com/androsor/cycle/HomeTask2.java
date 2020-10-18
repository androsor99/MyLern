package com.androsor.cycle;

/**
 * Calculate the values of the function on the segment [a, b] with step h:
 */
public class HomeTask2 {

    public static void main(String[] args) {

        int a = -23;
        int b = 99;
        int h = 12;
        int y;

        for (int i = a; i <= b; i += h) {
            if (i > 2) {
                y = i;
            }
            else {
                y = i * (-1);
            }
            System.out.println("При х = " + i + " Значение y = " + y);
        }
    }
}
