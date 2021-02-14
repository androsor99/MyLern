package com.androsor.array;

import java.util.Scanner;

public class ArrayCreator {

    public static int inputParameter() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int[] createArray( int arrayWidth) {
        System.out.println(" Заполните исходный массив элементами:");
        int[] myArray = new int[arrayWidth];
        for (int i = 0; i < arrayWidth; i++) { // заполняем массив arrayWidth числами
            System.out.print(" Введите элемент массива myArray[" + i + "] = ");
            myArray[i] = inputParameter();
        }
        return myArray;
    }
}
