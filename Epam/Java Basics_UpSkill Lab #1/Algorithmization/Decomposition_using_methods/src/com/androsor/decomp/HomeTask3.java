package com.androsor.decomp;

import static com.androsor.decomp.IOUtils.enterParameterFromConsoleDouble;
import static java.lang.Math.sqrt;

/**
 * Calculate the area of a regular hexagon from the side using the triangle area method.
 */
public class HomeTask3 {

    public static void main(String[] args) {

        double lengthSideHexagon = enterParameterFromConsoleDouble(" Введите длину стороны шестиугольника = ");

        double areaHexagon = getAreaHexagon(getAreaTriangle(lengthSideHexagon));
        printAreaHexagon(lengthSideHexagon, areaHexagon);
    }

    private static double getAreaHexagon(double areaTriangle) {
        return 6 * areaTriangle;
    }

    private static double getAreaTriangle(double side) {// Метод расчета площади правильного треугольника.
        return (sqrt(3) / 4) * (side * side);
    }


    private static void printAreaHexagon(double lengthSideHexagon, double areaHexagon) {
        System.out.printf(" Площадь правильного шестиугольника со стороной = %.2f равна - %.2f",
                lengthSideHexagon, areaHexagon);
    }
}
