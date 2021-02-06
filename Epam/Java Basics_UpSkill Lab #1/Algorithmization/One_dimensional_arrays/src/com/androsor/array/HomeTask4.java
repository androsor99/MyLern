package com.androsor.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A sequence of real numbers a1, a2, ..., an is given. Replace all its members greater than the given Z with this number.
 * Count the number of substitutions.
 */
public class HomeTask4 {

    public static void main(String[] args) {
        int [] myArray; // Объявление массива
        int n; // разрядность массива
        int itemMax; // Максимальный элемент массива
        int itemMin; // Минимальный элемент массива
        int indexMax = 0; // Индекс максимального элемента
        int indexMin = 0; // Индекс минимального элемента

        Scanner sc = new Scanner(System.in);
        System.out.print(" Введите количество элементов ммассива n = ");
        n = sc.nextInt();
        myArray = new int[n];
        System.out.println(" Заполните исходный массив элементами:");

        for (int i = 0; i < n; i++) { // заполняем массив n числами
            System.out.print(" Введите элемент массива A[" + i + "] = ");
            myArray[i] = sc.nextInt();
        }

        System.out.println(" Исходный массив: ");
        System.out.println(" " + Arrays.toString(myArray));

        itemMin = myArray[0]; // Принимаеи за мин. начальный элемент массива.
        itemMax = myArray[0]; // Принимаем за max. первый элемент массива.

        for (int i = 1; i < myArray.length; i++) {

            if (myArray[i] < itemMin) {
                itemMin = myArray[i];
                indexMin = i;
            } else {
                if (myArray[i] > itemMax) {
                    itemMax = myArray[i];
                    indexMax = i;
                }
            }
        }

        int temp = myArray[indexMin]; // временная переменная
        myArray[indexMin] = myArray[indexMax]; // меняем местами min. и max.
        myArray[indexMax] = temp;

        System.out.println("-----------------");
        System.out.println(" Конечный массив: ");
        System.out.println(" " + Arrays.toString(myArray));
    }
}