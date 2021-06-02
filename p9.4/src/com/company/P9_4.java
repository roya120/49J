package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class P9_4 {

    public static void main(String[] args) {

        String description;
        String type;
        int day;
        int month;
        int year;


        NewAppoinntment appointment = new NewAppoinntment();



        System.out.println("You can make your appointment");
        System.out.println("Please enter the type of the appointment, monthly, daily, or one time: ");
        Scanner input = new Scanner(System.in);
        type = input.nextLine();

        if( !type.equals("monthly") && !type.equals("daily")   && !type.equals("one time"))
        {
            System.out.println("Invalid input, try again.");
        }
        System.out.println("Enter the description: ");

        description= input.nextLine();


        System.out.println("Enter the year");
        year = input.nextInt();
        System.out.println("Enter the month");
        month = input.nextInt();
        System.out.println("Enter the day");
        day = input.nextInt();

        if ( type.equals("monthly"))
        {

            Monthly monthly = new Monthly( description , year, month, day);
            appointment.makeAppointment(monthly);


        }

        if ( type.equals("one time"))
        {

            Onetime onetime = new Onetime( description , year, month, day);
            appointment.makeAppointment(onetime);


        }
        if ( type.equals("daily"))
        {

            Daily daily = new Daily( description , year, month, day);
            appointment.makeAppointment(daily);


        }

        appointment.show(year, month, day);





    }
}
