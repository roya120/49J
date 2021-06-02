package com.company;
import java.util.Scanner;

public class E5_19 {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        String notation;
        System.out.println("Please enter the notation of the card");

        Scanner input = new Scanner(System.in);

        notation = input.nextLine();



        Cards card = new Cards(notation);

        System.out.println(card.getDescription());


    }
}
