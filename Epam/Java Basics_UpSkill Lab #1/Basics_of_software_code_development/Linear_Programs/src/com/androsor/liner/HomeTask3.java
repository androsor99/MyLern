package com.androsor.liner;

/**
 * Calculate the value of an expression using a formula (all variables are valid)
 */
public class HomeTask3 {

    public static void main(String[] args){
        var x = -200;
        var y = 1.7;

        var value = ((Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y)) * Math.tan((x*y)));

        System.out.printf("Результат = " + "%.3f", value);
    }
}
