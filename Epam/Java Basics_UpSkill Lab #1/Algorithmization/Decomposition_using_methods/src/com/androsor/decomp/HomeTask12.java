package com.androsor.decomp;

import java.util.ArrayList;
import java.util.List;

import static com.androsor.decomp.Data.inputDataInt;
import static java.lang.Math.*;

/**
 * Given natural numbers K and N. Write a method (methods) for forming an array A, whose elements are numbers whose sum
 * of digits is equal to K and which are not greater than N.
 */
public class HomeTask12 {

    public static void main (String[]args) {

        int numberK = abs(inputDataInt(" Введите число numberK = "));

        int numberN = abs(inputDataInt(" Введите число numberN = "));

        List<Integer> myArray = fillArray(numberK, numberN);
        printArray(myArray);
    }

    private static List<Integer> fillArray(int numberK, int numberN) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= numberN; i++) {
            if (getSumDigitsOfNumber(i) == numberK) {
                list.add(i);
            }
        }
        return list;
    }

    private static int getSumDigitsOfNumber(int number) {
        int sum = 0;
        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }

    private static void printArray(List<Integer> list) {
        if (list.isEmpty()) {
            System.out.println(" Создать массив невозможно. На заданном диапазоне не существует чисел удовлетворяющих вводимым данным!");
        } else {
            System.out.println(" Массив из элементов согласно условию задачи:");
            System.out.println("----------------------------------------");
            System.out.println(" " + list.toString());
            System.out.println("----------------------------------------");
        }
    }
}
