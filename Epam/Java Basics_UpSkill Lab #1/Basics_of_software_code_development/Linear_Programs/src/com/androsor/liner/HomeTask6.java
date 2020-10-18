package com.androsor.liner;

/**
 * For this area, compose a linear program that prints true if the point with coordinates (x, y) belongs to the filled area, and false otherwise.
 */
public class HomeTask6 {

    public static void main(String[] args){
        double x = 91;
        double y = -1;

        if (Math.abs(x) <= 4 && y <= 0 || Math.abs(x) <= 2 && y >= 0 && y <= 4){
            System.out.println("True: ");
        }
        else {
            System.out.println("False: ");
        }
    }

    /**
     * Find the value of the function: z = ((a - 3) * b / 2) + c.
     */
    public static class HomeTask1 {

        public static void main(String[] args){
            var a = -3.1;
            var b = 2E2;
            var c = -3;

            var z = ( (a - 3 ) * b / 2) + c;

            System.out.println("Значение функции z = " + z);
        }
    }
}
