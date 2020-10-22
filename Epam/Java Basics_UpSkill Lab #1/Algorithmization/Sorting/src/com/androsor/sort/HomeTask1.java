package com.androsor.sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Two one-dimensional arrays with different number of elements and a natural number k are given.
 * Combine them into one array, including the second array between the kth and (k + 1) - th elements of the first,
 * without using an additional array.
 */

public class HomeTask1 {

    public static void main(String[] args) {

        int [] myArrayM; // Массив с M количеством элементов.
        int [] myArrayN; // массив с N количеством элементов.
        int [] myArrayMN; // Объединённый иассив.
        int m, n; // Разрядность массивов.
        int k; // Индекс элемента первого массива после кторого будет вставлен второй массив.

        Scanner sc = new Scanner(System.in);
        System.out.print(" Введите количество элементов первого ммассива M = ");
        m = sc.nextInt();
        Random random = new Random();
        myArrayM = new int[m];
        for (int i = 0; i < m; i++) {
            myArrayM[i] = random.nextInt(100);
        }

        System.out.print(" Введите количество элементов первого ммассива N = ");
        n = sc.nextInt();
        myArrayN = new int[n];
        for (int i = 0; i < n; i++) {
            myArrayN[i] = random.nextInt(100);
        }

        System.out.println(" Первый массив с количеством элементов M = " + m);
        System.out.println(Arrays.toString(myArrayM));

        System.out.println(" Второй массив с количеством элементов N = " + n);
        System.out.println(Arrays.toString(myArrayN));

        System.out.print(" Введите индекс элемента первого массива после кторого будет вставлен второй массив K = ");
        k = sc.nextInt();
        while ((k > m) || (k == 0)) {
            System.out.println(" Индекс элемента первого массива не должен превышать его длину и быть больше нуля");
            System.out.print(" Введите индекс элемента первого массива после кторого будет вставлен второй массив K = ");
            k = sc.nextInt();
        }

        myArrayMN = new int [m + n];

        System.arraycopy(myArrayM, 0, myArrayMN, 0, k);
        System.arraycopy(myArrayN, 0, myArrayMN, k , n);
        System.arraycopy(myArrayM, k, myArrayMN, (k + n), (m -k));

        System.out.println(" Объединенный массив с количеством элементов M + N = " + (m + n));
        System.out.println(Arrays.toString(myArrayMN));
    }
}