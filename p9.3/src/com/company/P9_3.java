package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class P9_3 {

    public static void main(String[] args) {

        System.out.println("Month first, then the day and then the year");

        int day;
        int year;
        int month;

        Appointment appointment = new Appointment("Visit the doctor", 2019, 5, 4);

        Onetime onetime = new Onetime("One Time", 2019 , 6, 4);

        Daily daily = new Daily("Daily", 2020, 4, 8);
        Monthly monthly = new Monthly("Monthly", 2020 , 3, 5);


        ArrayList<Appointment> appointments = new ArrayList<>();

        appointments.add(appointment);

        appointments.add(monthly);
        appointments.add(daily);
        appointments.add(onetime);

        System.out.println("Please enter the date of your appointment:");
        System.out.printf("Enter the day: ");
        Scanner input = new Scanner(System.in);
        day = input.nextInt();
        System.out.printf("Enter the month: ");
        month = input.nextInt();
        System.out.printf("Enter the year: ");
        year=input.nextInt();

        for(int i=0; i < appointments.size(); i++) {
            if (appointments.get(i).occursOn(year, month, day)) {

                System.out.println("You have an appointment " + appointments.get(i).getDescription());
            }




        }



    }
}
