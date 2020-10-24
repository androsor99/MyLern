package com.androsor.decomp;

/**
 * Write a program that determines the sum of n - digit numbers containing only odd digits. Also determine how many
 * even digits are in the found amount. To solve the problem, use decomposition.
 */

public class HomeTask16 {

    public static void main(String [] args) {

        int n = HomeTask1.dataInput(" Введите число N = ");
        while (n < 0) {
            System.out.println(" Число должно быть положительным!");
            n = HomeTask1.dataInput(" Введите число N = ");
        }

        int sum = sumArray(arrayDigitCapacity(n));

        System.out.printf(" Сумма нечетных цифр n-значного числа равна %d \n", sum);

        System.out.printf(" Колличество четных цифр в найденной сумме: %d", evenNumber(sum));
    }

    // Метод нахождения разрядности числа
    public static int digitCapacity(int number) {

        int count = 0;
        while (number > 0) {
            count++;
            number = number / 10;
        }
        return count;
    }

    // Метод заполнения массива цифрами числа.
    public static int [] arrayDigitCapacity(int number) {

        int temp = number;
        int[] myArray = new int[digitCapacity(number)];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = temp % 10;
            temp = temp / 10;
        }
        return myArray;
    }

    // Метод нахождения суммы нечетных цифр числа
    public static int sumArray (int [] myArray) {

        int sum = 0;
        for (int i = 0; i < myArray.length; i++){
            if (myArray[i] % 2 != 0) {
                sum = sum + myArray[i];
            }
        }
        return sum;
    }

    // Метод нахождения количества четных цифер в сумме.
    public static int evenNumber (int number){

        int temp = number;
        int[] myArray = new int[digitCapacity(number)];
        int countEven = 0;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = temp % 10;
            if (myArray[i] % 2 == 0) {
                countEven++;
            }
            temp = temp / 10;
        }
        return countEven;
    }
}
