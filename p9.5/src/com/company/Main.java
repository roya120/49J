package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;



public class Main {



    public static void save(String type, String des, int year, int month, int day)
            throws FileNotFoundException {
        String fileName = "myFile.txt";
        PrintWriter outFile = new PrintWriter(fileName);
        outFile.println("The description is " + des);
        outFile.println("The type is " +  type );
        outFile.println("The date is " + month + "-" + day + "-" + year);
        outFile.close();


    }


    public static void load() throws FileNotFoundException {

    File myFile = new File("myFile.txt");
    Scanner inputFile = new Scanner(myFile);

    while (inputFile.hasNext())
    {
        System.out.println(inputFile.nextLine());
    }
    inputFile.close();


    }


    public static void main(String[] args) throws FileNotFoundException {

        String description;
        String type;
        int day;
        int month;
        int year;


        NewAppointment appointment = new NewAppointment();



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
            save(type, description, year, month, day);
            System.out.println("Your data is saved into a file as shown");
            load();


        }

        if ( type.equals("one time"))
        {

            Onetime onetime = new Onetime( description , year, month, day);
            appointment.makeAppointment(onetime);
            save(type, description, year, month, day);
            System.out.println("Your data is saved into a file as shown");
            load();



        }
        if ( type.equals("daily"))
        {

            Daily daily = new Daily( description , year, month, day);
            appointment.makeAppointment(daily);
            save(type, description, year, month, day);
            System.out.println("Your data is saved into a file as shown");
            load();



        }

        appointment.show(year, month, day);





    }
}
