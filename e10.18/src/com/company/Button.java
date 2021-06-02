package com.company;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JLabel;

import javax.swing.JFrame;

import javax.swing.JPanel;

import java.awt.*;

public class Button {



    static int click1 = 0;

    static int click2 = 0;

    public static void main(String[] args)

    {



        JFrame frame = new JFrame("");

        JPanel panel = new JPanel();

        JButton button1 = new JButton("Button 1");

        panel.add(button1);

        JButton button2 = new JButton("Button 2");

        panel.add(button2);

        JLabel label = new JLabel(" Label ");

        panel.add(label);

        frame.add(panel);


        button1.addActionListener(new ActionListener() {

                  public void actionPerformed(ActionEvent e) {
                      click1++;

                      System.out.println("B1, I  was clicked  " + click1 + " times");

                      label.setText("Buton1 clicked  " + click1 + " times");

                  }
        }
        );
        button2.addActionListener(new ActionListener() {

                 public void actionPerformed(ActionEvent e) {
                     click2++;

                     System.out.println("B2, I  was clicked  " + click2 + " times");

                     label.setText("Buton2 clicked " + click2 + " times");

                 }
        }
        );
        frame.setSize(550, 200);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);


    }
}





