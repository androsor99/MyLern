package com.androsor.decomp;

import java.util.ArrayList;
import java.util.List;

import static com.androsor.decomp.IOUtils.printList;
import static com.androsor.decomp.IOUtils.enterParameterFromConsoleInt;
import static java.lang.Math.pow;

/**
 * Write a program that determines the sum of n - digit numbers containing only odd digits. Also determine how many
 * even digits are in the found amount. To solve the problem, use decomposition.
 */
public class HomeTask16 {

    public static void main(String [] args) {

        int numberLength = enterParameterFromConsoleInt(" Введите число N = ");

        System.out.printf(" Массив чисел разрядности %d составленных из нечетных цифр:\n", numberLength);
        List<Integer> numbers = getOddDigitsNumbers(numberLength);
        printList(numbers);

        long sumOddDigitsOfNumber = getSumOddDigitsOfNumber(numbers);
        System.out.printf("Сумма %d-значных чисел, содержащих только нечетные цифры: %d", numberLength, sumOddDigitsOfNumber);

        int numberOfDigits = getNumberOfEvenDigits(sumOddDigitsOfNumber);
        System.out.printf("В найденной сумме %d четных цифр", numberOfDigits);
    }

    public static List<Integer> getOddDigitsNumbers(int numberLength) {
       List<Integer> numbers = new ArrayList<>();
        for (int i = getInitialValue(numberLength); i < (int) pow(10, numberLength); i += 2) {
            if (isOddDigitNumber(i)) {
                numbers.add(i);
            }
        }
        return numbers;
    }

    private static int getInitialValue(int numberLength) {
        int initialValue = 1;
        for (int i = 1; i < numberLength; i++) {
            initialValue += (int) pow(10, i);
        }
        return initialValue;
    }

    private static long getSumOddDigitsOfNumber(List<Integer> numbers){
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
       return sum;
    }

    public static int getNumberOfEvenDigits(long number) {
        int count = 0;
        for (char symbol : String.valueOf(number).toCharArray()) {
            int digit = Integer.parseInt(String.valueOf(symbol));
            if (digit % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private static boolean isOddDigitNumber(long number) {
        return getNumberOfEvenDigits(number) == 0;
    }
}
