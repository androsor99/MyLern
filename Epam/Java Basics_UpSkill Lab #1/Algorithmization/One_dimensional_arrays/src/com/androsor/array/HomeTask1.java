package com.androsor.array;

import java.util.Scanner;

/**
 * The array A [N] contains natural numbers. Find the sum of those elements that are multiples of a given K.
 */
public class HomeTask1 {

    public static void main(String[] args) {

        int[] A; // Объявление массива.
        int n; // разрядность массива.
        int K; // Коэфициент кратности.
        int sum =0; // Сумма элементоав массива.

        Scanner sc = new Scanner(System.in);
        System.out.print(" Введите количество элементов ммассива n = ");
        n = sc.nextInt();
        A = new int[n];
        System.out.print(" Введите коэфициент кратности K = ");
        K = sc.nextInt();
        for (int i = 0; i < n; i++) { // заполняем массив n числами
            System.out.print(" Введите элемент массива A[" + i + "] = ");
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] % K == 0) {
                sum += A[i];
            }
        }

        if (sum > 0) {
            System.out.println(" Сумма элементов массива А, которые кратны " + K + ", равна " + sum);

        } else {
            System.out.println(" Массив не содержит элементов кратных К = " + K);
        }
    }
}

