package com.company;

import java.util.Scanner;

public class P4_17 {

    public static int timeInMinutes(int time) {

        int minutesInHour = 60;

        final int MINUTES_IN_DAY = 24 * 60;

        int time2 = time / 100 * minutesInHour + time % 100;

        return time2;

    }


    public static void main(String[] args) {

        final int MINUTESINHOUR = 60;

        final int MINUTESINDAY = 24 * 60;


        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first time: ");

        int firstTime = input.nextInt();


        System.out.print("Please enter the second time: ");


        int secondTime = input.nextInt();


        int firstTimeInMinutes = timeInMinutes(firstTime);

        int secondTimeInMinutes = timeInMinutes(secondTime);


        int minutes = secondTimeInMinutes - firstTimeInMinutes;


        minutes = ( MINUTESINDAY + minutes ) % MINUTESINDAY;


        int hours = minutes / 60;

        minutes = minutes % 60;

        System.out.println(hours + " hours " + minutes + " minutes");
    }
}

