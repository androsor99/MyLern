package com.androsor.decomp;

/**
 *Find all natural n-digit numbers whose digits form a strictly increasing sequence (for example, 1234, 5789).
 *  To solve the problem, use decomposition.
 */
public class HomeTask15 {

    public static void main(String[] args) {

        printAllNumber();
    }

    private static void printAllNumber() {
        for (int i = 2; i <= 9; i++) {
            printNumberWithLength(i);
        }
    }

    private static void printNumberWithLength(int length) {
        int[] numbers = new int[length];
        numbers[0] = 1;
        while (numbers[length - 1] < 9) {
            for (int i = 1; i < length; i++) {
                numbers[i] = numbers[0] + i;
            }
            printElementArray(numbers);
            numbers[0]++;
        }
        System.out.println("\b\b;");
    }

    private static void printElementArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number);
        }
        System.out.print(", ");
    }
}
