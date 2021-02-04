package com.androsor.branch;

/**
 * Calculate the value of the function:
 */
public class HomeTask5 {

    public static void main(String[] args) {
        double x = 0;

        if (x <= 3) {
            System.out.println(" Значение функции F(x) = " +  (Math.pow(x, 2) - 3*x + 9));
        }
        else {
            System.out.println(" Значение функции F(x) = " + (1/(Math.pow(x, 3)+6)));
        }
    }
}
