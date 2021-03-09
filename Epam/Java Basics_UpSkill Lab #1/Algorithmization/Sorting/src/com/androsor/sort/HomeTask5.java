package com.androsor.sort;

import static com.androsor.sort.SorterLogic.isReplace;
import static com.androsor.sort.SorterLogic.run;
import static java.util.Arrays.copyOf;

/**
 * Implement Shell sort.
 */
public class HomeTask5 implements Sorting {

    public static void main(String[] args) {

        Sorting sorter = new HomeTask5();
        run(sorter);
    }

    @Override
    public int[] sort(int[] numbers, boolean sortSelection) {
        int[] copiedArray = copyOf(numbers, numbers.length);
        int inner, outer, temp;
        int h = getSortingInterval(copiedArray.length);
        while (h >= 1) {
            for (outer = h; outer < copiedArray.length; outer++) {
                temp = copiedArray[outer];
                inner = outer;
                while (inner > h - 1 && (isReplace(copiedArray[inner - h], temp, sortSelection))) { // Сортируем массив с шагом h.
                    copiedArray[inner] = copiedArray[inner - h];
                    inner -= h;
                }
                copiedArray[inner] = temp;
            }
            h = (h - 1) / 3; //на каждом шаге уменьшаем h
        }
        return copiedArray;
    }

    private static int getSortingInterval(int length) {
        int h = 1; // интервал сортировки
        while (h <= length / 2) { // Ищем начальное значение интервала сортировки.
            h = h * 3 + 1; // (1, 4, 13, 40, 121, ...)
        }
        return h;
    }
}
