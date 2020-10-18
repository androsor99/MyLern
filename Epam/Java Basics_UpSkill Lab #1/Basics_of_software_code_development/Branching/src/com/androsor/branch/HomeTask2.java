package com.androsor.branch;

/**
 *  Find max {min (a, b), min (c, d)}
 */
public class HomeTask2 {

    public static void main(String[] args) {
        double a = 10;
        double b = 10;
        double c = 50;
        double d = 0;

        if (Math.min(a, b) > Math.min(c, d)){
            System.out.println("Максимум = " + Math.min(a, b));
        }
        else {
            System.out.println("Максимум = " + Math.min(c, d));
        }
    }
}

