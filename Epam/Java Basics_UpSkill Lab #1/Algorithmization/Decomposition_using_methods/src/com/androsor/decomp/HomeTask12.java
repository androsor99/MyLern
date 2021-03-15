package com.androsor.decomp;

import java.util.ArrayList;
import java.util.List;

import static com.androsor.decomp.IOUtils.printList;
import static com.androsor.decomp.IOUtils.enterParameterFromConsoleInt;

/**
 * Given natural numbers K and N. Write a method (methods) for forming an array A, whose elements are numbers whose sum
 * of digits is equal to K and which are not greater than N.
 */
public class HomeTask12 {

    public static void main (String[]args) {

        int numberK = enterParameterFromConsoleInt(" Введите число numberK = ");

        int numberN = enterParameterFromConsoleInt(" Введите число numberN = ");

        List<Integer> numbers = getNumbers(numberK, numberN);
        printNumbers(numbers);
    }

    private static List<Integer> getNumbers(int numberK, int numberN) {
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

    private static void printNumbers(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            System.out.println(" Создать массив невозможно. На заданном диапазоне не существует чисел удовлетворяющих вводимым данным!");
        } else {
            System.out.println(" Массив из элементов согласно условию задачи:");
            printList(numbers);
        }
    }
}
