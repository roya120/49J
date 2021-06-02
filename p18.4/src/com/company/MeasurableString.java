package com.company;

import java.util.ArrayList;

public class MeasurableString implements Measurable {

    String mName;


    public MeasurableString(String name)

    {

        this.mName = name;

    }


    public static MeasurableString largest(ArrayList<MeasurableString> arr)

    {

        double len = arr.get(0).getMeasure();

        int index = 0;

        for(int i = 1; i < arr.size(); i++)

        {

            if(len < arr.get(i).getMeasure())

            {

                len = arr.get(i).getMeasure();

                index = i;

            }

        }

        return arr.get(index);

    }
    public String toString()

    {

        return this.mName;

    }

    public double getMeasure()

    {


        return this.mName.length();

    }

}


