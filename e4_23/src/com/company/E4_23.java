package com.company;

import java.util.Scanner;

public class E4_23 {

    public static void main(String[] args) {
        double height;
        double diameter;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the diameter: ");

        diameter= input.nextDouble();

        System.out.println("Please enetr the height: ");

        height = input.nextDouble();



        SodaCan can = new SodaCan(height, diameter);


        System.out.println("Volume: " + can.getVolume());


        System.out.println("Surface Area: " + can.getSurfaceArea());

    }
}
