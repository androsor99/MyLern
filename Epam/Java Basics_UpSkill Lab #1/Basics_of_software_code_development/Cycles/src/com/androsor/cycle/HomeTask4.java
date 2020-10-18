package com.androsor.cycle;

import java.math.BigInteger;

/**
 * Make a program for finding the product of the squares of the first two hundred numbers.
 */
public class HomeTask4 {

    public static void main(String[] args) {
        BigInteger directProduct = BigInteger.valueOf(1);

        for(int i = 1; i <= 200; i++) {
            directProduct = directProduct.multiply(BigInteger.valueOf(i * i));
        }
        
        System.out.println(" Произведение квадратов первых 200 чисел = "+ directProduct);
    }
}