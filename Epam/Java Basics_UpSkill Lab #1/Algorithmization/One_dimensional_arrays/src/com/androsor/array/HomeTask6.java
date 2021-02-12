package com.androsor.array;

import java.util.Arrays;

/**
 * A sequence of N real numbers is given. Calculate the sum of numbers whose ordinal numbers are prime numbers.
 */
public class HomeTask6 {

    public static void main(String[] args) {

        int arrayWidth; // разрядность массива

        System.out.print (" Введите количество элементов ммассива arrayWidth = ");
        arrayWidth = HomeTask1.inputParameter();

        System.out.println(" Исходный массив: ");
        int[] myArray = HomeTask2.createArray(arrayWidth);
        System.out.println(" " + Arrays.toString(myArray));

        System.out.print(" Сумма элементов массива с простыми индексами = " + getSum(myArray));
   }

    private static int getSum(int[] myArray) {

        int sum = 0; // Сумма элементов массива
        for (int i = 2; i < myArray.length; i++) {
            if (primeNumber(i)) {
                sum += myArray[i];
            }
        }
        return sum;
    }


    private static boolean primeNumber(int k) { // метод для проверки на простоту.

        for (int j = 2; j < Math.sqrt(k) + 1; j++) {
            if (k % j == 0) {
                return false;
            }
        }
        return true;
    }
}
