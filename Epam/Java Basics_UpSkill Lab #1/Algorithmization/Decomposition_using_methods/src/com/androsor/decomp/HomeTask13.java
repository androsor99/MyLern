package com.androsor.decomp;

import static com.androsor.decomp.Data.inputDataInt;
import static java.lang.Math.abs;

/**
 * Two primes are called "twins" if they differ from each other by 2 (for example, 41 and 43). Find and print all pairs
 * of "twins" from the segment [n, 2n], where n is a given natural number greater than 2.
 * Use decomposition to solve the problem.
 */
public class HomeTask13 {

    public static void main(String[] args) {


        int number = getNumber(abs(inputDataInt(" Введите число N = ")));

        printTwins(number);
    }

    private static int getNumber(int number) {
        while (number <= 2) {
            System.out.println(" Начало диапазона вычислений должно быть больше 2 по условию задачи");
            number = abs(inputDataInt(" Введите число N = "));
        }
        return number;
    }

    private static boolean isPrime(int value) { // метод для проверки на простоту.
        for (int j = 2; j < Math.sqrt(value) + 1; j++) {
            if (value % j == 0) {
                return false;
            }
        }
        return true;
    }

    private static void printTwins(int number) {
        System.out.printf(" На отрезке от %d до %d существуют следующие пары: \n", number, 2 * number);
        for (int i = number; i < (number * 2) - 2; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.printf(" Пара \"чисел-близнецов\": %d %d  \n", i, (i + 2));
            }
        }
    }
}
