package com.androsor.decomp;

import java.util.Locale;
import java.util.Objects;
import java.util.Random;

import static com.androsor.decomp.IOUtils.enterParameterFromConsoleInt;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * On the plane, n points are given by their coordinates. Write a method (methods) that determine between which of the pairs of points
 *   the longest distance. Indication. Enter the coordinates of the points into the array.
 */
public class HomeTask4 {

    public static void main(String[] args) {

        int numberOfPoints = getNumberOfPoints();

        System.out.println("Заданы точки с координатами:");
        Point2D[] points = getRandomPoints(numberOfPoints);
        printPoint(points);

        Distance max = getMaxDistanceBetweenPoints(points);
        System.out.println("Максимальное " + max.toString().toLowerCase(Locale.ROOT));
    }

    private static int getNumberOfPoints() {
        int numberOfPoints = enterParameterFromConsoleInt("Введите количество заданных точек numberOfPoints = ");
        if (numberOfPoints == 1) {
            System.out.println("Одной точки не достаточно!");
            return getNumberOfPoints();
        }
        return numberOfPoints;
    }

    private static Point2D[] getRandomPoints(int length) {
        Point2D[] points  = new Point2D[length];
        for (int i = 0; i < length; i++) {
            points[i] = new Point2D(getRandomCoordinate(), getRandomCoordinate());
        }
        return points;
    }

    private static int getRandomCoordinate() {
        Random random = new Random();
        return random.nextInt(100) - 50;
    }

    private static void printPoint(Point2D[] points) {
        for (int i = 0; i < points.length; i++) {
            System.out.printf("%1d-ая Точка с координатами %s\n",i + 1, points[i].toString());
        }
    }

    public static Distance getMaxDistanceBetweenPoints(Point2D[] points) {
        Distance distanceMax = new Distance(points[0], points[1]);
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length - 1; j++) {
                Distance distance = new Distance(points[i], points[j]);
                if (distanceMax.getDistance() < distance.getDistance()) {
                    distanceMax = distance;
                }
            }
        }
        return distanceMax;
    }

    private static class Point2D {

        private final int coordinateX;
        private final int coordinateY;

        public Point2D(int coordinateX, int getCoordinateY) {
            this.coordinateX = coordinateX;
            this.coordinateY = getCoordinateY;
        }

        public int getCoordinateX() {
            return coordinateX;
        }

        public int getGetCoordinateY() {
            return coordinateY;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point2D point2D = (Point2D) o;
            return coordinateX == point2D.coordinateX && coordinateY == point2D.coordinateY;
        }

        @Override
        public int hashCode() {
            return Objects.hash(coordinateX, coordinateY);
        }

        @Override
        public String toString() {
            return String.format("[%d ; %d]", coordinateX, coordinateY);
        }
    }

    private static class Distance {

        private final Point2D pointOne;
        private final Point2D pointTwo;
        private final double distance;

        public Distance(Point2D pointOne, Point2D pointTwo) {
            this.pointOne = pointOne;
            this.pointTwo = pointTwo;
            this.distance = sqrt(pow((pointOne.coordinateX - pointTwo.coordinateX), 2) + pow((pointOne.coordinateY - pointTwo.coordinateY), 2));
        }

        public Point2D getPointOne() {
            return pointOne;
        }

        public Point2D getPointTwo() {
            return pointTwo;
        }

        public double getDistance() {
            return distance;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Distance distance1 = (Distance) o;
            return Double.compare(distance1.distance, distance) == 0 && Objects.equals(pointOne, distance1.pointOne) && Objects.equals(pointTwo, distance1.pointTwo);
        }

        @Override
        public int hashCode() {
            return Objects.hash(pointOne, pointTwo, distance);
        }

        @Override
        public String toString() {
            return String.format("Расстояние жежду точками с координатами %s и %s  = %.3f",
                    pointOne.toString(), pointTwo.toString(), distance);
        }
    }
}
