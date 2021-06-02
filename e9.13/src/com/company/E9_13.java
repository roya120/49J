package com.company;


import java.util.Scanner;

public class E9_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter coordinate for x ");
        int x,y;

        x= input.nextInt();

        System.out.println("Please enter coordinate for y ");
        y= input.nextInt();

        System.out.println("Please enter the width: ");
        int width = input.nextInt();
        System.out.println("Please enter the length: ");
        int length = input.nextInt();

        BetterRectangle Rec = new BetterRectangle(x,y,width, length);

        double area, perimeter;

        area = Rec.getArea();

        perimeter = Rec.getPerimeter();

        System.out.println("Area is " + area + " Perimeter is " + perimeter);




    }
}
