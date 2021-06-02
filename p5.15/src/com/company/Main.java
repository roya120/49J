package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter the path to JAVA's source file: ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String pathToFile = null;

        try {


            pathToFile = br.readLine();

            File f = new File(pathToFile);

            Scanner s = new Scanner(f);

            int lnCnt = 1;

            while (s.hasNextLine()) {

                String strLine = s.nextLine();

                Scanner sL = new Scanner(strLine);

                sL.useDelimiter("[^A-Za-z0-9_]+");

                while (sL.hasNext()) {

                    String identifier = sL.next();

                    System.out.println("Identifier: " + identifier + " at Line# " + lnCnt);

                }

                ++lnCnt;

            }

        } catch (IOException ioe) {

            System.out.println("Unable to locate file. Program will exit.\n"

                    + ioe.toString());

            System.exit(0);
        }
    }
}
