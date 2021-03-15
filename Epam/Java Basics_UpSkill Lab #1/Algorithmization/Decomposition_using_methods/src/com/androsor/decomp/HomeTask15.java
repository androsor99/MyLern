package com.androsor.decomp;

import java.util.ArrayList;
import java.util.List;

import static com.androsor.decomp.IOUtils.enterParameterFromConsoleInt;

/**
 *Find all natural n-digit numbers whose digits form a strictly increasing sequence (for example, 1234, 5789).
 *  To solve the problem, use decomposition.
 */
public class HomeTask15 {

    public static void main(String[] args) {

        int length = enterParameterFromConsoleInt("Введите разрядность числа:\n");
        try {
            List<Integer> numbers = getNumbers(length);
            System.out.println(numbers.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static List<Integer> getNumbers(int length ) {
        List<Integer> numbers = new ArrayList<>();
        int[] initialDigitsNumber = getDigitsNumber(length, true);
        int[] finalDigitsNumber = getDigitsNumber(length, false);
        int initialNumber = getNumber(initialDigitsNumber);
        int finalNumber = getNumber(finalDigitsNumber);
        numbers.add(initialNumber);
        while (initialNumber <= finalNumber) {
            initialNumber++;
            if (isAscendingOrder(initialNumber)) {
                numbers.add(initialNumber);
            }
        }
        return numbers;
    }

    private static int[] getDigitsNumber(int length, boolean selector) {
        if ((length <= 9) && (length >= 1)) {
            int[] digits = new int[length];
            for (int i = 0; i < length; i++) {
                digits[i] = selector ? 1 + i : 10 - length + i;
            }
            return digits;
        } else {
            throw new IllegalArgumentException("Перебор");
        }
    }

    private static int getNumber(int[] digits) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int number : digits) {
            stringBuilder.append(number);
        }
        return Integer.parseInt(stringBuilder.toString());
    }

    private static boolean isAscendingOrder(int number) {
        char[] digits = String.valueOf(number).toCharArray();
        for (int i = 1; i < digits.length; i++){
            int digitOne = Integer.parseInt(String.valueOf(digits[i - 1]));
            int digitTwo = Integer.parseInt(String.valueOf(digits[i]));
            if ((digitOne >= digitTwo)) return false;
        }
        return true;
    }
}
