package com.androsor.sort;

import static com.androsor.sort.SorterLogic.isReplace;
import static com.androsor.sort.SorterLogic.run;
import static java.util.Arrays.copyOf;

/**
 * Implement insertion sort.
 */
public class HomeTask4 implements Sorting {

    public static void main(String[] args) {

        Sorting sorter = new HomeTask4();
        run(sorter);
    }

    @Override
    public int[] sort(int[] numbers, boolean sortSelection) {
        int[] copiedArray = copyOf(numbers, numbers.length);
        for (int i = 1; i < copiedArray.length; i++) {
            int temp = copiedArray[i];
            int j = i - 1;
            while (j >= 0 && (isReplace(copiedArray[j], temp, sortSelection))) {
                copiedArray[j + 1] = copiedArray[j];
                j = j - 1;
            }
            copiedArray[j + 1] = temp;
        }
        return copiedArray;
    }
}
