package com.androsor.multiarray;

import java.util.Arrays;

import static com.androsor.multiarray.ArrayCreator.fillArrayRandom;
import static com.androsor.multiarray.IOUtils.enterParameterFromConsole;
import static com.androsor.multiarray.IOUtils.printArrayInt;
import static java.lang.Math.abs;

/**
 * Find the largest element of the matrix and replace all odd elements with it.
 */
public class HomeTask15 {

    public static void main(String[] args) {

        System.out.print(" Введите разрядность массива length = ");
        int length = abs(enterParameterFromConsole());

        System.out.println(" Исходный массив");
        int[][] numbers = fillArrayRandom(length);
        printArrayInt(numbers);

        System.out.println(" Максимальный элемент матрицы " + findMaxElement(numbers).toString());
        int maxElementArray = findMaxElement(numbers).getValue();

        System.out.println(" Матрица с замененными нечетными элементами :");
        printArrayInt(replaceOddElements(numbers,maxElementArray));
    }

    private static ElementMax findMaxElement(int[][] numbers) {
        int indexMaxI = 0; // Индекс строки максимального элемента.
        int indexMaxJ = 0; // Индекс столбца максимального элемента
        int max = numbers[0][0]; // Максимальный элемент матрицы.
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                if (numbers[i][j] > max) {
                    max = numbers[i][j];
                    indexMaxI = i + 1;
                    indexMaxJ = j + 1;
                }
            }
        }
        return new ElementMax(indexMaxI, indexMaxJ, max);
    }

    private static int[][] replaceOddElements(int[][] numbers, int maxElement) {
        int[][] copyArray = Arrays.stream(numbers).map(int[]::clone).toArray(int[][]::new);
        for (int i = 0; i < copyArray.length; i++) {
            for (int j = 0; j < copyArray[0].length; j++) {
                if (copyArray[i][j] % 2 != 0) {
                    copyArray[i][j] = maxElement;
                }
            }
        }
        return copyArray;
    }

    private static class ElementMax {

        private final int indexMaxI; // Индекс строки максимального элемента.
        private final int indexMaxJ ; // Индекс столбца максимального элемента
        private final int value; // Максимальный элемент матрицы.

        public ElementMax(int indexMaxI, int indexMaxJ, int value) {
            this.indexMaxI = indexMaxI;
            this.indexMaxJ = indexMaxJ;
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "[" + indexMaxI + " ; " + indexMaxJ + "] = " + value;
        }
    }
}
