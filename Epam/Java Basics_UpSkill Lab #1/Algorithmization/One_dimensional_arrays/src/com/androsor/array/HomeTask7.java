package com.androsor.array;

import java.util.Arrays;

/**
 * You are given real numbers a (1), a (2), ..., a (2n).
 * Find max (a (1) + a (2n), a (2) + a (2n-1), ..., a (n) + a (n + 1)).
 */
public class HomeTask7 {

    public static void main(String[] args) {

        int arrayWidth; // разрядность массива

        System.out.print (" Введите количество элементов ммассива 2n = ");
        arrayWidth = HomeTask1.inputParameter();

        System.out.println(" Исходный массив: ");
        System.out.println(" ------------------------------------------------------- ");
        int[] myArray = HomeTask2.createArray((2 * arrayWidth));
        System.out.println(" " + Arrays.toString(myArray));
        System.out.println(" ------------------------------------------------------- ");

        var maxSum = getMaxSum(myArray);
        System.out.print(" Максимум суммы элементов масива = " + maxSum);
    }

    private static int getMaxSum(int[] myArray) {

        var maxSum = myArray[0] + myArray[(myArray.length - 1)];
        for (int i = 1; i < (myArray.length/2) ; i++) {
            var temp = myArray[i] + myArray[(myArray.length - i - 1)];
            if ( temp > maxSum) {
                maxSum = temp ;
            }
        }
        return maxSum;
    }
}
