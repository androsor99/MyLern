package com.androsor.decomp;

import java.util.Scanner;

/**
 * Given the numbers X, Y, Z, T - the length of the sides of the quadrangle. Write a method (s) for calculating its area
 * if the angle between the length X and Y is a straight line.
 */

public class HomeTask9 {

    public static void main (String[] args) {

        double sideTriangleX;
        double sideTriangleY;
        double sideTriangleZ;
        double sideTriangleT;
        double areaQuadrangle;

        sideTriangleX = dataInput(" Введите длину стороны четырехугольника X = ");
        sideTriangleY = dataInput(" Введите длину стороны четырехугольника Y = ");
        sideTriangleZ = dataInput(" Введите длину стороны четырехугольника Z = ");
        sideTriangleT = dataInput(" Введите длину стороны четырехугольника T = ");

        double hypo = findHypotenuse(sideTriangleX,sideTriangleY); // Находим гипотенузу.
        double halfPerimeter1 = findHalfPerimeter(sideTriangleX, sideTriangleY, hypo); // Полупериметр треугольника
        double halfPerimeter2 = findHalfPerimeter(sideTriangleZ, sideTriangleT, hypo);


        areaQuadrangle = findTriangleSquare(sideTriangleX, sideTriangleY, hypo, halfPerimeter1) +
                findTriangleSquare(sideTriangleZ, sideTriangleT, hypo, halfPerimeter2); // Площадь четырехугольника.

        System.out.printf(" Площадь четырехугольника = %.3f", areaQuadrangle);
    }

    // Метод ввода данных.
    public  static  double dataInput(String massage) {
        System.out.print(massage);
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextDouble()) {
            sc.next();
            System.out.print(" Введенные данные не являются  числами. Повторите ввод. ");
        }
        return sc.nextDouble();
    }

    // Метод нахождения гипотенузы.
    public static double findHypotenuse(double num1, double num2) {

        double hypo;
        hypo = Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2));
        return hypo;
    }

    // Метод нахождения полупериметра
    public static double findHalfPerimeter(double num1, double num2,double hypo) {

        double halfPerimeter;
        halfPerimeter = (num1 + num2 + hypo ) / 2;
        return halfPerimeter;
    }

    // Метод нахождения площади треугольника ( формула Герона)
    public static double findTriangleSquare(double num1, double num2,double hypo,double hp) {

        double square;
        square = Math.sqrt(hp* (hp - num1) * (hp-num2) *( hp -  hypo));
        return square;
    }
}



