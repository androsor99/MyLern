package com.androsor.sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Implement exchange sort.
 */

public class HomeTask3 {

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
        for(int i = myArray.length-1 ; i > 0 ; i--) {
            for(int j = 0 ; j < i ; j++) {
                if( myArray[j] > myArray[j+1] ) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                }
           }
        }

        System.out.println(" Отсортированный массив по возрастанию ");
        System.out.println(Arrays.toString(myArray));
        System.out.println();

        // Сортируем по убыванию.
        for(int i = myArray.length-1 ; i > 0 ; i--) {
            for(int j = 0 ; j < i ; j++) {
                if( myArray[j] < myArray[j+1] ) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                }
            }
        }

        System.out.println(" Отсортированный массив по убыванию");
        System.out.println(Arrays.toString(myArray));
    }
}