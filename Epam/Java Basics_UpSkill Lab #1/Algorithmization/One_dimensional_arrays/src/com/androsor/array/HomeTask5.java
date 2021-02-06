package com.androsor.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Integers a1, a2, ..., an are given. Print only those numbers for which ai> i.
 */
public class HomeTask5 {

    public static void main(String[] args) {
        int[] myArray; // Объявление массива
        int n; // разрядность массива

        Scanner sc = new Scanner(System.in);
        System.out.print(" Введите количество элементов ммассива n = ");
        n = sc.nextInt();
        myArray = new int[n];
        System.out.println(" Заполните исходный массив элементами:");

        for (int i = 0; i < n; i++) { // заполняем массив n числами
            System.out.print(" Введите элемент массива A[" + i + "] = ");
            myArray[i] = sc.nextInt();
        }

        System.out.println(" Исходный массив: ");
        System.out.println(" " + Arrays.toString(myArray));

        System.out.println(" Список элементов массива у которых значение больше их индекса :");

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > i) {
                System.out.print(" " + myArray[i]);
            }
        }
    }
}