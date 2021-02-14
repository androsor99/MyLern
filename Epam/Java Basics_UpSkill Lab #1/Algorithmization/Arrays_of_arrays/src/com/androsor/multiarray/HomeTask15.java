package com.androsor.multiarray;

import java.util.Arrays;

import static com.androsor.multiarray.ArrayCreator.fillArray;
import static com.androsor.multiarray.ArrayCreator.inputParameterArray;
import static com.androsor.multiarray.ArrayPrinter.printArrayInt;

/**
 * Find the largest element of the matrix and replace all odd elements with it.
 */
public class HomeTask15 {

    public static void main(String[] args) {

        int arrayWidth; // разрядность массива.

        System.out.print(" Введите разрядность массива arrayWidth = ");
        arrayWidth = inputParameterArray();

        System.out.println(" Исходный массив");
        int [][] myArray = fillArray(arrayWidth);
        printArrayInt(myArray);

        System.out.println(" Максимальный элемент матрицы " + findMaxElement(myArray).toString());
        int arrayMax = findMaxElement(myArray).getValue();

        System.out.println(" Матрица с замененными нечетными элементами :");
        int[][] copyArray = Arrays.stream(myArray).map(int[]::clone).toArray(int[][]::new);
        printArrayInt(replaceOddElements(copyArray,arrayMax));
    }

    private static ElementMax findMaxElement(int [][] array) {
        int indexMaxI = 0; // Индекс строки максимального элемента.
        int indexMaxJ = 0; // Индекс столбца максимального элемента
        int maxElement = array[0][0]; // Максимальный элемент матрицы.
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length; i++) {
                if (array[i][j] > maxElement) {
                    maxElement = array[i][j];
                    indexMaxI = i;
                    indexMaxJ = j;
                }
            }
        }
        return new ElementMax(indexMaxI, indexMaxJ, maxElement);
    }

    private static int[][] replaceOddElements(int[][] array, int maxElement) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length; i++) {
                if (array[i][j] % 2 != 0) {
                    array[i][j] = maxElement;
                }
            }
        }
        return array;
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
