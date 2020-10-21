package com.androsor.multiarray;

import java.util.Scanner;
import java.util.Random;

/**
 * A matrix is given. Display all odd columns with the first item greater than the last.
 */

public class HomeTask1{

    public static void main (String[] args) {

        int [][] myArray; // объявляем массив.
        int n; // разрядность массива.
        int count = 0; // счетчик для количества столбцов.

        Scanner sc = new Scanner(System.in);
        System.out.print(" Введите разрядность массива n = ");
        n = sc.nextInt();

        // заполняем рандомно массив.
        myArray = new int[n][n];
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[0].length; j++) {
                myArray[i][j] = random.nextInt(40);
            }
        }

        // выводим массив.
        System.out.println(" Исходный массив");
        System.out.println("________________________________________________");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[0].length; j++) {
                System.out.print(myArray[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("________________________________________________");

        for (int i = 0; i < n; i += 2) {
            if (myArray[0][i] > myArray[n - 1][i]) {
                count ++;
                System.out.println( + i + 1 +"-ый нечетный столбец у которого первый элемент больше последнего");
                for (int j = 0; j < n; j++) {
                    System.out.println(myArray[j][i]);
                }
            }
        }
        if (count == 0) {
            System.out.println(" Столбцов удовлетворяющих условию нет");
        }
    }
}