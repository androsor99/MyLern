package com.androsor.decomp;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static com.androsor.decomp.Data.*;
import static java.lang.Math.*;

/**
 * An array D is given. Determine the following sums: D [l] + D [2] + D [3]; D [3] + D [4] + D [5]; D [4] + D [5] + D [6].
 * Explanation. Create a method (s) for calculating the sum of three consecutive array elements with numbers from k to m.
 */
public class HomeTask8 {

    public static void main (String[] args) {


        int arrayWidth = getArrayWidth(abs(inputDataInt(" Введите длинну массива: ")));

        int indexFrom = getIndexFrom(abs(inputDataInt(" Вычисление суммы от элемента массива №: ")), arrayWidth);

        int indexTo = abs(inputDataInt(" Вычисление суммы до элемента массива №: "));

        while (indexTo > arrayWidth) {
            System.out.println(" Конечное положение должно быть а пределах заданного массива длиной " + arrayWidth + ". Повторите ввод");
            System.out.print("Вычисление суммы до: ");
            //indexTo = sc.nextInt();
        }


        while ((indexTo - indexFrom) <= 1) {
            System.out.println(" В интервале значений начальной и конечных точек должен находится хотя бы один элемент массива. Повторите ввод");
            System.out.print("Вычисление суммы от элемента массива №: ");
            //indexFrom = sc.nextInt();
            System.out.print("Вычисление суммы до элемента массива №: ");
            //indexTo = sc.nextInt();
        }
        int[] myArray = new int[arrayWidth];
        enterArray(myArray);
        System.out.println(" Исходный массив: ");
        System.out.println(" " + Arrays.toString(myArray));
        sum(myArray, indexFrom, indexTo);
    }

    private static int getArrayWidth(int arrayWidth) {
        while (arrayWidth < 3) {
            System.out.println(" Длина массива должна быть ровна 3 и более. Повторите ввод");
            arrayWidth = abs(inputDataInt(" Введите длинну массива: "));
        }
        return arrayWidth;
    }


    private static int getIndexFrom(int index, int arrayWidth) {
        while ((index >= arrayWidth - 1) || (index == 0)) {
            System.out.println(" Начальное положение должно быть а пределах заданного массива длиной " + arrayWidth + ". Повторите ввод");
            index = abs(inputDataInt(" Вычисление суммы от элемента массива №: "));
        }
        return index;
    }

    // Метод заполнения массива .
    public static void enterArray (int[] myArray) {
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(10);
        }
    }
    // Метод нахождения суммы трех соседних элементов
    public static void sum (int [] array, int k, int m) {
        System.out.printf(" Сумма каждых трех соседних элементов массива в пределах диапазона от %d до %d : ", k, m);
        for (int i = k; i < m -1; i++) {
            int sum;
            sum = array[i - 1] + array[i] + array[i + 1];
            System.out.print(sum + ", ");
        }
    }
}

