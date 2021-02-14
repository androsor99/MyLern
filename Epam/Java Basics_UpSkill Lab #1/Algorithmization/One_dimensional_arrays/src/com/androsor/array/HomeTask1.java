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

        System.out.print(" Введите коэфициент кратности К = ");
        multiplicityFactor = inputParameter();

        sum = getSum(arrayWidth, multiplicityFactor);
        printSum(multiplicityFactor, sum);
    }

    private static int getSum(int arrayWidth, int multiplicityFactor) {
        int sum = 0;
        int[] myArray = new int[arrayWidth];
        for (int i = 0; i < myArray.length; i++) { // заполняем массив arrayWidth числами
            System.out.print(" Введите элемент массива myArray[" + i + "] = ");
            myArray[i] = inputParameter();
            if (myArray[i] % multiplicityFactor == 0) {
                sum += myArray[i];
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
