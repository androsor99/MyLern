package com.androsor.liner;

/**
 * Calculate the value of an expression using a formula (all variables are valid)
 */
public class HomeTask2 {

    public static void main(String[] args){
        var a = 2;
        var b = 1;
        var c = 1;

        var value = ((b + Math.sqrt(b*b + 4*a*c))/2*a) - Math.pow(a, 3) * c + Math.pow(b, -2);

        System.out.printf("Результат = %.3f", value);
    }
}

