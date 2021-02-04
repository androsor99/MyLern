package com.androsor.branch;

/**
 * The two angles of the triangle are given (in degrees). Determine if such a triangle exists, and if so, whether it will be rectangular.
 */
public class HomeTask1 {

    public static void main(String[] args) {
        double corner1 = 89;
        double corner2 = 189;

        if (corner1 < 0 || corner2 < 0) {
            System.out.println( "Значение угла в градусах должно быть в положительном диапазоне");
        }
        else {
            if (corner1 + corner2 < 180) {
                System.out.println("Треугольник существует");
                if ((corner1 == 90) || (corner2 == 90) || (corner1 + corner2 == 90)) {
                    System.out.println("Треугольник прямоугольный");
                }
            }
            else {
                System.out.println("Треугольник не существует");
            }
        }
    }
}
