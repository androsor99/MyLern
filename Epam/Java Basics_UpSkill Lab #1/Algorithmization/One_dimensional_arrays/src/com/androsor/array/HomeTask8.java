package com.androsor.array;

import static com.androsor.array.ArrayCreator.inputParameter;
import static com.androsor.array.ArrayCreator.createArray;
import static com.androsor.array.ArrayCreator.printArray;

/**
 * You are given a sequence of integers a1, a2, ..., an. Form a new sequence, discarding those terms from the original,
 * which are equal to min (a1, a2, ..., an).
 */
public class HomeTask8 {

    public static void main (String[] args) {

        int arrayWidth; // разрядность массива

        System.out.print(" Введите разрядность массива arrayWidth = ");
        arrayWidth = inputParameter();

        System.out.println(" Исходный массив: ");
        int[] myArray = createArray((arrayWidth));
        printArray(myArray);

        int minElement = getMinElementOfArray(myArray); // минимальный элемент в массиве
        System.out.println(" Минимальный элемент в массиве = " + minElement);

        int numberOfElementsNotEqualMin = getNumberOfElementsNotEqualToMin(minElement, myArray); // количество элементов не равных мин..
        System.out.println(" Количество повторов минимального элемента массива = " + (myArray.length - numberOfElementsNotEqualMin));

        if (numberOfElementsNotEqualMin == 0) {
            System.out.println(" Весь массив состоиит из одного или из одинаковых элементов, составить новый массив невозможно ");
        } else {
            System.out.println(" Новая последовательность");
            int[] myArrayNew = createNewArray(myArray, minElement, numberOfElementsNotEqualMin); // массив без мин элемента исходного массива.
            printArray(myArrayNew);
        }
    }

    private static int getMinElementOfArray(int[] array) {
        int minElementOfArray = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minElementOfArray) {
                minElementOfArray = array[i];
            }
        }
        return minElementOfArray;
    }

    private static int getNumberOfElementsNotEqualToMin(int minElement, int[] array) {
        int numberOfElement = 0;
        for (int element : array) {
            if (element != minElement) {
                numberOfElement++;
            }
        }
        return numberOfElement;
    }

    private static int[] createNewArray(int[] array, int minElement, int numberElements) {
        int[] arrayNew = new int[numberElements];
        int index = 0;
        for (int element : array) {
            if (element != minElement) {
                arrayNew[index] = element;
                index++;
            }
        }
        return arrayNew;
    }
}

