package com.company;

import java.util.Scanner;

public class E13_9 {
    public static int indexOf (String text, String str) {
        return indexOf(text, str, 0);
    }

    public static int indexOf(String text, String str, int startIndex) {
        if (text.length() < str.length()) {
            return -1;
        } else if (text.substring(0, str.length()).equals(str)) {
            return startIndex;
        } else {
            return indexOf(text.substring(1), str, startIndex + 1);
        }
    }


    public static void main(String[] args) {
         String text;
         String str;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the text");
        text = input.next();
        System.out.println("Please enter the substring");
        str = input.next();


        int index = indexOf(text, str);
        if (index == -1) {
            System.out.println("This string is not substring of the text");
        } else  {
            System.out.printf("Starting index of substring is: " +  index);
        }
    }
}
