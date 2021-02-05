package com.androsor.array;

import java.util.Scanner;

/**
 * You are given an array of real numbers, the dimension of which is N.
 * Calculate how many negative, positive and zero elements it contains.
 */
public class HomeTask3 {

    public static void main(String[] args) {
        double[] myArray; // Объявление массива
        int n; // разрядность массива
        int numberOfPositive = 0; // Количество положительных элементов
        int numberOfNegative = 0; // Количество отрицательных элементов
        int numberOfZero = 0; // Количество элементов равных нулю

        Scanner sc = new Scanner(System.in);
        System.out.print(" Введите количество элементов ммассива n = ");
        n = sc.nextInt();
        myArray = new double[n];
        System.out.println(" Заполните исходный массив элементами:");
        for (int i = 0; i < n; i++) { // заполняем массив n числами
            System.out.print(" Введите элемент массива A[" + i + "] = ");
            myArray[i] = sc.nextInt();
        }

        for (double v : myArray) {
            if (v == 0) {
                numberOfZero++;
            }

            if (v > 0) {
                numberOfPositive++;
            }

            if (v < 0) {
                numberOfNegative++;
            }
        }

        System.out.println(" Количество положительных элементов =  " + numberOfPositive);
        System.out.println(" Количество отрицательных элементов =  " + numberOfNegative);
        System.out.println(" Количество элементов равных 0 =  " + numberOfZero);
    }
}