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

        int number = enterParameterFromConsoleInt(" Введите число N = ");

        System.out.printf(" Массив чисел разрядности %d составленных из нечетных цифр:\n", number);
        List<Integer> numbers = getOddDigitsNumbers(number);
        printList(numbers);

        long sumOddDigitsOfNumber = getSumOddDigitsOfNumber(numbers);
        System.out.printf("Сумма %d-значных чисел, содержащих только нечетные цифры: %d %n", number, sumOddDigitsOfNumber);

        int numberOfDigits = getNumberOfDigits(sumOddDigitsOfNumber);
        System.out.printf("В найденной сумме %d четных цифр", numberOfDigits);
    }

    public static List<Integer> getOddDigitsNumbers(int number) {
       List<Integer> numbers = new ArrayList<>();
        for (int i = getInitialValue(number); i < (int) pow(10, number); i += 2) {
            if (isNumberOdd(i)) {
                numbers.add(i);
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

    private static long getSumOddDigitsOfNumber(List<Integer> numbers){
        int sum = 0;
        for (Integer number : numbers) {
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
