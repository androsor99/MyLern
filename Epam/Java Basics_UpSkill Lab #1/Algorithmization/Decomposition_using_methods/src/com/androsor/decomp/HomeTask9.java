package com.androsor.decomp;

import static com.androsor.decomp.IOUtils.enterParameterFromConsoleInt;
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Given the numbers X, Y, Z, T - the length of the sides of the quadrangle. Write a method (s) for calculating its area
 * if the angle between the length X and Y is a straight line.
 */
public class HomeTask9 {

    private static final String INPUT_MESSAGE = "Введите длину стороны четырехугольника %s = ";

    public static void main (String[] args) {

        int sideX = enterParameterFromConsoleInt(String.format(INPUT_MESSAGE, "sideX"));
        int sideY = enterParameterFromConsoleInt(String.format(INPUT_MESSAGE, "sideY"));
        int sideZ = enterParameterFromConsoleInt(String.format(INPUT_MESSAGE, "sideZ"));
        int sideT = getFourthSideOfQuadrangle(sideX,sideY, sideZ);

        double hypo = getHypotenuse(sideX, sideY); // Находим гипотенузу.
        double halfPerimeter1 = getHalfPerimeter(sideX, sideY, hypo); // Полупериметр треугольника
        double halfPerimeter2 = getHalfPerimeter(sideZ, sideT, hypo);
        double triangleSquare1 = getTriangleSquare(sideX, sideY, hypo, halfPerimeter1);
        double triangleSquare2 = getTriangleSquare(sideZ, sideT, hypo, halfPerimeter2);

        double quadrangleSquare = getQuadrangleSquare(triangleSquare1, triangleSquare2);
        System.out.printf(" Площадь четырехугольника = %.2f", quadrangleSquare);
    }

    private static int getFourthSideOfQuadrangle(int sideX, int sideY, int sideZ) {
        int sideT = enterParameterFromConsoleInt(String.format(INPUT_MESSAGE, "sideT"));
        if (!isValidityFourthSideQuadrangle(sideX, sideY, sideZ, sideT)) {
            double hypo = getHypotenuse(sideX, sideY);
            System.out.printf("Четырехугольник не существует. Четвертая сторона должна быть больше %f и меньше %f\n", abs(hypo - sideZ),
                    hypo + sideZ);
            return getFourthSideOfQuadrangle(sideX, sideY, sideZ);
        }
        return sideT;
    }

    private static double getHypotenuse(double leg1, double leg2) {
        return sqrt(pow(leg1, 2) + pow(leg2, 2));
    }

    private static boolean isValidityFourthSideQuadrangle(int sideX, int sideY, int sideZ, int sideT) {
        double hypo = getHypotenuse(sideX, sideY);
        return ((sideT > abs(hypo - sideZ)) && (sideT < hypo + sideZ));
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
