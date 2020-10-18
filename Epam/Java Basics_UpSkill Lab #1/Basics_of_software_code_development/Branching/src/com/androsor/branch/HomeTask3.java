package com.androsor.branch;

/**
 * Three points A (x1, y1), B (x2, y2) and C (x3, y3) are given. Determine if they will be located on the same straight line.
 */
public class HomeTask3 {

    public static void main(String[] args) {
        double x1 = 0;
        double x2 = 0;
        double x3 = 0;
        double y1 = 5;
        double y2 = 6;
        double y3 = 7;

        if ((x3 - x1) * (y2 - y1) - (x2 - x1) * (y3 - y1) == 0) { // (x – x1) * (y2 – y1) – (x2 – x1) * (y – y1) = 0 - уравнение прямой проходящей через 2 точки.
            System.out.println("Указанные точки лежат на одной прямой");
        }
        else {
            System.out.println("Указанные точки не лежат на одной прямой");
        }
    }
}