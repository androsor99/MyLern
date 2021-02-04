package com.androsor.liner;

/**
 * For this area, compose a linear program that prints true if the point with coordinates (x, y) belongs to the filled area, and false otherwise.
 */
public class HomeTask6 {

    public static void main(String[] args) {
        double x = 10;
        double y = -15;

        System.out.println(Math.abs(x) <= 4 && y <= 0 && y >=3 || Math.abs(x) <= 2 && y >= 0 && y <= 4);
    }
}

