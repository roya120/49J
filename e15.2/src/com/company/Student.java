package com.company;

public class Student implements Comparable<Student>{
    String firstName;

    String lastName;

    int id;

    public Student(String first,String last,int is)

    {

        firstName = first;

        lastName = last;

        id = is;

    }

    public String getFirstName()

    {

        return firstName;

    }

    public String getLastName()

    {

        return lastName;

    }
    public void setLastName(String lastN)

    {

        lastName = lastN;

    }
    public int getID()

    {

        return id;

    }

    public void setFirstName(String fn)

    {

        firstName = fn;

    }



    public void setID(int i)

    {

        id = i;

    }

    public String toString()

    {

        return firstName + " " + lastName + " " + id;

    }

    public boolean equals(Student s)

    {

        if(firstName.equals(s.firstName) && lastName.equals(s.lastName) && id==s.id)

        {

            return true;

        }

        return false;

    }

    public int compareTo(Student s) {



        if (lastName.compareTo(s.lastName) == 0) {

            if (firstName.compareTo(s.firstName) == 0) {

                return this.id-s.id;

            }

            return firstName.compareTo(s.firstName);

        }

        return this.lastName.compareTo(s.lastName);

    }



    public int hashCode() {

        final int HASH_MULTIPLIER = 29;

        int h = HASH_MULTIPLIER * firstName.hashCode() + lastName.hashCode();

        h = HASH_MULTIPLIER * h + ((Integer) id).hashCode();

        return h;

    }

}
