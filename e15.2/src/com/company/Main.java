package com.company;

import java.util.*;

public class Main

{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice = 0;

        Map<Integer, Student> students = new TreeMap<Integer, Student>();

        Map<Student, String> grades = new TreeMap<Student, String>();

        Set<Student> sort = new HashSet<Student>();



        while (choice != 5) {

            choice = menu();


            switch (choice) {

                case 1:


                    add(students, grades);
                    break;


                case 2:


                modifyingGrade(students, grades);
                break;



                case 3: {

                    remove(students, grades);
                    break;

                }

                case 4:

                    print(grades);
                    break;



                case 5:

                    System.out.println("Done");
                    break;

                default:
                    System.out.println("try again");

            }

        }

    }

    public static int menu(){
        int choice;

        Scanner in = new Scanner(System.in);
        System.out.println("choose your option");

        System.out.println("1: adding a Student");

        System.out.println("2: Changing a grade");

        System.out.println("3: revoming a Student");

        System.out.println("4: Printing student info");

        System.out.println("5: Exit");
        choice = in.nextInt();
        return choice;

    }

    public static void add(Map<Integer, Student> StudentM, Map<Student, String> GradeM) {
        int id1;
        String firstName;
        String lastName;
        String grade;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first name of student: ");

        firstName = input.next();

        System.out.println("Enter the last name of student: ");

        lastName = input.next();

        System.out.println("Enter the ID number of student: ");

        id1 = input.nextInt();

        System.out.println("Enter the grade: ");

        grade = input.next();

        System.out.println(lastName + " " + id1 + " is added");

        if (StudentM.containsKey(id1)) {

            System.out.println("This ID exists");

            System.out.println("Try again");


        }

        Student stud = new Student(firstName, lastName, id1);

        StudentM.put(stud.getID(), stud);

        GradeM.put(stud, grade);

    }

    public static void modifyingGrade(Map<Integer, Student> StudentM, Map<Student, String> GradeM) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the ID please");
        System.out.println("prints, now enter");

        int id4 = input.nextInt();
       

        if (!StudentM.containsKey(id4)) {

            System.out.println("Error try again");

        }

        System.out.println("What is the new grade?");

        String grade2 = input.next();


        GradeM.put(StudentM.get(id4), grade2);



    }


    public static void remove(Map<Integer, Student> StudentM, Map<Student, String> GradeM) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter ID");

        int id2 = input.nextInt();

        GradeM.remove(StudentM.get(id2));

        StudentM.remove(id2);

    }



    public static void print(Map<Student, String> GradeM) {

        Set<Student> studList = GradeM.keySet();

        for (Student s : studList) {

            System.out.println(s.toString() + " " + GradeM.get(s));

        }

    }
}








