package com.company;
import  java.awt.Rectangle;

public class BetterRectangle extends Rectangle {


    public BetterRectangle(int x, int y, int width, int length)
    {
        setLocation(x,y);
        setSize(width, length);
    }

    public  double getPerimeter()
    {

        return 2 * ( getHeight() + getWidth() );

    }

    public  double getArea()

    {
        return getHeight() * getWidth();
    }



}
