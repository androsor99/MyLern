package com.androsor.decomp;

import java.util.Arrays;
import java.util.Random;

import static com.androsor.decomp.Data.inputDataInt;
import static java.lang.Math.abs;

/**
 * An array D is given. Determine the following sums: D [l] + D [2] + D [3]; D [3] + D [4] + D [5]; D [4] + D [5] + D [6].
 * Explanation. Create a method (s) for calculating the sum of three consecutive array elements with numbers from k to m.
 */
public class HomeTask8 {

    public static void main (String[] args) {

        int length = getArrayLength(abs(inputDataInt(" Введите длинну массива: ")));

        System.out.println(" Исходный массив: ");
        int[] numbers = fillArray(length);
        printArray(numbers);

        int indexFrom = getIndexFrom(abs(inputDataInt(" Вычисление суммы от элемента массива №: ")), length);

        int indexTo = getIndexTo(abs(inputDataInt(" Вычисление суммы до элемента массива №: ")), indexFrom, length );

        System.out.printf(" Сумма каждых трех соседних элементов массива в пределах диапазона от %d до %d = %d ", indexFrom, indexTo, getSum(numbers, indexFrom, indexTo));
    }

    private static int getArrayLength(int length) {
        while (length < 3) {
            System.out.println(" Длина массива должна быть ровна 3 и более. Повторите ввод");
            length = abs(inputDataInt(" Введите длинну массива: "));
        }
        return length;
    }

    public static int[] fillArray(int length) {
        int[] numbers = new int[length];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }
        return numbers;
    }

    private static void printArray(int[] numbers) {
        System.out.println("----------------------------------------");
        System.out.println(" " + Arrays.toString(numbers));
        System.out.println("----------------------------------------");
    }

    private static int getIndexFrom(int indexFrom, int length) {
        while ((indexFrom > length - 2) || (indexFrom == 0)) {
            System.out.println(" Начальное положение должно быть а пределах заданного массива длиной " + length + ". Повторите ввод");
            indexFrom = abs(inputDataInt(" Вычисление суммы от элемента массива №: "));
        }
        return indexFrom;
    }

    private static int getIndexTo(int indexTo, int indexFrom, int length) {
        while ((indexTo > length) || ((indexTo) - indexFrom) < 2) {
            System.out.println(" В интервале значений начальной и конечных точек должен находится хотя бы один элемент массива " +
                    "и конечная точка не должна выходить за пределы массива. Повторите ввод");
            indexTo = abs(inputDataInt(" Вычисление суммы от элемента массива №: "));
        }
        return indexTo;
    }

    public static int getSum(int [] numbers, int indexFrom, int indexTo) {
        int sum = 0;
        for (int i = indexFrom; i < indexTo - 1; i++) {
            int sumCurrent = numbers[i -1] + numbers[i] + numbers[i + 1];
            sum += sumCurrent;
        }
        return sum;
    }
}
