package com.androsor.decomp;

/**
 *Find all natural n-digit numbers whose digits form a strictly increasing sequence (for example, 1234, 5789).
 *  To solve the problem, use decomposition.
 */

public class HomeTask15 {

    public static void main(String [] args) {

        int n = HomeTask1.dataInput(" Введите число N = ");
        while ((n <= 1) || (n > 9)) {
            System.out.println(" Число должно быть меньше 9 и равным или больше 2!");
            n = HomeTask1.dataInput(" Введите число N = ");
        }

        method1(n);
    }

    // Метод нахождения строго возрастающую последовательность (например, 1234, 5789).
    public static boolean findIncreasingNum(int number) {
        int temp = number;
        int count = 0;
        boolean flag = true;

        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        int[] myArray = new int[count];

        for (int j = count - 1 ; number > 0; j--) {
            myArray[j] = number % 10;
            number = number / 10;
        }

        for (int i = 0; i < count -1; i++) {

            if (myArray[i+1] == (myArray[i]+1)) {
            } else flag = false;
        }
        return flag;
    }

    // Метод вывода чисел с цифрами в строго возрастающей последовательности.
    public static void method1 (int n) {

        if (n==2){
            for (int i =10; i < 100; i++) {
                if (findIncreasingNum(i)) {
                    System.out.printf(" %d ", i);
                }
            }
        } else {
            for (int i =  10*((int)Math.pow(10,(n-2))); i < 10*((int)Math.pow(10,(n-1))); i++){
                if (findIncreasingNum(i)) {
                    System.out.printf(" %d ", i);
                }
            }
        }
    }
}
