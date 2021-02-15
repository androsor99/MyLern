package com.androsor.sort;

import java.util.Scanner;

import static com.androsor.sort.ArrayCreator.*;

/**
 * Two one-dimensional arrays with different number of elements and a natural number k are given.
 * Combine them into one array, including the second array between the kth and (k + 1) - th elements of the first,
 * without using an additional array.
 */
public class HomeTask1 {

    public static void main(String[] args) {

        int arrayWidthM, arrayWidthN; // Разрядность массивов.
        int index; // Индекс элемента первого массива после кторого будет вставлен второй массив.

        System.out.print(" Введите количество элементов первого ммассива M = ");
        arrayWidthM = inputParameter();

        System.out.println(" Первый массив с количеством элементов M = " + arrayWidthM);
        int[] myArrayM = createArray(arrayWidthM);
        printArray(myArrayM);

        System.out.print(" Введите количество элементов первого ммассива N = ");
        arrayWidthN = inputParameter();

        System.out.println(" Второй массив с количеством элементов N = " + arrayWidthN);
        int[] myArrayN = createArray(arrayWidthN);
        printArray(myArrayN);

        System.out.print(" Введите индекс элемента первого массива после кторого будет вставлен второй массив, K = ");
        index = inputIndex(arrayWidthM);

        System.out.println(" Объединенный массив с количеством элементов M + N = " + (arrayWidthM + arrayWidthN));
        int[] myArrayMN = concatenateArrays(index, myArrayM, myArrayN);
        printArray(myArrayMN);
    }

    private static int inputIndex(int arrayWidth) {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        while ((index > arrayWidth) || (index < 0)) {
            System.out.println(" Индекс элемента первого массива не должен превышать его длину и быть больше нуля");
            System.out.print(" Введите индекс элемента первого массива после кторого будет вставлен второй массив, K = ");
            index = scanner.nextInt();
        }
        return index;
    }

    private static int[] concatenateArrays(int index, int[] myArrayM, int[] myArrayN) {
        int[] myArrayMN = new int [myArrayM.length + myArrayN.length];
        System.arraycopy(myArrayM, 0, myArrayMN, 0, index);
        System.arraycopy(myArrayN, 0, myArrayMN, index, myArrayN.length);
        System.arraycopy(myArrayM, index, myArrayMN, (index + myArrayN.length), (myArrayM.length - index));
        return myArrayMN;
    }
}
