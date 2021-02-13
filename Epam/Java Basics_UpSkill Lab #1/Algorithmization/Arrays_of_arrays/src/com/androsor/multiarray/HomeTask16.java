package com.androsor.multiarray;

import java.util.Scanner;

import static com.androsor.multiarray.ArrayCreator.standardFillArray;
import static com.androsor.multiarray.ArrayPrinter.printArrayInt;

/**
 * A magic square of order n is an nXn square matrix composed of the numbers 1, 2, 3, ...,
 * so that the sums for each column, each row, and each of the two large diagonals are equal. Construct such a square.
 */
public class HomeTask16 {

    public static void main(String[] args) {

        int arrayWidth; // размерность матрицы.

        System.out.print(" Введите размерность магического квадрата: ");
        arrayWidth = inputParameter();

        if (arrayWidth == 4) {
            System.out.println(" Магический квадрат разрядности arrayWidth = " + arrayWidth);
            int [][] magicMatrixEven = fillMagicMatrixEven(arrayWidth);
            printArrayInt(magicMatrixEven);
        } else {
            System.out.println(" Магический квадрат разрядности arrayWidth = " + arrayWidth);
            int [][] magicMatrixOdd = fillMagicMatrixOdd(arrayWidth);
            printArrayInt(magicMatrixOdd);
        }
    }

    private static int inputParameter() {
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        while ((temp % 2 == 0) && (temp != 4)) {
            System.out.println(" Размерность должна быть нечетной или равной 4: ");
            System.out.print(" Введите размерность магического квадрата: ");
            temp = scanner.nextInt();
        }
        return temp;
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

        public static int [][] fillMagicMatrixOdd(int arrayWidth) {
        int [][] magicMatrix = new int[arrayWidth][arrayWidth];
        int indexI = 0; // начальный индекс строки.
        int indexJ = magicMatrix.length / 2; // начальный индекс столбца.
        int currentIndexI; // текущий индекс строки
        int currentIndexJ; // текущий индекс столбца

        for (int value = 1; value <= magicMatrix.length * magicMatrix.length; value ++) {
            magicMatrix[indexI][indexJ] = value;
            currentIndexI = indexI;
            currentIndexJ = indexJ;
            indexI -= 1;
            indexJ += 1;

            if (indexI == -1) {
                indexI = magicMatrix.length - 1;
            }
            if (indexJ == magicMatrix.length) {
                indexJ = 0;
            }
            if (magicMatrix[indexI][indexJ] != 0) {
                indexI = currentIndexI + 1;
                indexJ = currentIndexJ;
                if (indexI == -1) {
                    indexI = magicMatrix.length - 1;
                }
            }
        }
        return magicMatrix;
    }

    // Метод для матрицы 4х4. Составление магического квадрата путем перестановки главной и дополнительных
    // диаганалей матрицы.

    public static int [][] fillMagicMatrixEven (int arrayWidth) {
        int [][] magicMatrix = standardFillArray(arrayWidth);

        // Перестановка главной диагонали.

        for (int i = 0; i < magicMatrix.length/2; i++) {
            int temp = magicMatrix[i][i];
            magicMatrix[i][i] = magicMatrix[magicMatrix.length - 1 - i][magicMatrix.length - 1 - i];
            magicMatrix[magicMatrix.length - 1 - i][magicMatrix.length - 1 - i] = temp;
        }

        // Перестановка элементов побочной диагонали

        for (int i = 0; i < magicMatrix.length/2 ; i++) {
            int temp = magicMatrix[magicMatrix.length - 1 - i][i];
            magicMatrix[magicMatrix.length - 1 - i][i] = magicMatrix[i][magicMatrix.length - 1 - i];
            magicMatrix[i][magicMatrix.length - 1 - i] = temp;
        }
        return magicMatrix;
    }
}
