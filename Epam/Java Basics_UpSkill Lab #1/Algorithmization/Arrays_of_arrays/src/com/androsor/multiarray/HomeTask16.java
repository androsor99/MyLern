package com.androsor.multiarray;

import java.util.Scanner;
import static com.androsor.multiarray.FillArray.standardFillArray;
import static com.androsor.multiarray.PrintArray.printArrayInt;

/**
 * A magic square of order n is an nXn square matrix composed of the numbers 1, 2, 3, ...,
 * so that the sums for each column, each row, and each of the two large diagonals are equal. Construct such a square.
 */

public class HomeTask16 {

    public static void main(String[] args) {

        int n; // размерность матрицы.
        int [][] magicMatrix;

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Введите размерность магического квадрата: ");
        n = scanner.nextInt();

        while ((n % 2 == 0) && (n != 4)) {
                System.out.println(" Размерность должна быть нечетной или равной 4: ");
                System.out.print(" Введите размерность магического квадрата: ");
                n = scanner.nextInt();
        }

        magicMatrix = new int[n][n];

        if (n == 4) {
            magicMatrixEven(magicMatrix);
            System.out.println();
            System.out.println(" Магический квадрат разрядности n = " + n);
            printArrayInt(magicMatrix);
        }

        if (n % 2 != 0) {
            magicMatrixOdd(magicMatrix);
            System.out.println();
            System.out.println(" Магический квадрат разрядности n = " + n);
            printArrayInt(magicMatrix);
        }

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

        public static void magicMatrixOdd (int [][] magicMatrix) {

        int indexI = 0; // текущий индекс строки.
        int indexJ = magicMatrix.length / 2; // Текущий индекс столбца.
        int currentIndexI;
        int currentIndexJ;

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
    }

    // Метод для матрицы 4х4. Составление магического квадрата путем перестановки главной и дополнительных
    // диаганалей матрицы.

    public static void magicMatrixEven (int [][] magicMatrix) {

        standardFillArray(magicMatrix); // Отсортированная матрица.

        // Перестановка главной диагонали.

        for (int i = 0; i < magicMatrix.length/2; i++) {
            int temp;
            temp = magicMatrix[i][i];
            magicMatrix[i][i] = magicMatrix[magicMatrix.length-1-i][magicMatrix.length-1-i];
            magicMatrix[magicMatrix.length-1-i][magicMatrix.length-1-i] = temp;
        }

        // Перестановка элементов побочной диагонали

        for (int i = 0; i <magicMatrix.length/2 ; i++) {
            int temp;
            temp = magicMatrix[magicMatrix.length - 1 -i][i];
            magicMatrix[magicMatrix.length - 1 - i][i] = magicMatrix[i][magicMatrix.length-1-i];
            magicMatrix[i][magicMatrix.length-1-i] = temp;
        }
    }
}