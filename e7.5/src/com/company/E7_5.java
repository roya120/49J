package com.company;
import java.util.Scanner;

public class E7_5 {

    public static int sum(int[] array)
    {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if( i % 2 ==0) {

                sum = sum + array[i];

                if(i!=0)

                    System.out.print(" + "+array[i]);
                else

                    System.out.print(array[i]);

            }

            else {

                sum = sum - array[i];

                System.out.print(" - "+array[i]);


            }

        }


        return sum;
    }


    public static void main(String[] args) {
        int size;

        System.out.printf("Please enter the size of the array ");

        Scanner input = new Scanner(System.in);

        size = input.nextInt();

        int [] myArray = new int [size];

        for(int i =0; i < size ; i++) {

            System.out.printf("Enter the the " + (i + 1) + " number ");

            myArray[i] = input.nextInt();
        }

        int sumOfArray = sum(myArray);

        System.out.println(" = " + sumOfArray );

    }
}
