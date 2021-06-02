package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.awt.*;

import javax.swing.*;


public class Main {

    public static <E extends Iterable> void print(E e) {
        Iterator<E> itr = e.iterator();
        if(itr.hasNext()) {
            System.out.print(itr.next());
            while(itr.hasNext()) {
                System.out.print(", " + itr.next());
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Trying with integers");
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(100);
        a.add(2);
        a.add(3);
        a.add(60);
        print(a);
        System.out.println();

        System.out.println("Trying with strings");
        ArrayList<String> b = new ArrayList<String>();
        b.add("a");
        b.add("b");
        b.add("m");
        print(b);

    }
}




