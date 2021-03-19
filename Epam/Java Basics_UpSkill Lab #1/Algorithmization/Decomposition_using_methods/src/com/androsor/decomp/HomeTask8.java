package com.androsor.decomp;

import static com.androsor.decomp.Helper.fillArray;
import static com.androsor.decomp.IOUtils.enterParameterFromConsoleInt;
import static com.androsor.decomp.IOUtils.printArray;

/**
 * An array D is given. Determine the following sums: D [l] + D [2] + D [3]; D [3] + D [4] + D [5]; D [4] + D [5] + D [6].
 * Explanation. Create a method (s) for calculating the sum of three consecutive array elements with numbers from k to m.
 */
public class HomeTask8 {

    private static final String INVALID_INDEX_MESSAGE = """
            В интервале значений начальной и конечных точек заданного массива длиной = %d 
            должен находится хотя бы один элемент и конечная точка не должна выходить за пределы массива. Повторите ввод.
            """;
    private static final String INVALID_LENGTH_MESSAGE = "Длина массива должна быть ровна 3 и более. Повторите ввод";

    public static void main(String[] args) {

        int length = getArrayLength();

        System.out.println(" Исходный массив: ");
        int[] numbers = fillArray(length);
        printArray(numbers);

        int indexFrom = getIndexFrom(length);
        int indexTo = getIndexTo(indexFrom, length);

        int sum = getSum(numbers, indexFrom, indexTo);
        System.out.printf("Сумма каждых трех соседних элементов массива в пределах диапазона от %d до %d = %d ", indexFrom, indexTo, sum);
    }

    private static int getArrayLength() {
        int length = enterParameterFromConsoleInt("Введите длинну массива: ");
        if (isValidityLength(length)) {
            System.out.println(INVALID_LENGTH_MESSAGE);
            return getArrayLength();
        }
        return length;
    }

    private static boolean isValidityLength(int length) {
        return (length < 3);
    }

    private static int getIndexFrom(int length) {
        int indexFrom = enterParameterFromConsoleInt("Вычисление суммы от элемента массива №: ");
        if (isValidityIndexFrom(indexFrom, length)) {
            System.out.printf(INVALID_INDEX_MESSAGE, length);
            return getIndexFrom(length);
        }
        return indexFrom;
    }

    private static boolean isValidityIndexFrom(int indexFrom, int length) {
        return (indexFrom >= length - 1) || (indexFrom <= 0);
    }

    private static int getIndexTo(int indexFrom, int length) {
        int indexTo = enterParameterFromConsoleInt("Вычисление суммы до элемента массива №: ");
        if (isValidityIndexTo(indexFrom, indexTo, length)) {
            System.out.printf(INVALID_INDEX_MESSAGE, length);
            return getIndexTo(indexFrom, length);
        }
        return indexTo;
    }

    private static boolean isValidityIndexTo(int indexFrom, int indexTo, int length) {
        return ((indexTo > length) || (indexTo - indexFrom) < 2);
    }

    public static int getSum(int[] numbers, int indexFrom, int indexTo) {
        int sum = 0;
        for (int i = indexFrom; i < indexTo - 1; i++) {
            int currentSum = numbers[i - 1] + numbers[i] + numbers[i + 1];
            sum += currentSum;
        }
        return sum;
    }
}
