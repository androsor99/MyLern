package com.androsor.decomp;

import static com.androsor.decomp.IOUtils.enterParameterFromConsoleInt;

/**
 * Write a method (s) for calculating the sum of the factorials of all odd numbers from 1 to 9.
 */
public class HomeTask7 {

    public static void main(String[] args) {

        int number = enterParameterFromConsoleInt(" Введите значение числа для которого нужно посчитать сумму фактариалов всех нечетных чисел в промежутке от 1 до N = ");

        long sumFactorials = getSumFactorials(number);
        System.out.print("Сумма факториалов всех нечетных чисел от 1 до " + number + " равен = " + sumFactorials);
    }

    private static long getSumFactorials(int number) { // Метод нахождения суммы факториалов.
        long sum = 0;
        for (int i = 1; i <= number; i += 2) {
            sum += getFactorial(i);
        }
        return sum;
    }

    private static long getFactorial(int value) { // Метод нахождения факториала.
        long factorial = 1;
        for (int i = 1; i <= value; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
