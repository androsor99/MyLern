package com.androsor.liner;

/**
 * A real number R of the form nnn.ddd is given (three digital digits in fractional and integer parts). Swap the fractional and integer parts of the number and print the resulting value of the number.
 */
public class HomeTask4 {

    public static void main(String[] args){
        double r = 179.908;

        var r1 = r * 1000;
        var r2 = r1 % 1000;
        double r3 = (int) r;
        double R = r2 + r3/1000;

        System.out.println("Исходное число = " + r);
        System.out.println("Перевернутое число = " + R);
    }
}
