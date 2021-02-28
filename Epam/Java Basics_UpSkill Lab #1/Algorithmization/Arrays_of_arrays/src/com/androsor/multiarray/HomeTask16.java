package com.androsor.multiarray;

import static com.androsor.multiarray.ArrayCreator.fillArrayStandard;
import static com.androsor.multiarray.IOUtils.enterParameterFromConsole;
import static com.androsor.multiarray.IOUtils.printArrayInt;
import static java.lang.Math.abs;

/**
 * A magic square of order n is an nXn square matrix composed of the numbers 1, 2, 3, ...,
 * so that the sums for each column, each row, and each of the two large diagonals are equal. Construct such a square.
 */
public class HomeTask16 {

    public static void main(String[] args) {

        System.out.print(" Введите размерность магического квадрата: ");
        int length = abs(inputParameter());

        if (length == 4) {
            System.out.println(" Магический квадрат разрядности length = " + length);
            int[][] magicMatrixEven = fillMagicMatrixEven(length);
            printArrayInt(magicMatrixEven);
        } else {
            System.out.println(" Магический квадрат разрядности length = " + length);
            int[][] magicMatrixOdd = fillMagicMatrixOdd(length);
            printArrayInt(magicMatrixOdd);
        }
    }

    private static int inputParameter() {
        int parameter = enterParameterFromConsole();
        if ((parameter % 2 == 0) && (parameter != 4)) {
            System.out.println(" Размерность должна быть нечетной или равной 4. Повторите ввод:");
            return inputParameter();
        }
        return parameter;
    }

    // Метод для матрицы 4х4. Составление магического квадрата путем перестановки главной и дополнительных
    // диаганалей матрицы.

    public static int[][] fillMagicMatrixEven(int length) {
        int[][] magicMatrix = fillArrayStandard(length);
        for (int i = 0; i < length / 2; i++) { // Перестановка главной диагонали.
            int temp = magicMatrix[i][i];
            magicMatrix[i][i] = magicMatrix[length - 1 - i][length - 1 - i];
            magicMatrix[length - 1 - i][length - 1 - i] = temp;
        }
        for (int i = 0; i < length / 2 ; i++) { // Перестановка элементов побочной диагонали
            int temp = magicMatrix[length - 1 - i][i];
            magicMatrix[length - 1 - i][i] = magicMatrix[i][length - 1 - i];
            magicMatrix[i][length - 1 - i] = temp;
        }
        return magicMatrix;
    }

    // Выполняем  следующие действия, чтобы создать магический квадрат.
    //   а. Ставим 1 в середине первой строки.
    //   b. Вычитаем 1 из строки и добавляем 1 к столбцу в которую поставили единицу.
    //   с. Если ячейка пустая, ставим следующую цифру в эту позицию.
    //   d. Если это невозможно, выполняем следующие действия:
    //      1) Если индекс в строке -1, то измените на последнюю строку.
    //      2) Если в последнем столбце изменяем на первый столбец.
    //      3)  Если он заблокирован, то опускаемся в следующую строку (из исходного положения)
    //      4)  Если в правом верхнем углу, то опускаемся вниз до следующей строки.

    public static int[][] fillMagicMatrixOdd(int length) {
        int[][] magicMatrix = new int[length][length];
        int indexI = 0; // начальный индекс строки.
        int indexJ = length / 2; // начальный индекс столбца.
        int currentIndexI; // текущий индекс строки
        int currentIndexJ; // текущий индекс столбца

        for (int value = 1; value <= length * length; value ++) {
            magicMatrix[indexI][indexJ] = value;
//            currentIndexI = indexI;
//            currentIndexJ = indexJ;
            indexI --;
            indexJ ++;
            if (indexI < 0) {
                indexI = length - 1;
            }
            if (indexJ >= length) {
                indexJ = 0;
            }
            if (magicMatrix[indexI][indexJ] != 0) {
                indexI = indexI + 2;
                indexJ = indexJ - 1;
            }

            magicMatrix[indexI][indexJ] = value;
        }
        return magicMatrix;
    }
}
