package com.androsor.decomp;

import java.util.Scanner;

public class Data {

    public  static  int inputData(String massage) {
        System.out.print(massage);
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println(" Введенные данные не являются натуральными числами. Повторите ввод.");
        }
        return sc.nextInt();
    }
}
