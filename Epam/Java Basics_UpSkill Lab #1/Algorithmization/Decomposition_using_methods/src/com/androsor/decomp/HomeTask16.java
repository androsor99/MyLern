package com.androsor.decomp;

import static com.androsor.decomp.IOUtils.printArray;
import static com.androsor.decomp.IOUtils.enterParameterFromConsoleInt;
import static java.lang.Math.pow;

/**
 * Write a program that determines the sum of n - digit numbers containing only odd digits. Also determine how many
 * even digits are in the found amount. To solve the problem, use decomposition.
 */
public class HomeTask16 {

    public static void main(String [] args) {

        int number = enterParameterFromConsoleInt(" Введите число N = ");

        System.out.printf(" Массив чисел разрядности %d составленных из нечетных цифр:\n", number);
        int[] numbers = fillArray(number);
        printArray(numbers);

        long sumOddDigitsOfNumber = getSumOddDigitsOfNumber(numbers);
        System.out.printf("Сумма %d-значных чисел, содержащих только нечетные цифры: %d %n", number, sumOddDigitsOfNumber);

        int numberOfDigits = getNumberOfDigits(sumOddDigitsOfNumber);
        System.out.printf("В найденной сумме %d четных цифр", numberOfDigits);
    }

    public static int[] fillArray(int number) {
        int length = (int) pow(5, number);
        int[] numbers = new int[length];
        int i = 0;
        for (int j = getInitialValue(number); j < (int) pow(10, number); j += 2) {
            if (isNumberOdd(j)) {
                numbers[i] = j;
                i++;
            }
        }
        return numbers;
    }

    private static int getInitialValue(int number){
        int initialValue = 1;
        for (int i = 1; i < number; i++) {
            initialValue += (int) pow(10, i);
        }
        return initialValue;
    }

    private static long getSumOddDigitsOfNumber(int[] numbers){
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
       return sum;
    }

    public static int getNumberOfDigits(long number) {
        int count = 0;
        for (char symbol : String.valueOf(number).toCharArray()) {
            int digit = Integer.parseInt(String.valueOf(symbol));
            if (digit % 2 == 0 && digit != 0) {
                count++;
            }
        }
        return count;
    }

    private static boolean isNumberOdd(long number) {
        for (char symbol : String.valueOf(number).toCharArray()) {
            int digit = Integer.parseInt(String.valueOf(symbol));
            if (digit % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
