package com.androsor.decomp;

import java.util.Random;

import static com.androsor.decomp.Data.inputDataInt;
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * On the plane, n points are given by their coordinates. Write a method (methods) that determine between which of the pairs of points
 *   the longest distance. Indication. Enter the coordinates of the points into the array.
 */
public class HomeTask4 {

    public static void main(String[] args) {

        int numberOfPoints = getNumberOfPoints(abs(inputDataInt(" Введите количество заданных точек numberOfPoints = ")));

        System.out.println("Заданы точки с координатами:");
        int[] coordinates_X = fillArray(numberOfPoints);
        int[] coordinates_Y = fillArray(numberOfPoints);
        printPointCoordinates(coordinates_X, coordinates_Y);

        printCoordinatesOfPointsWithMaxDistance(coordinates_X, coordinates_Y);
    }

    private static int getNumberOfPoints(int numberOfPoints) {
        while (numberOfPoints == 1) {
            System.out.println(" Одной точки не достаточно!");
            numberOfPoints = abs(inputDataInt(" Введите количество заданных точек numberOfPoints = "));
        }
        return numberOfPoints;
    }

    private static int[] fillArray(int length) { // Метод заполнения массива координатами.
        int[] numbers = new int[length];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 100 - (random.nextInt(200));
        }
        return numbers;
    }

    private static void printPointCoordinates(int[] coordinates_X, int[] coordinates_Y) {
        for (int i = 0; i < coordinates_X.length; i++) {
            System.out.printf("%1d-ая Точка с координатами [%d ; %d]\n",i + 1, coordinates_X[i], coordinates_Y[i]);
        }
    }

    public static void printCoordinatesOfPointsWithMaxDistance(int[] x, int[] y) {
        int tempIndexI = 0;
        int tempIndexJ = 0;
        double distanceMax = 0;
        for (int i = 0; i < x.length-1; i++) {
            for (int j = i + 1; j < x.length; j++) {
                double distance = getDistance(x[i], y[i], x[j], y[j]);
                if (distanceMax < distance) {
                    tempIndexI = i;
                    tempIndexJ = j;
                    distanceMax = distance;
                }
            }
        }
        System.out.printf(" Между точками с координатами [%d ; %d] и [%d ; %d] максимальное расстояние",
                x[tempIndexI], y[tempIndexI], x[tempIndexJ], y[tempIndexJ]);
    }

    private static double getDistance(int x1, int y1, int x2, int y2) { // Метод нахождения расстояния между двумя точками
        return sqrt(pow((x1 - x2), 2) + pow((y1 - y2), 2));
    }
}
