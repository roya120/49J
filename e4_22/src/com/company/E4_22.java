package com.company;
import java.util.Scanner;

public class E4_22 {

    public static void main(String[] args) {
        double height;
        double radius;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the radius: ");

        radius = input.nextDouble();

        System.out.println("Please enetr the height: ");

        height = input.nextDouble();


        IceCreamCone cone = new IceCreamCone(height, radius);


        System.out.println("Volume: " + cone.getVolume());


        System.out.println("Surface Area: " + cone.getSurfaceArea());

    }
}
