package com.androsor.multiarray;

import static com.androsor.multiarray.ArrayCreator.inputParameterArray;
import static com.androsor.multiarray.ArrayCreator.fillArray;
import static com.androsor.multiarray.ArrayPrinter.printArrayInt;
import static java.lang.Math.abs;

/**
 * A matrix is given. Display all odd columns with the first item greater than the last.
 */
public class HomeTask1{

    public static void main(String[] args) {

        System.out.print(" Введите разрядность массива length = ");
        int length = abs(inputParameterArray());
        
        System.out.println(" Исходный массив");
        int [][] numbers = fillArray(length);
        printArrayInt(numbers);

        printOddColumns(length, numbers);
    }

    private static void printOddColumns(int length, int[][] numbers) {
        int count = 0; // счетчик для количества столбцов
        for (int i = 0; i < numbers.length; i += 2) {
            if (numbers[0][i] > numbers[length - 1][i]) {
                count ++;
                System.out.println(i + 1 +"-ый нечетный столбец у которого первый элемент больше последнего");
                for (int[] number : numbers) {
                    System.out.println(number[i]);
                }
            }
        }
        if (count == 0) {
            System.out.println(" Столбцов удовлетворяющих условию нет");
        }
    }
}
