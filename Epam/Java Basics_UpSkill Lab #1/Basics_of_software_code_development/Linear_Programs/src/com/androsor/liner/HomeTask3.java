package com.androsor.liner;

import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.tan;
/**
 * Calculate the value of an expression using a formula (all variables are valid)
 */
public class HomeTask3 {

    public static void main(String[] args){
        var x = -200;
        var y = 1.7;

        var value = ((sin(x) + cos(y))/(cos(x) - sin(y)) * tan((x*y)));

        System.out.printf("Результат = %.3f", value);
    }
}
