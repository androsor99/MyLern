package com.androsor.multiarray;

import static com.androsor.multiarray.ArrayCreator.fillArrayRandom;
import static com.androsor.multiarray.IOUtils.enterParameterFromConsole;
import static com.androsor.multiarray.IOUtils.checkInputRowAndColumnFromConsole;
import static com.androsor.multiarray.IOUtils.printArrayInt;
import static java.lang.Math.abs;

/**
 * In a numerical matrix, swap two columns of any column, that is, put all the elements of one column in the
 * corresponding positions of the other, and move its elements of the second to the first. Column numbers are entered
 * by the user from the keyboard.
 */
public class HomeTask8 {

    public static void main(String[] args) {

        System.out.print(" Введите разрядность массива length = ");
        int length = abs(enterParameterFromConsole());

        System.out.println(" Исходный массив");
        int[][] numbers = fillArrayRandom(length);
        printArrayInt(numbers);

        System.out.println(" Введите номера заменямых столбцов");
        System.out.print(" Номер первого столбца = ");
        int columnFrom = checkInputRowAndColumnFromConsole(length);
        System.out.print(" Номер второго столбца = ");
        int columnTo = checkInputRowAndColumnFromConsole(length);

        System.out.println(" Матрица с измененными столбцами:");
        printArrayInt(swapColumns(columnFrom, columnTo, numbers));
    }

    private static int[][] swapColumns(int columnFrom, int columnTo, int[][] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j ++) {
                int temp = numbers[i][columnFrom - 1];
                numbers[i][columnFrom - 1] = numbers[i][columnTo - 1];
                numbers[i][columnTo - 1] = temp;
            }
        }
        return numbers;
    }
}
