package com.androsor.cycle;

/**
 * Find the sum of the squares of the first hundred numbers.
 */
public class HomeTask3 {

    public static void main(String[] args) {
        long sum = 0;

        for (int i=1; i<=100; i++) {
            sum += i*i;
        }

        System.out.println(" Сумма квадратов чисел от 1 до 100 = " + sum);
    }
}
