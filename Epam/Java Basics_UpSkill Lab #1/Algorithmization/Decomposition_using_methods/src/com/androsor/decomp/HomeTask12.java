package com.androsor.decomp;

import java.util.Random;

/**
 * Given natural numbers K and N. Write a method (methods) for forming an array A, whose elements are numbers whose sum
 * of digits is equal to K and which are not greater than N.
 */
public class HomeTask12 {

    public static void main (String[]args) {

        int k = HomeTask1.dataInput(" Введите число k = ");
        while (k < 0) {
            System.out.println(" Число должно быть больше нуля.");
            k = HomeTask1.dataInput(" Введите число k = ");
        }
        int n = HomeTask1.dataInput(" Введите число n = ");
        while (n <= k) {
            System.out.println(" Число должно быть больше нуля и больше числа k");
            n = HomeTask1.dataInput(" Введите число k = ");
        }
        int b = HomeTask1.dataInput(" Введите длину желаемого массива b = ");
        while (b < 0) {
            System.out.println(" Число должно быть больше нуля.");
            b = HomeTask1.dataInput(" Введите длину желаемого массива b = ");
        }

        System.out.println(" Массив из элементов согласно условию задачи:");

        arrayRandom(k,n,b);
    }
    // Метод создания и заполнения массива из цифр числа.
    public static int [] myArray(int number) {
        int temp = number;
        int count = 0;

        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        int[] myArray = new int[count];

        for (int j = count - 1 ; number > 0; j--) {
            myArray[j] = number % 10;
            number = number / 10;
        }
        return myArray;
    }

    // Метод нахождения суммы элементов массива.
    public  static int sumMyArray (int [] myArray){

        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        return sum;
    }
    // Метод заполнения массива элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
    public static void arrayRandom (int k, int n, int b) {

        int [] arrayRandom = new int[b];
        int count = 0;

        Random random = new Random();

        while (count < arrayRandom.length){

            int number = random.nextInt(100000);
            int number1 = sumMyArray(myArray(number));

            if(number1 == k & number < n){

                arrayRandom[count] = number;
                count++;
            }
        }

        for (int i = 0; i < arrayRandom.length; i++){

            System.out.print(arrayRandom[i] + " ");
        }
    }
}

