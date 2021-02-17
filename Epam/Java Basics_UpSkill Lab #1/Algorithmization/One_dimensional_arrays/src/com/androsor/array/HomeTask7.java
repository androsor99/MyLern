package com.androsor.array;

import static com.androsor.array.ArrayCreator.inputParameter;
import static com.androsor.array.ArrayCreator.createArray;
import static com.androsor.array.ArrayCreator.printArray;

/**
 * You are given real numbers a (1), a (2), ..., a (2n).
 * Find max (a (1) + a (2n), a (2) + a (2n-1), ..., a (n) + a (n + 1)).
 */
public class HomeTask7 {

    public static void main(String[] args) {

        int arrayWidth; // разрядность массива

        System.out.print (" Введите количество элементов ммассива 2n = ");
        arrayWidth = inputParameter();

        System.out.println(" Исходный массив: ");
        int[] myArray = createArray((2 * arrayWidth));
        printArray(myArray);

        System.out.print(" Максимум суммы элементов масива = " + getMaxSum(myArray));
    }

    private static long getMaxSum(int[] array) {
        var maxSum = array[0] + array[(array.length - 1)];
        for (int i = 1; i < (array.length / 2); i++) {
            var temp = array[i] + array[(array.length - i - 1)];
            if (temp > maxSum) {
                maxSum = temp;
            }
        }
        return maxSum;
    }
}
