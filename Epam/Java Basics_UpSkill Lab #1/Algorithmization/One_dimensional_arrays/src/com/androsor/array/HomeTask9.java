package com.androsor.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Find the most frequent number in an array of integers with n elements. If there are several such numbers,
 * then determine the smallest of them.
 */
public class HomeTask9 {

    public static void main (String[] args) {

        double [] myArray; // объявляем массив.
        int n; // разрядность массива
        int counter; // Текущий счетчик повторов.
        int counterLargest = 1; // Наибольшее число повторов.
        double elementFrequency = 0; // Наиболее часто встречающийся элемент массива.
        double elementFrequencyCurrent; // текущий ниболее встречающийся элемент.


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

        elementFrequencyCurrent = myArray[0]; // начинаем перебор с первого элемента массива.

        for (int i = 0; i < myArray.length - 1; i++) {

            counter = 1; // устанавливаем\сбрасываем счетчик.

            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]) {
                    counter++;
                    elementFrequencyCurrent = myArray[i];
                }
            }

            if (counter > counterLargest) {
                counterLargest = counter;
                elementFrequency = myArray[i];
            } else if  (counterLargest == counter && elementFrequency > elementFrequencyCurrent) {
                elementFrequency = myArray[i];
            }
        }

        if (counterLargest == 1) {
            System.out.println(" Повторяющихся элементов в массиве нет");
        } else {
            System.out.println(" Наименьший часто встречающийся элемент массива = " + elementFrequency);
        }
    }
}

