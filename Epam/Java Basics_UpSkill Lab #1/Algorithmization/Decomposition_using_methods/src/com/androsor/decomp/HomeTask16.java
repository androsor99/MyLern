package com.androsor.decomp;

import java.util.Arrays;

import static com.androsor.decomp.IOUtils.enterParameterFromConsoleInt;
import static java.lang.Math.abs;
import static java.lang.Math.pow;

/**
 * Write a program that determines the sum of n - digit numbers containing only odd digits. Also determine how many
 * even digits are in the found amount. To solve the problem, use decomposition.
 */
public class HomeTask16 {

    public static void main(String [] args) {


        int number = abs(enterParameterFromConsoleInt(" Введите число N = "));

        System.out.printf(" Массив чисел разрядности %d составленных из нечетных цифр:\n", number);
        int[] numbers = fillArray(number);
        printArray(numbers);

        long sumOddDigitsOfNumber = getSumOddDigitsOfNumber(numbers);
        System.out.printf("Сумма %d-значных чисел, содержащих только нечетные цифры: %d %n", number, sumOddDigitsOfNumber);

        System.out.printf("В найденной сумме %d четных цифр", getNumberOfEvenDigits(sumOddDigitsOfNumber));
    }

    public static int[] fillArray(int number) {
        int length = (int) pow(5, number);
        int[] numbers = new int[length];
        int i = 0;
            for (int j = getInitialValue(number); j < (int) pow(10, number); j++) {
                if (getNumberOfOddDigits(j) == number) {
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

    private static void printArray(int[] numbers) {
        System.out.println("----------------------------------------");
        System.out.println(" " + Arrays.toString(numbers));
        System.out.println("----------------------------------------");
    }

    private static long getSumOddDigitsOfNumber(int[] numbers){
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
       return sum;
    }

    public static int getNumberOfOddDigits(long number) {
        int countOdd = 0;
        for (char symbol : String.valueOf(number).toCharArray()){
            int digit = Integer.parseInt(String.valueOf(symbol));
            if (digit % 2 != 0) {
                countOdd++;
            }
        }
        return countOdd;
    }

    public static int getNumberOfEvenDigits(long number) {
        int countEven = 0;
        for (char symbol : String.valueOf(number).toCharArray()){
            int digit = Integer.parseInt(String.valueOf(symbol));
            if (digit % 2 == 0 && digit != 0) {
                countEven++;
            }
        }
        return countEven;
    }
}
