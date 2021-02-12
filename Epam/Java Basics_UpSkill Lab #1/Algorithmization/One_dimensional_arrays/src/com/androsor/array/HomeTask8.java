package com.androsor.array;

import java.util.Arrays;

/**
 * You are given a sequence of integers a1, a2, ..., an. Form a new sequence, discarding those terms from the original,
 *   which are equal to min (a1, a2, ..., an).
 */
public class HomeTask8 {

    public static void main (String[] args) {

        int arrayWidth; // разрядность массива

        System.out.print(" Введите разрядность массива arrayWidth = ");
        arrayWidth = HomeTask1.inputParameter();

        System.out.println(" Исходный массив: ");
        System.out.println(" ------------------------------------------------------- ");
        int[] myArray = HomeTask2.createArray((arrayWidth));
        System.out.println(" " + Arrays.toString(myArray));
        System.out.println(" ------------------------------------------------------- ");

        int minElement = getMinArray(myArray); // минимальный элемент в массиве

        int numberOfMinElements = getNumberOfElementsEqualToMin(minElement, myArray); // количество элементов не равных мин..

        if ((numberOfMinElements == 1) || (numberOfMinElements == myArray.length)){
            System.out.println(" Весь массив состоиит из одного или из одинаковых элементов, составить новый массив невозможно ");
        }
        else {
            System.out.println(" Новая последовательность");
            System.out.println("---------------------------------------------");
            int[] myArrayNew = createNewArray(myArray, minElement, numberOfMinElements); // массив без мин элементов исходного массива.
            System.out.println(Arrays.toString(myArrayNew));
        }
    }

    private static int[] createNewArray(int[] myArray, int minElement, int numberOfMinElements) {

        int[] myArrayNew = new int[numberOfMinElements];
        int j = 0;
        for (int k : myArray) {
            if (k != minElement) {
                myArrayNew[j] = k;
                j++;
            }
        }
        return myArrayNew;
    }

    private static int getNumberOfElementsEqualToMin(int minArray, int[] myArray) {

        int counter = 0;
        for (int j : myArray) {
            if (j != minArray) {
                counter++;
            }
        }
        return counter;
    }

    private static int getMinArray(int[] myArray) {

        int minArray = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < minArray) {
                minArray = myArray[i];
            }
        }
        return minArray;
    }
}
