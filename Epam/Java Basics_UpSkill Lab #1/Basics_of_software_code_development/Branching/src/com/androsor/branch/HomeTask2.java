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

        double min1 = Math.min(a, b);
        double min2 = Math.min(c, d);

        if (min1 > min2){
            System.out.println("Максимум = " + min1);
        }
        else {
            System.out.println("Максимум = " + min2);
        }
    }
}

