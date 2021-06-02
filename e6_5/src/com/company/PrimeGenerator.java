package com.company;

import java.sql.SQLOutput;

public class PrimeGenerator {


    private int number;

    public PrimeGenerator(int num) {
        number = num;
    }


    public boolean isPrime(int num) {


        if (num % 2 == 0) {

            return false;

        }
        return true;
    }


    public void nextPrime(int number) {


        for (int i = 2; i < number; i++) {



            if (isPrime(i) == true) {
                System.out.println(i);
            }

        }


    }
}








