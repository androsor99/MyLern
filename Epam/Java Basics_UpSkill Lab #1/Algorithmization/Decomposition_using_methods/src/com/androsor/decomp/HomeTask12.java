package com.androsor.decomp;

import java.util.ArrayList;
import java.util.List;

import static com.androsor.decomp.IOUtils.enterParameterFromConsoleInt;
import static java.lang.Math.abs;

/**
 * Given natural numbers K and N. Write a method (methods) for forming an array A, whose elements are numbers whose sum
 * of digits is equal to K and which are not greater than N.
 */
public class HomeTask12 {

    public static void main (String[]args) {

        int numberK = abs(enterParameterFromConsoleInt(" Введите число numberK = "));

        int numberN = abs(enterParameterFromConsoleInt(" Введите число numberN = "));

        List<Integer> numbers = fillArray(numberK, numberN);
        printArray(numbers);
    }

    private static List<Integer> fillArray(int numberK, int numberN) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= numberN; i++) {
            if (isSumDigitsOfNumber(i, numberK)) {
                numbers.add(i);
            }
        }
        return numbers;
    }

    private static boolean isSumDigitsOfNumber(int number, int value) {
        int sumDigitsNumber = 0;
        while (number != 0) {
            sumDigitsNumber = sumDigitsNumber + number % 10;
            number = number / 10;
        }
        return sumDigitsNumber == value;
    }

    private static void printArray(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            System.out.println(" Создать массив невозможно. На заданном диапазоне не существует чисел удовлетворяющих вводимым данным!");
        } else {
            System.out.println(" Массив из элементов согласно условию задачи:");
            System.out.println("----------------------------------------");
            System.out.println(" " + numbers.toString());
            System.out.println("----------------------------------------");
        }
    }
}
