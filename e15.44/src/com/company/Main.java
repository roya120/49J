package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, String> students = new TreeMap<String, String>();

        String name;
        String grade;

        Scanner input = new Scanner(System.in);

        students.put("Carl", "B+");
        students.put("Joe", "C");
        students.put("Sarah", "A");
        System.out.println("This is what we have in the map so far " + students);


        System.out.println("Do you want to add students y/n");
        String ans;
        ans = input.nextLine();

        while(ans.equals("y")) {

            System.out.println("This is what we have in the map so far " + students);
            System.out.println("Enter the name and grade of the students");
            System.out.println("Name: ");
            name = input.nextLine();

            System.out.println("grade ");
            grade = input.nextLine();

            students.put(name, grade);

            System.out.println("Do you want to add students y/n");
            ans = input.nextLine();

        }
        if( ans.equals("n"))
        {
            System.out.println("Okay no adding");
        }

        System.out.println("Do you want to remove students y/n");
        String ans2;
        ans2 = input.nextLine();
        while(ans2.equals("y"))
        {
            System.out.println("Name: ");
            name = input.nextLine();
            students.remove(name);
            System.out.println("Do you want to remove students y/n");
            ans2 = input.nextLine();
        }
        if(ans2.equals("n"))
        {
            System.out.println("okay no removing");
        }

        System.out.println("Do you want to modify student's grade y/n");
        String ans3;
        ans3 = input.nextLine();
        String grade3;
        while(ans3.equals("y"))
        {
            System.out.println("Name: ");
            name = input.nextLine();

            System.out.println("What is the new grade?");
            grade3=input.nextLine();

            students.put(name, grade3);
            System.out.println("Do you want to modify again ? y/n");
            ans3 = input.nextLine();
        }
        if(ans3.equals("n"))
        {
            System.out.println("okay no modifying");
        }



        Set<String> keySet = students.keySet();
        for (String key : keySet){
            String value = students.get(key);
            System.out.println(key + ":" + value);
        }


    }
}
