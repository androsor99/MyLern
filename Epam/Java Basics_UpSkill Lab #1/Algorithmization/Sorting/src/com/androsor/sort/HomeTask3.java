package com.androsor.sort;

import static com.androsor.sort.SorterLogic.isReplace;
import static com.androsor.sort.SorterLogic.test;
import static java.util.Arrays.copyOf;

/**
 * Implement exchange sort.
 */
public class HomeTask3 implements Sorting {

    public static void main(String[] args) {

        Sorting sorter = new HomeTask3();
        test(sorter);
    }

    @Override
    public int[] sort(int[] numbers, boolean sortSelection) {
        int[] copiedArray = copyOf(numbers, numbers.length);
        for (int i = 0; i < copiedArray.length - 1; i++) {
            boolean changed = false;
            for (int j = copiedArray.length - 1; j > i; j--) {
                if (isReplace(copiedArray[j - 1], copiedArray[j], sortSelection)) {
                    int temp = copiedArray[j - 1];
                    copiedArray[j - 1] = copiedArray[j];
                    copiedArray[j] = temp;
                    changed = true;
                }
            }
            if (!changed) {
                break;
            }
        }
        return copiedArray;
    }
}
