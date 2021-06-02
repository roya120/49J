package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.*;

public class AppointmentTest {


    Appointment a = new Appointment("hi", 2016, 5, 4);
    Appointment b = new Appointment("hello", 2018, 5, 4);
    Appointment c = new Appointment("new", 2019,  6, 6);



    public void setUp () throws Exception
    {
     
    }

    @org.junit.Test
    public void testoccursOn() {


        boolean expected=true;




        boolean actual = this.a.occursOn(2016, 5, 4);



            assertEquals(expected, actual);



    }




    @org.junit.Test
    public void testSave() throws IOException {

    Appointment testApp = new Appointment("hi", 2016,5,4);


    testApp.save("tempFile.txt");
        File input = new File("tempFile.txt");
        Scanner in = new Scanner(input);
        String fileData = in.nextLine().trim();



        assertEquals("Writing to file failed ", "Description hi 5/4/2016", fileData );





    }

    @org.junit.Test
    public void testLoad() throws IOException{
        Appointment newApp = new Appointment("hi" ,2016, 5, 4);
        String input = newApp.load("testRead.txt");
        assertEquals("Reading from file failed", "Description hi 5/4/2016", input);

    }
}