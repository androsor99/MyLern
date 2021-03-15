package com.androsor.decomp;

import static com.androsor.decomp.IOUtils.enterParameterFromConsoleInt;
import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * Given the numbers X, Y, Z, T - the length of the sides of the quadrangle. Write a method (s) for calculating its area
 * if the angle between the length X and Y is a straight line.
 */
public class HomeTask9 {

    public static void main (String[] args) {

        int sideTriangleX = abs(enterParameterFromConsoleInt(" Введите длину стороны четырехугольника X = "));
        int sideTriangleY = abs(enterParameterFromConsoleInt(" Введите длину стороны четырехугольника Y = "));
        int sideTriangleZ = abs(enterParameterFromConsoleInt(" Введите длину стороны четырехугольника Z = "));
        int sideTriangleT = abs(enterParameterFromConsoleInt(" Введите длину стороны четырехугольника T = "));

        double hypo = getHypotenuse(sideTriangleX,sideTriangleY); // Находим гипотенузу.
        double halfPerimeter1 = getHalfPerimeter(sideTriangleX, sideTriangleY, hypo); // Полупериметр треугольника
        double halfPerimeter2 = getHalfPerimeter(sideTriangleZ, sideTriangleT, hypo);
        double triangleSquare1 = getTriangleSquare(sideTriangleX, sideTriangleY, hypo, halfPerimeter1);
        double triangleSquare2 = getTriangleSquare(sideTriangleZ, sideTriangleT, hypo, halfPerimeter2);

        double quadrangleSquare = getQuadrangleSquare(triangleSquare1, triangleSquare2);
        System.out.printf(" Площадь четырехугольника = %.2f", quadrangleSquare);
    }

    private static double getHypotenuse(double leg1, double leg2) {
        return sqrt(pow(leg1, 2) + pow(leg2, 2));
    }

    private static double getHalfPerimeter(double side1, double side2, double side3) {
        return (side1 + side2 + side3 ) / 2;
    }

    private static double getTriangleSquare(double side1, double side2, double side3, double halfPerimeter) { // формула Герона
        return sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
    }

    private static double getQuadrangleSquare(double triangleSquare1, double triangleSquare2) {
        return triangleSquare1 + triangleSquare2;
    }
}
