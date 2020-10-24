package com.androsor.decomp;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * An array D is given. Determine the following sums: D [l] + D [2] + D [3]; D [3] + D [4] + D [5]; D [4] + D [5] + D [6].
 * Explanation. Create a method (s) for calculating the sum of three consecutive array elements with numbers from k to m.
 */

public class HomeTask8 {

    public static void main (String[] args) {
        int n;
        int k;
        int m;

        Scanner sc = new Scanner(System.in);

        System.out.print(" Введите длинну массива: ");
        n = sc.nextInt();
        System.out.print(" Вычисление суммы от элемента массива №: ");
        k = sc.nextInt();
        System.out.print(" Вычисление суммы до элемента массива №: ");
        m = sc.nextInt();
        while (m > n) {
            System.out.println(" Конечное положение должно быть а пределах заданного массива. Повторите ввод");
            System.out.print("Вычисление суммы до: ");
            m = sc.nextInt();
        }
        while ((m - k) <= 1) {
            System.out.println(" В интервале значений начальной и конечных точек должен находится хотя бы один элемент массива. Повторите ввод");
            System.out.print("Вычисление суммы от элемента массива №: ");
            k = sc.nextInt();
            System.out.print("Вычисление суммы до элемента массива №: ");
            m = sc.nextInt();
        }
        int[] myArray = new int[n];
        enterArray(myArray);
        System.out.println(" Исходный массив: ");
        System.out.println(" " + Arrays.toString(myArray));
        sum(myArray, k, m);
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

