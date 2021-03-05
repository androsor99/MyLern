package com.androsor.multiarray;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.abs;

/**
 * Entering parameters and printing an array
 */
public class IOUtils {

    public static int[][] copyArrayInt(int[][] numbers) {
        return Arrays.stream(numbers).map(int[]::clone).toArray(int[][]::new);
    }

    public static int enterEvenParameterFromConsole() {
        int parameter = abs(enterParameterFromConsole());
        if (parameter % 2 != 0) {
            System.out.println(" Значение разрядности должно быть четным по условию. Повторите ввод:");
            return enterEvenParameterFromConsole();
        }
        return parameter;
    }

    public static int enterParameterFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int checkInputRowAndColumnFromConsole(int length) {
        int parameter = abs(enterParameterFromConsole());
        if ((parameter == 0) || (parameter > length)) {
            System.out.println(" Значение выводимой строки/столбца не должно ровняться нулю и превышать разрядность матрицы. Повторите ввод:");
            return checkInputRowAndColumnFromConsole(length);
        }
        return parameter;
    }

    public static void printArrayInt(int[][] numbers) {
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("%7d", numbers[i][j]);
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------");
    }

    public static void printArrayDouble(double[][] numbers) {
        System.out.println("----------------------------------------------");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("%9.3f", numbers[i][j]);
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------");
    }
}
