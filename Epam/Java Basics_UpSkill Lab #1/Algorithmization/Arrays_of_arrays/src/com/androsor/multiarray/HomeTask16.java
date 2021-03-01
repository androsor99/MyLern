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
        for (int i = 0; i < length / 2; i++) {
            int tempMain = magicMatrix[i][i]; // Перестановка главной диагонали.
            magicMatrix[i][i] = magicMatrix[length - 1 - i][length - 1 - i];
            magicMatrix[length - 1 - i][length - 1 - i] = tempMain;
            int tempSide = magicMatrix[length - 1 - i][i]; // Перестановка элементов побочной диагонали
            magicMatrix[length - 1 - i][i] = magicMatrix[i][length - 1 - i];
            magicMatrix[i][length - 1 - i] = tempSide;
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
        int nextRow = 0;
        int nextColumn = length / 2;
        int currentRow;
        int currentColumn;
        for (int value = 1; value <= length * length; value++) {
            magicMatrix[nextRow][nextColumn] = value;
            currentRow = nextRow;
            currentColumn = nextColumn;
            nextRow--;
            nextColumn++;
            if (nextRow < 0) {
                nextRow = length - 1;
            }
            if (nextColumn >= length) {
                nextColumn = 0;
            }
            if (magicMatrix[nextRow][nextColumn] != 0) {
                nextRow = currentRow + 1;
                nextColumn = currentColumn;
            }
        }
        return magicMatrix;
    }
}
