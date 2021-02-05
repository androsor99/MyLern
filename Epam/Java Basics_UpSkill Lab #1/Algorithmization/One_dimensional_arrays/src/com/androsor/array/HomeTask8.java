package com.androsor.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * You are given a sequence of integers a1, a2, ..., an. Form a new sequence, discarding those terms from the original,
 *   which are equal to min (a1, a2, ..., an).
 */
public class HomeTask8 {

    public static void main (String[] args) {

        double[] myArray;
        int n;
        double minArray;
        int counter; // количество одинаковых минимумов в массиве.
        double [] myArrayNew; // массив без мин элементов исходного массива.

        Scanner sc = new Scanner(System.in);
        System.out.print(" Введите разрядность массива n = ");
        n = sc.nextInt();
        myArray = new double[n];
        System.out.println(" Заполняем массив элементами ");

        for (int i =0; i < n; i++ ) {
            System.out.print(" Введите элемент массива A[" + i + "] = ");
            myArray[i] = sc.nextDouble();
        }

        System.out.println(" Исходный массив ");
        System.out.println("----------------------------------------");
        System.out.println(" " + Arrays.toString(myArray));
        System.out.println("----------------------------------------");

        minArray = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < minArray) {
                minArray = myArray[i];
            }
        }

        counter = 1;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != minArray) {
               counter++;
            }
        }

        if ((counter == 1) | (counter == n)){
            System.out.println(" Весь массив состоиит из одного или из одинаковых элементов, составить новый массив невозможно ");
        } else {
            myArrayNew = new double[counter];
            int j = 0;
            for (int i = 0; i < myArray.length; i ++) {
                if (myArray[i] != minArray) {
                    myArrayNew[j] = myArray[i];
                    j++;
                }
            }

            System.out.println(" Новая последовательность");
            System.out.println("---------------------------------------------");
            System.out.println(Arrays.toString(myArrayNew));
        }
    }
}
