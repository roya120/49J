package com.company;

import javafx.util.Pair;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args)

    {

        ArrayList<MeasurableString> strings = new ArrayList<MeasurableString>();

        strings.add(new MeasurableString("Jack"));

        strings.add(new MeasurableString("Zar")      );

        strings.add(new MeasurableString("Man"));

        strings.add(new MeasurableString("since"));

        strings.add(new MeasurableString("party"));

        strings.add(new MeasurableString("nice"));

        strings.add(new MeasurableString("Java"));

        strings.add(new MeasurableString("longesttttt"));

        System.out.println("The largest word is " + MeasurableString.largest(strings));


    }

}
