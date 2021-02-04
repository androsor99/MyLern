package com.androsor.branch;

/**
 * The dimensions A, B of the rectangular hole and the dimensions x, y, z are given. Determine if the brick will fit through the hole.
 */
public class HomeTask4 {

    public static void main(String[] args) {
        double A = 0;
        double B = 0;
        double x = 0;
        double y = 0;
        double z = 0;

<<<<<<< HEAD
        if (checkNegative(A, B, x, y, z)) {
        if ((x<=A && y<=B) || (y<=A && x<=B) || (x<=A && z<=B) || (z<=A && x<=B) || (z<=A && y<=B) || (y<=A && z<=B)) {
=======
        if (A > 0 & B > 0 & x > 0 & y > 0 & z > 0) {
            if ((x<=A && y<=B) || (y<=A && x<=B) || (x<=A && z<=B) || (z<=A && x<=B) || (z<=A && y<=B) || (y<=A && z<=B)) {
>>>>>>> 20abfb964b0798d08157d9ff06408ca0759ec2e7
                System.out.println(" Кирпич проскочит!))");
            }
            else {
                System.out.println(" Пилите, Шура, гири!))");
            }
        }
<<<<<<< HEAD



    }


    private static boolean checkNegative(double ... param) {

        for (int i =0; i >= param.length-1; i++) {
            if (param[i] <= 0) {
                System.out.println(" Размеры отверстия и кирпича должны быть оличными от нуля в положительную сторону");
                return false;

            }
        }
        return true;
=======
        else {
            System.out.println(" Размеры отверстия и кирпича должны быть оличными от нуля в положительную сторону");
        }
>>>>>>> 20abfb964b0798d08157d9ff06408ca0759ec2e7
    }
}