package com.company;

public class IceCreamCone {

    double height;
    double radius;

    public IceCreamCone( double h, double r)
    {
        height = h;
        radius =r;
    }


    public double getSurfaceArea ()
    {
        double length = Math.sqrt( (radius * radius ) + (height * height ));
        double area = Math.PI * radius * length;
        return area;
    }

    public double getVolume() {
        double volume = (Math.PI * height * radius * radius ) / 3;
        return volume;
    }



}
