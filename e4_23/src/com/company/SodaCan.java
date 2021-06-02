package com.company;

public class SodaCan {


    double height;
    double radius;

    public SodaCan(double h, double diameter) {
        height = h;
        radius = diameter/2;
    }

    public double getVolume()
    {
        return Math.PI * height * Math.pow(radius, 2);
    }

    public double getSurfaceArea()
    {
        return (2 * Math.PI * radius * height) +
                (2 * Math.PI * Math.pow(radius, 2));
    }
}
