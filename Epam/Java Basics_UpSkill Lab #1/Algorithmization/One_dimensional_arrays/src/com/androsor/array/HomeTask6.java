package com.androsor.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A sequence of N real numbers is given. Calculate the sum of numbers whose ordinal numbers are prime numbers.
 */
public class HomeTask6 {

    public static void main(String[] args) {

        double [] myArray; // Объявление массива
        int n; // разрядность массива
        double sum = 0; // Сумма элементов массива

        Scanner sc = new Scanner(System.in);
        System.out.print (" Введите количество элементов ммассива n = ");
        n = sc.nextInt();
        myArray = new double[n];
        System.out.println (" Заполните исходный массив элементами:");

        for (int i = 0; i < n; i++) { // заполняем массив n числами
            System.out.print(" Введите элемент массива A[" + i + "] = ");
            myArray[i] = sc.nextDouble();
        }

        System.out.println(" Исходный массив: ");
        System.out.println(" " + Arrays.toString(myArray));

        for (int i = 2; i < myArray.length; i++) {
            if (primeNumber(i)) {
                sum += myArray[i];
            }
        }

        System.out.print(" Сумма элементов массива с простыми индексами = " + sum);
   }

   // метод для проверки на простоту.

    public static boolean primeNumber(int k) {
        for (int j = 2; j < Math.sqrt(k)+1; j++) {
            if (k % j == 0) {
                return false;
            }
        }
        return true;
    }
}