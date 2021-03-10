package com.androsor.sort;

import static com.androsor.sort.SorterLogic.isReplace;
import static com.androsor.sort.SorterLogic.test;
import static java.util.Arrays.copyOf;

/**
 * Implement selection sort.
 */
public class HomeTask2 implements Sorting {

    public static void main(String[] args) {

        Sorting sorter = new HomeTask2();
        test(sorter);
    }

    @Override
    public int[] sort(int[] numbers, boolean sortSelection) {
        int[] copiedArray = copyOf(numbers, numbers.length);
        for (int i = 0; i < copiedArray.length; i++) {
            int minOrMaxItem = copiedArray[i];
            int indexMinOrMaxItem = i;
            for (int j = i + 1; j < copiedArray.length; j++) {
                if (isReplace(minOrMaxItem, copiedArray[j], sortSelection)) {
                    minOrMaxItem = copiedArray[j];
                    indexMinOrMaxItem = j;
                }
            }
            copiedArray[indexMinOrMaxItem] = copiedArray[i];
            copiedArray[i] = minOrMaxItem;
        }
        return copiedArray;
    }
}
