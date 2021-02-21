package com.androsor.multiarray;

import static com.androsor.multiarray.ArrayCreator.fillArrayRandom;
import static com.androsor.multiarray.IOUtils.printArrayInt;
import static com.androsor.multiarray.IOUtils.enterParameterFromConsole;
import static java.lang.Math.abs;

/**
 * A matrix is given. Display all odd columns with the first item greater than the last.
 */
public class HomeTask1{

    public static void main(String[] args) {

        System.out.print(" Введите разрядность массива length = ");
        int length = abs(enterParameterFromConsole());
        
        System.out.println(" Исходный массив");
        int [][] numbers = fillArrayRandom(length);
        printArrayInt(numbers);

        printOddColumns(numbers);
    }

    private static void printOddColumns(int[][] numbers) {
        int count = 0; // счетчик для количества столбцов
        for (int j = 0; j < numbers[0].length; j += 2) {
            if (numbers[0][j] > numbers[numbers.length - 1][j]) {
                count ++;
                System.out.println(j + 1 +"-ый нечетный столбец у которого первый элемент больше последнего");
                for (int i = 0; i < numbers.length; i++) {
                    System.out.println(numbers[i][j]);
                }
            }
        }
        if (count == 0) {
            System.out.println(" Столбцов удовлетворяющих условию нет");
        }
    }
}
