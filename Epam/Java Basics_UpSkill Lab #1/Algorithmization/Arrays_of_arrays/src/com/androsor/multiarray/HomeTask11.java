package com.androsor.multiarray;

import java.util.Random;

/**
 * Fill the 10x20 matrix with random numbers from 0 to 15. Display the matrix itself and the row numbers in which the
 * number 5 occurs three or more times.
 */

public class HomeTask11 {

    public static void main (String[] args){

        int [][] myArray;
        myArray = new int[10][20];
        int count; // число встреч цифры 5 в строке матрицы.

        //  Заполняем матрицу 10x20 случайными числами от 0 до 15.
        Random random = new Random ();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                myArray[i][j] = random.nextInt(16);
            }
        }

        // Выводим матрицу.
        System.out.println(" Исходная матрица:");
        System.out.println("----------------------------------------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(myArray[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------------------------");

        // Анализируем число встреч цифры 5 в строках.
        int flag = 0; // вводим временную переменную для определения несовпадения встреч цифры 5.
        for (int i = 0; i < 10; i++) {
            count = 0;
            for (int j = 0; j < 20; j++) {
                if ( myArray[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.println(i + 1 + "-ая строка содержит цифру 5 три и более раз");
            } else {
                    flag++;
            }
        }
        if (flag == 10) {
            System.out.println(" Число 5 встречается реже трех раз во всех строках");
        }
    }
}

