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

        int arrayWidth = getArrayWidth(abs(inputDataInt(" Введите длинну массива: ")));

        System.out.println(" Исходный массив: ");
        int[] myArray = fillArray(arrayWidth);
        printArray(myArray);

        int indexFrom = getIndexFrom(abs(inputDataInt(" Вычисление суммы от элемента массива №: ")), arrayWidth);

        int indexTo = getIndexTo(abs(inputDataInt(" Вычисление суммы до элемента массива №: ")), indexFrom, arrayWidth );

        System.out.printf(" Сумма каждых трех соседних элементов массива в пределах диапазона от %d до %d = %d ", indexFrom, indexTo, getSum(myArray, indexFrom, indexTo));
    }

    public static int[] fillArray(int arrayWidth) {
        int[] array = new int[arrayWidth];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }

    private static int getArrayWidth(int arrayWidth) {
        while (arrayWidth < 3) {
            System.out.println(" Длина массива должна быть ровна 3 и более. Повторите ввод");
            arrayWidth = abs(inputDataInt(" Введите длинну массива: "));
        }
        return arrayWidth;
    }

    private static int getIndexFrom(int indexFrom, int arrayWidth) {
        while ((indexFrom > arrayWidth - 2) || (indexFrom == 0)) {
            System.out.println(" Начальное положение должно быть а пределах заданного массива длиной " + arrayWidth + ". Повторите ввод");
            indexFrom = abs(inputDataInt(" Вычисление суммы от элемента массива №: "));
        }
        return indexFrom;
    }

    private static int getIndexTo(int indexTo, int indexFrom, int arrayWidth) {
        while ((indexTo > arrayWidth) || ((indexTo) - indexFrom) < 2) {
            System.out.println(" В интервале значений начальной и конечных точек должен находится хотя бы один элемент массива " +
                    "и конечная точка не должна выходить за пределы массива. Повторите ввод");
            indexTo = abs(inputDataInt(" Вычисление суммы от элемента массива №: "));
        }
        return indexTo;
    }

    public static int getSum(int [] array, int indexFrom, int indexTo) {
        int sum = 0;
        for (int i = indexFrom; i < indexTo - 1; i++) {
            int sumCurrent = array[i -1] + array[i] + array[i + 1];
            sum += sumCurrent;
        }
        return sum;
    }

    private static void printArray(int[] array) {
        System.out.println("----------------------------------------");
        System.out.println(" " + Arrays.toString(array));
        System.out.println("----------------------------------------");
    }
}
