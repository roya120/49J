package com.company;
import java.util.Scanner;

public class PrimePrinter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");

        int number;

        number= input.nextInt();

        System.out.println("All prime numbers up to " + number );

        PrimeGenerator prime = new PrimeGenerator(number);

        prime.nextPrime(number);

    }
}
