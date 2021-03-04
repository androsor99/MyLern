package com.androsor.sort;

import static com.androsor.sort.IOUtils.isReplace;
import static com.androsor.sort.IOUtils.run;
import static java.util.Arrays.copyOf;

/**
 * Implement exchange sort.
 */
public class HomeTask3 implements Sorter{

    public static void main(String[] args) {

        Sorter sorter = new HomeTask3();
        run(sorter);
    }

    public int[] sort(int[] numbers, boolean sortSelection) {
        int[] copiedArray = copyOf(numbers, numbers.length);
        for(int i = 0; i < copiedArray.length - 1; i++) {
            for(int j = copiedArray.length - 1; j > i; j--) {
                if(isReplace(copiedArray[j - 1], copiedArray[j], sortSelection)) {
                    int temp = copiedArray[j - 1];
                    copiedArray[j - 1] = copiedArray[j];
                    copiedArray[j] = temp;
                }
            }
        }
        return copiedArray;
    }
}
