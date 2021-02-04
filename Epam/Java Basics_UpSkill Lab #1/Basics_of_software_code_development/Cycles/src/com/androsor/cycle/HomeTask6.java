package com.androsor.cycle;

/**
 * For each natural number in the range from m to n, output all divisors except one and the number itself.
 * m and n are entered from the keyboard.
 */
public class HomeTask6 {

    public static void main(String[] args) {
        int m = 3;
        int n = 15;

        if (m > n) {
            System.out.println(" Число m должно быть меньше " + n +"!");
        }
        else {
            do {
                System.out.print( " Делители числа " +m+ " - ");
                for (int i = 2; i * i < m; i++) {
                    if (m % i == 0) {
                        System.out.print(i + ", ");
                    }
                }
                for (int i = (int) Math.sqrt(m); i >= 2; i--) {
                    if (m % i == 0) {
                        System.out.print(m / i + ", ");
                    }
                }
                m++;
                System.out.println();
            }
            while (m<=n);
        }
    }
}




