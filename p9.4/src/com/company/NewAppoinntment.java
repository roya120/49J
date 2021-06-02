package com.company;
import java.util.ArrayList;

public class NewAppoinntment {

    ArrayList <Appointment> appointments;

    public NewAppoinntment()
    {
        appointments = new ArrayList<Appointment>();

    }
    public void makeAppointment(Appointment a)

    {

        appointments.add(a);

    }
    public void checkAppointments()

    {

        for(Appointment a : appointments)

            System.out.println(a.message());

    }
    public void show(int year, int month, int day)

    {
        for(Appointment a : appointments)

            if(a.occursOn(year, month, day))

                System.out.println(a.message());
    }

}
