package com.company;
import java.util.Scanner;

public class E5_18 {

    public double taxCall(double income) {
        double tax = 0;
        Scanner in = new Scanner(System.in);

        //  System.out.println("Please enter your income :");
        //  income = in.nextFloat();

        double tax0 = 50000 * 0.01;
        double tax1 = 25000.00 * .02 + tax0;
        double tax2 = 25000.00 * .03 + tax1;
        double tax3 = 150000.0 * .04 + tax2;
        double tax4 = 250000.0 * .05 + tax3;

        if (income <= 50000) {
            tax = income * 0.1;
        } else if (income <= 75000) {
            tax = ((income - 50000.0) * .02 + tax0);
        } else if (income <= 100000) {
            tax = ((income - 75000.0) * .03 + tax1);
        } else if (income <= 250000) {
            tax = ((income - 100000.0) * .04 + tax2);
        } else if (income <= 500000) {
            tax = ((income - 2500000.0) * .05 + tax3);
        } else if (income < 500000) {
            tax = ((income - 500000.0) * .06 + tax4);
        }
        return tax;
    }
}

