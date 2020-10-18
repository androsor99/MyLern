package com.androsor.cycle;

/**
 * Write a program where the user enters any positive integer. And the program adds up all numbers from 1 to the number entered by the user.
 */
public class HomeTask1 {

    public static void main(String[] args) {
        int n = 400;
        long sum = 0;

        for (int i=1; i<=n; i++) {
            sum += i;
        }

        System.out.println(" Сумма от 1 до введенного числа = " + sum);
    }
}
