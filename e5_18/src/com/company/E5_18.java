package com.company;

import java.util.Scanner;

public class E5_18 {

    public static void main(String[] args) {
        double income;

        double taxes=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your income ");

        income  = input.nextDouble();

        double tax = 50000.00 * .01;
        double tax2 = 25000.00 * .02 + tax;
        double tax3 = 25000.00 * .03 + tax2;
        double tax4 = 150000.0 * .04 + tax3;
        double tax5 = 250000.0 * .05 + tax4;

        if (income <= 50000){
            taxes = income * .01;
        }
        else if (income <= 75000)
        {
            taxes = ((income - 50000.0) * .02 + tax);
        }
        else if (income <= 100000){
            taxes = ((income - 75000.0) * .03 + tax2);
        }
        else if (income <= 250000){
            taxes = ((income - 100000.0) * .04 + tax3);
        }
        else if (income <= 500000){
            taxes = ((income - 250000.0) * .05 + tax4);
        }
        else if ( income > 500000){
            taxes = ((income - 500000.0) * .06 + tax5);
        }

        System.out.printf("You owe " + taxes);


    }
}

