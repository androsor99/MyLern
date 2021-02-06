package com.androsor.decomp;

/**
 * Write a program that determines the sum of n - digit numbers containing only odd digits. Also determine how many
 * even digits are in the found amount. To solve the problem, use decomposition.
 */

public class HomeTask17 {

    public static void main(String [] args) {

        int n = HomeTask1.dataInput(" Введите число N = ");
        while (n < 0) {
            System.out.println(" Число должно быть положительным!");
            n = HomeTask1.dataInput(" Введите число N = ");
        }

        System.out.printf(" Количество действий над числом (согласно йсловию задачи) = %d ", subtraction(n));
    }


    // Метод нахождения суммы цифр числа.
    public static int sumArray (int [] myArray) {

        int sum = 0;

        for (int i = 0; i < myArray.length; i++){
                sum = sum + myArray[i];
        }
        return sum;
    }

    // Метод нахождения количества дейсвий (Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. ) .
    public static int subtraction (int number){

        int total = number;
        int count = 0;

        while (total>0) {
            total = total - sumArray(HomeTask16.arrayDigitCapacity(total));
            count++;
        }
        return count;
    }
}
