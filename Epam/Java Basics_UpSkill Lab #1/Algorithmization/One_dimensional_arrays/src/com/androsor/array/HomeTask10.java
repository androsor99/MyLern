package com.androsor.array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 * An integer array with elements of n is given. Compress the array, discarding every second element from it
 * (fill the released elements with zeros).
 */
public class HomeTask10 {

    public static void main (String[] args) {

        int [] myArray; // объявляем массив.
        int n; // разрядность массива.

        Scanner sc = new Scanner(System.in);
        System.out.print(" Введите разрядность массива n = ");
        n = sc.nextInt();

        myArray = new int[n];
        Random random = new Random(n);
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(30);
        }

        System.out.println(" Исходный массив ");
        System.out.println("----------------------------------------");
        System.out.println(" " + Arrays.toString(myArray));
        System.out.println("----------------------------------------");


        for (int i = 1; i < myArray.length -1; i=i + 1) {
            myArray[i] = myArray[i+1];
            for (int j = i + 1 ; j < myArray.length -1; j = j+1){
                myArray[j] = myArray[j+1];
            }

            myArray[n-1] = 0;
            }

        System.out.println(" Сжатый массив");
        System.out.println("----------------------------------------");
        System.out.println(" " + Arrays.toString(myArray));
    }
}
