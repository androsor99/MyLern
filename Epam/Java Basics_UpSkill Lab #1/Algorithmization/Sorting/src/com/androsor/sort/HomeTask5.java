package com.androsor.sort;

import static com.androsor.sort.IOUtils.isReplace;
import static com.androsor.sort.IOUtils.run;
import static java.util.Arrays.copyOf;

/**
 * Implement Shell sort.
 */
public class HomeTask5 implements Sorter {

    public static void main(String[] args) {

        Sorter sorter = new HomeTask5();
        run(sorter);
    }

    @Override
    public int[] sort(int[] array, boolean sortSelection) {
        int[] copiedArray = copyOf(array, array.length);
        int inner, outer, temp;
        int h = getSortingInterval(copiedArray.length);
        while (h >= 1) {
            for (outer = h; outer < copiedArray.length; outer++) { // Сдвигаемся на 1 шаг, для h-сортировки следующей группы элементов массива.
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
        while (h <= length / 3) { // Ищем начальное значение интервала сортировки.
            h = h * 3 + 1; // (1, 4, 13, 40, 121, ...)
        }
        return h;
    }
}
