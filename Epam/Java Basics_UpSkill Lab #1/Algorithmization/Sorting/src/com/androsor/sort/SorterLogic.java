package com.androsor.sort;

import static com.androsor.sort.IOUtils.createArrayRandom;
import static com.androsor.sort.IOUtils.printArray;
import static com.androsor.sort.SortMessageType.*;

public class SorterLogic {

    public static void test(Sorting sorter) {
        int[] numbers = createArrayRandom();
        printArray(numbers, DEFAULT.getType());

        int[] sortedNumbersAscending = sorter.sort(numbers, true);
        printArray(sortedNumbersAscending, ASCENDING.getType());

        int[] sortedNumbersDescending = sorter.sort(numbers, false);
        printArray(sortedNumbersDescending, DESCENDING.getType());
    }

    public static boolean isReplace(int numberFrom, int numberTo, boolean sortSelection) {
        if (sortSelection) {
            return numberFrom > numberTo;
        } else {
            return numberFrom < numberTo;
        }
    }
}
