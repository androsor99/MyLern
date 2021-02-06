package com.androsor.decomp;

import java.util.Random;
import java.util.Scanner;

/**
 * On the plane, n points are given by their coordinates. Write a method (methods) that determine between which of the pairs of points
 *   the longest distance. Indication. Enter the coordinates of the points into the array.
 */

public class HomeTask4 {

    public static void main(String[] args) {
        int n; // Количество заданных точек.

        Scanner sc = new Scanner(System.in);
        System.out.print(" Введите количество заданных точек n = ");
        n = sc.nextInt();

        // Заносим точки в массив
        double[] x = new double[n];
        double[] y = new double[n];
        enterArray(x, y);

        System.out.println("Заданы точки с координатами:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%1d-ая Точка с координатами (%.2f, %.2f)\n",i + 1, x[i], y[i]);
        }

        int[] index = distanceMax(x, y);
        System.out.printf(" Между точками с координатами (%.2f, %.2f) и (%.2f, %.2f) максимальное расстояние",
                x[index[0]], y[index[0]], x[index[1]], y[index[1]]);
    }

    // Метод заполнения массива координатами.
    public static void enterArray(double[] myArray1, double[] myArray2) {
        Random random = new Random();
        for (int i = 0; i < myArray1.length; i++) {
            myArray1[i] =-100 + (200 * random.nextDouble());
            myArray2[i] =-100 + (200 * random.nextDouble());
        }
    }

    // Метод нахождения максимального расстояния.
    public static int[] distanceMax(double[] x, double[] y) {
        int[] index = new int[2];
        double max = 0;
        for (int i = 0; i < x.length-1; i++) {
            for (int j = i+1; j < x.length; j++) {
                double d = distance(x[i], y[i], x[j], y[j]);
                if (max < d) {
                    index[0] = i;
                    index[1] = j;
                    max = d;
                }
            }
        }
        return index;
    }

    // Метод нахождения расстояния между двумя точками
    public static double distance(double x1, double y1, double x2, double y2) {
        double dist;
        dist = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)); // Расстояние между двумя точками заданными координатами.
        return dist;
    }
}