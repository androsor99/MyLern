package com.androsor.decomp;

import java.util.Scanner;

/**
 * Write a method (s) that determines which of the given two numbers has more digits.
 */

public class HomeTask11 {

    public static void main(String[] args) {

        int number1;
        int number2;

        number1 = dataInput(" Введите первое число: ");
        number2 = dataInput(" Введите второе число: ");

        int counter1 = HomeTask10.findArrayLength(number1);
        int counter2 = HomeTask10.findArrayLength(number2);

        determineWhichNum(counter1, counter2);
    }

    // Метод ввода данных.
    public  static  int dataInput(String massage) {
        System.out.print(massage);
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print(" Введенные данные не являются целыми числами. Повторите ввод: ");
        }
        return sc.nextInt();
    }

    public static  void determineWhichNum( int counter1, int counter2){

        if ( counter1 > counter2 ){
            System.out.println(" В первом числе  цифр больше ");
        }else{
            System.out.println(" Во втором числе цифр больше");
        }if (counter1 == counter2){
            System.out.println(" Кол-во  цифр в каждом числе одинаково");
        }
    }
}
