package com.androsor.decomp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A natural number N is given. Write a method (methods) for forming an array,
 * the elements of which are the digits of the number N.
 */

public class HomeTask10 {

    public static void main(String[] args) {

        int number;
        int[] myArray;

        Scanner sc = new Scanner(System.in);
        System.out.print(" Введите натуральное число: ");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println(" Введенное значеине должно быть числом и иметь положительное значение." +
                    " Повторите ввод.");
            System.out.print(" Введите натуральное число:  ");
        }
        number = sc.nextInt();

        while (number <= 0) {
            System.out.println(" Введенное значеине должно быть числом и иметь положительное значение." +
                    " Повторите ввод.");
            System.out.print(" Введите натуральное число:  ");
            number = sc.nextInt();
        }

        int arraylength = findArrayLength(number);
        System.out.println(" Длина массива из цифр введенного числа = " + arraylength);

        myArray = addElements(number, arraylength);
        System.out.println(" Массив из цифр введенного числа: " + Arrays.toString(myArray));

    }

    // Метод нахождения длины массива (равен количеству цифер числа)
    public static int findArrayLength(int num) {
        int counter = 0;

        while (num != 0) {
            counter++;
            num = num / 10;
        }
        return counter;
    }

    // Метод разбиения числа на цифры
    public static int[] addElements(int number, int arrayLength) {
        int[] myArr = new int[arrayLength];

        while (number != 0) {
            for (int i = arrayLength - 1; i >= 0; i--) {
                int digit = number % 10;
                myArr[i] = digit;
                number = number / 10;
            }
        }
        return myArr;
    }
}
