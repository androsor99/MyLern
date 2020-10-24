package com.androsor.decomp;

import java.util.Scanner;

/**
 * Calculate the area of a regular hexagon from the side using the triangle area method.
 */

public class HomeTask3 {

    public static void main(String[] args) {

        double sideLengthTriangle; // Длина стороны треугольника.

        System.out.print(" Введите длину стороны треугольника = ");
        Scanner sc = new Scanner(System.in);

        while (!sc.hasNextDouble()) {
            sc.next();
            System.out.println(" Введенная длина стороны треугольника должна быть числом и иметь положительное значение." +
                    " Повторите ввод.");
            System.out.print(" Введите длину стороны треугольника = ");
        }
        sideLengthTriangle = sc.nextDouble();

        while (sideLengthTriangle <= 0) {
            System.out.println(" Введенная длина стороны треугольника должна быть числом и иметь положительное значение." +
                    " Повторите ввод.");
            System.out.print(" Введите длину стороны треугольника = ");
            sideLengthTriangle = sc.nextDouble();
        }
        System.out.printf("Площадь правильного шестиугольника со стороной %.2f равна %.2f",
                sideLengthTriangle, 6 * areaTriangle(sideLengthTriangle));
    }

    // Метод расчета площади треугольника.
    public static double areaTriangle(double a) {
        return (Math.sqrt(3) / 4) * (a * a);
    }
}