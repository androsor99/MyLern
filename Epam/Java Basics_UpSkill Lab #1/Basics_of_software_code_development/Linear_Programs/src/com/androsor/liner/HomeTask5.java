package com.androsor.liner;

/**
 * A natural number T is given, which represents the duration of the elapsed time in seconds.
 * Print the given duration value in hours, minutes and seconds in the following form: (ННч ММмин SSc)
 */
public class HomeTask5 {

    public static void main(String[] args){

        var t = 3666;

        var hour = t / 3600;
        var minute = (t - hour * 3600) / 60;;
        var second = t - (hour * 3600 + minute * 60);

        System.out.println("Исходное число в секундах = " + t + "c");
        System.out.println("Длительность в формате ННч ММмин SSc = " + hour + "ч" + " " + minute + "мин" +" " + second + "с");
    }
}