package com.androsor.liner;

/**
 * A natural number T is given, which represents the duration of the elapsed time in seconds.
 * Print the given duration value in hours, minutes and seconds in the following form: (ННч ММмин SSc)
 */
public class HomeTask5 {

    public static void main(String[] args){

        long t = 17900000;

        var hours = t / 3600;
        var minutes = hours / 60;
        var seconds = minutes / 60;

        System.out.println("Исходное число в секундах = " + t + "c");
        System.out.println("Длительность в формате ННч ММмин SSc = " + hours + "ч" + " " + minutes + "мин" +" " + seconds + "с");
    }
}