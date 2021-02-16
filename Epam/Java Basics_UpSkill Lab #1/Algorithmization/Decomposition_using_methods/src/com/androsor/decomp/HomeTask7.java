package com.androsor.decomp;

import static com.androsor.decomp.Data.inputDataInt;
import static java.lang.Math.abs;

/**
 * Write a method (s) for calculating the sum of the factorials of all odd numbers from 1 to 9.
 */
public class HomeTask7 {

    public static void main(String[] args) {

        int number = abs(inputDataInt(" Введите значение числа для которого нужно посчитать сумму фактариалов всех нечетных чисел в промежутке от 1 до N = "));

        printSumFactorials(number);
    }

    private static long getFactorial(int value) { // Метод нахождения факториала.
        long factorial = 1;
        for (int i = 1; i <= value; i++) {
            factorial *= i;
        }
        return factorial;
    }

    private static long getSumFactorials(int number) { // Метод нахождения суммы факториалов.
        long sum = 0;
        for (int i = 1; i <= number; i += 2) {
            sum += getFactorial(i);
        }
        return sum;
    }

    private static void printSumFactorials(int number) {
        System.out.println(" Сумма факториалов всех нечетных чисел от 1 до " + number + " равен = " + getSumFactorials(number));
    }
}
