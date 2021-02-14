package com.androsor.multiarray;

import static com.androsor.multiarray.ArrayCreator.*;
import static com.androsor.multiarray.ArrayPrinter.*;

/**
 * A matrix is given. Display all odd columns with the first item greater than the last.
 */
public class HomeTask1{

    public static void main (String[] args) {

        int arrayWidth; // разрядность массива.

        System.out.print(" Введите разрядность массива arrayWidth = ");
        arrayWidth = inputParameterArray();
        
        System.out.println(" Исходный массив");
        int [][] myArray = fillArray(arrayWidth);
        printArrayInt(myArray);

        printOddColumns(arrayWidth, myArray);
    }

    private static void printOddColumns(int arrayWidth, int[][] myArray) {
        int count = 0; // счетчик для количества столбцов
        for (int i = 0; i < myArray.length; i += 2) {
            if (myArray[0][i] > myArray[arrayWidth - 1][i]) {
                count ++;
                System.out.println(i + 1 +"-ый нечетный столбец у которого первый элемент больше последнего");
                for (int j = 0; j < myArray.length; j++) {
                    System.out.println(myArray[j][i]);
                }
            }
        }
        if (count == 0) {
            System.out.println(" Столбцов удовлетворяющих условию нет");
        }
    }
}
