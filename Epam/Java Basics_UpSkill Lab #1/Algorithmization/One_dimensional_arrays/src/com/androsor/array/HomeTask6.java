package com.androsor.array;

import static com.androsor.array.ArrayCreator.inputParameter;
import static com.androsor.array.ArrayCreator.createArray;
import static com.androsor.array.ArrayCreator.printArray;

/**
 * A sequence of N real numbers is given. Calculate the sum of numbers whose ordinal numbers are prime numbers.
 */
public class HomeTask6 {

    public static void main(String[] args) {

        int arrayWidth; // разрядность массива

        System.out.print (" Введите количество элементов ммассива arrayWidth = ");
        arrayWidth = inputParameter();

        System.out.println(" Исходный массив: ");
        int[] myArray = createArray(arrayWidth);
        printArray(myArray);

        System.out.print(" Сумма элементов массива с простыми индексами = " + getSum(myArray));
   }

    private static int getSum(int[] array) {
        int sum = 0; // Сумма элементов массива
        for (int i = 2; i < array.length; i++) {
            if (isPrime(i)) {
                sum += array[i];
            }
        }
        return sum;
    }

    private static boolean isPrime(int value) { // метод для проверки на простоту.
        for (int j = 2; j < Math.sqrt(value) + 1; j++) {
            if (value % j == 0) {
                return false;
            }
        }
        return true;
    }
}
