package com.androsor.array;

import java.util.Scanner;

/**
 * A sequence of real numbers a1, a2, ..., an is given. Replace all its members greater than the given Z with this number.
 * Count the number of substitutions.
 */
public class HomeTask2 {

    public static void main(String[] args) {
        int[] myArray; // Объявление массива
        int n; // разрядность массива
        int Z; // Число для замены
        int numberOfReplace = 0; // Количество замен

        Scanner sc = new Scanner(System.in);
        System.out.print(" Введите количество элементов ммассива n = ");
        n = sc.nextInt();
        myArray = new int[n];
        System.out.print(" Введите число для замены Z = ");
        Z = sc.nextInt();
        System.out.println(" Заполните исходный массив элементами:");

        for (int i = 0; i < n; i++) { // заполняем массив n числами
            System.out.print(" Введите элемент массива A[" + i + "] = ");
            myArray[i] = sc.nextInt();
        }

        System.out.println(" Замененный массив:");

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > Z) {
                myArray[i] = Z;
                numberOfReplace ++;
            }
            System.out.print(" " + myArray[i]);
        }

        System.out.println();
        System.out.println(" Число замен =  " + numberOfReplace);
    }
}

