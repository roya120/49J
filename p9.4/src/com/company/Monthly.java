package com.company;

public class Monthly extends Appointment {


    public Monthly(String desc, int y, int m, int d) {
        super(desc, y, m, d);
    }


    public boolean occursOn(int year, int month, int day) {
        if (getDay() == day) {

            return true;
        }
        else {
            return false;
        }

    }

    public String message() {


        return description + " see you on day " + getDay() + " of the month " + getMonth();


    }
}