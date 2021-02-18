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
        int[][] coordinates = fillArray(numberOfPoints);
        printPointCoordinates(coordinates);

        printCoordinatesOfPointsWithMaxDistance(coordinates);
    }

    private static int getNumberOfPoints(int numberOfPoints) {
        while (numberOfPoints == 1) {
            System.out.println(" Одной точки не достаточно!");
            numberOfPoints = abs(inputDataInt(" Введите количество заданных точек numberOfPoints = "));
        }
        return numberOfPoints;
    }

    private static int[][] fillArray (int length) {
        int[][] numbers = new int[2][length];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                numbers[i][j] = (random.nextInt(100) - 50);
            }
        }
        return numbers;
    }

    private static void printPointCoordinates(int[][] coordinates) {
        for (int i = 0; i < coordinates[0].length; i++) {
            System.out.printf("%1d-ая Точка с координатами [%d ; %d]\n",i + 1, coordinates[0][i], coordinates[1][i]);
        }
    }

    public static void printCoordinatesOfPointsWithMaxDistance(int[][] coordinates) {
        int tempIndexI = 0;
        int tempIndexJ = 0;
        double distanceMax = 0;
        for (int i = 0; i < coordinates[0].length - 1; i++) {
            for (int j = i + 1; j < coordinates[0].length; j++) {
                double distance = getDistance(coordinates[0][i], coordinates[1][i], coordinates[0][j], coordinates[1][j]);
                if (distanceMax < distance) {
                    tempIndexI = i;
                    tempIndexJ = j;
                    distanceMax = distance;
                }
            }
        }
        System.out.printf(" Между точками с координатами [%d ; %d] и [%d ; %d] максимальное расстояние",
                coordinates[0][tempIndexI], coordinates[1][tempIndexI], coordinates[0][tempIndexJ], coordinates[1][tempIndexJ]);
    }

    private static double getDistance(int x1, int y1, int x2, int y2) { // Метод нахождения расстояния между двумя точками
        return sqrt(pow((x1 - x2), 2) + pow((y1 - y2), 2));
    }
}
