package com.androsor.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * You are given real numbers a (1), a (2), ..., a (2n).
 * Find max (a (1) + a (2n), a (2) + a (2n-1), ..., a (n) + a (n + 1)).
 */
public class HomeTask7 {

    public static void main(String[] args) {

        double [] myArray; // Объявление массива
        int n; // разрядность массива
        double maxSum; // Максимум суммы элементов массива

        Scanner sc = new Scanner(System.in);
        System.out.print (" Введите количество элементов ммассива 2n = ");
        n = sc.nextInt();
        myArray = new double[(2 * n)];
        System.out.println (" Заполните исходный массив элементами:");

        for (int i = 0; i < (2 * n); i++) { // заполняем массив 2n числами
            System.out.print(" Введите элемент массива A[" + i + "] = ");
            myArray[i] = sc.nextDouble();
        }

        System.out.println(" Исходный массив: ");
        System.out.println(" ------------------------------------------------------- ");
        System.out.println(" " + Arrays.toString(myArray));
        System.out.println(" ------------------------------------------------------- ");

        maxSum = myArray[0] + myArray[(2*n -1)];
        for (int i = 1; i < (myArray.length/2) ; i++) {
            double temp = myArray[i] + myArray[(2 * n - i - 1)];
            if ( temp > maxSum) {
                maxSum = temp ;
            }
        }

        System.out.print(" Максимум суммы элементов масива " + maxSum);
    }
}
