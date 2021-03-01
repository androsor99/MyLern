package com.androsor.multiarray;

import java.util.Arrays;

import static com.androsor.multiarray.ArrayCreator.fillArrayRandom;
import static com.androsor.multiarray.IOUtils.*;
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

        System.out.println(findMaxElement(numbers).toString());
        int maxElementArray = findMaxElement(numbers).getValue();

        System.out.println(" Матрица с замененными нечетными элементами :");
        printArrayInt(replaceOddElements(numbers,maxElementArray));
    }

    private static ElementMax findMaxElement(int[][] numbers) {
        int positionI = 0; // Индекс строки максимального элемента.
        int positionJ = 0; // Индекс столбца максимального элемента
        int max = numbers[0][0]; // Максимальный элемент матрицы.
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] > max) {
                    max = numbers[i][j];
                    positionI = i + 1;
                    positionJ = j + 1;
                }
            }
        }
        int[] position = new int[] {positionI, positionJ};
        return new ElementMax(position, max);
    }

    private static int[][] replaceOddElements(int[][] numbers, int maxElement) {
        int[][] copiedArray = copyArrayInt(numbers);
        for (int i = 0; i < copiedArray.length; i++) {
            for (int j = 0; j < copiedArray[i].length; j++) {
                if (copiedArray[i][j] % 2 != 0) {
                    copiedArray[i][j] = maxElement;
                }
            }
        }
        return copiedArray;
    }

    private static class ElementMax {

        private final int[] position;
        private final int value;

        public ElementMax(int[] position, int value) {
            this.position = position;
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        @Override
        public String toString() {
            return  String.format(" Максимальный элемент матрицы на позиции %s = %d",Arrays.toString(position), value);
        }
    }
}
