package com.androsor.array;

import static com.androsor.array.ArrayCreator.*;

/**
 * The array A [N] contains natural numbers. Find the sum of those elements that are multiples of a given K.
 */
public class HomeTask1 {

    public static void main(String[] args) {

        int arrayWidth; // разрядность массива.
        int multiplicityFactor; // Коэфициент кратности.
        int sum; // Сумма элементоав массива.

        System.out.print(" Введите количество элементов массива = ");
        arrayWidth = inputParameter();

        int[] myArray = createArray(arrayWidth);
        printArray(myArray);

        System.out.print(" Введите коэфициент кратности К = ");
        multiplicityFactor = inputParameter();

        sum = getSum(myArray, multiplicityFactor);
        printSum(multiplicityFactor, sum);
    }

    private static int getSum(int[] array, int multiplicityFactor) {
        int sum = 0;
        for (int element : array) {
            if (element % multiplicityFactor == 0) {
                sum += element;
            }
        }
        return sum;

    }

    private static void printSum(int multiplicityFactor, int sum) {
        if (sum > 0) {
            System.out.println(" Сумма элементов массива, которые кратны - " + multiplicityFactor + ", равна - " + sum);
        } else {
            System.out.println(" Массив не содержит элементов кратных К = " + multiplicityFactor);
        }
    }
}
