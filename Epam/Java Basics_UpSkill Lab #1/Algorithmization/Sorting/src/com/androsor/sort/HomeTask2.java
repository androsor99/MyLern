package com.androsor.sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Implement selection sort.
 */
public class HomeTask2 {

    public static void main(String[] args) {

        int[] myArray; // массив с N количеством элементов.
        int n; // Разрядность массивов.

        Scanner sc = new Scanner(System.in);
        System.out.print(" Введите количество элементов первого ммассива N = ");
        n = sc.nextInt();
        Random random = new Random();
        myArray = new int[n];
        for (int i = 0; i < n; i++) {
            myArray[i] = random.nextInt(100);
        }

        System.out.println(" Исходный массив с количеством элементов N = " + n);
        System.out.println(Arrays.toString(myArray));
        System.out.println();

        // Сортируем по возрастанию.
        for (int i = 0; i < myArray.length; i++) {
            int minMyArray = myArray[i];
            int minIndexMyArray = i;
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[j] < minMyArray) {
                    minMyArray = myArray[j];
                    minIndexMyArray = j;
                }
            }

            if (i != minIndexMyArray) {
                int temp = myArray[i];
                myArray[i] = myArray[minIndexMyArray];
                myArray[minIndexMyArray] = temp;
            }
        }

        System.out.println(" Отсортированный массив по возрастанию ");
        System.out.println(Arrays.toString(myArray));
        System.out.println();

        // Сортируем по убыванию.
        for (int i = 0; i < myArray.length; i++) {
            int maxMyArray = myArray[i];
            int maxIndexMyArray = i;
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[j] > maxMyArray) {
                    maxMyArray = myArray[j];
                    maxIndexMyArray = j;
                }
            }

            if (i != maxIndexMyArray) {
                int temp = myArray[i];
                myArray[i] = myArray[maxIndexMyArray];
                myArray[maxIndexMyArray] = temp;
            }
        }

        System.out.println(" Отсортированный массив по убыванию");
        System.out.println(Arrays.toString(myArray));
    }
}
