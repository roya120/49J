package com.company;

import java.awt.event.ActionEvent;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class ComboBox extends JFrame {
    JPanel panel;

    JComboBox background;

    String colors[] = {"RED", "GREEN", "BLUE"};

    public ComboBox() {
        setTitle("Combo Box");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        colorPanel();
        add(panel, BorderLayout.CENTER);
        setVisible(true);

    }


    public void colorPanel() {
        panel = new JPanel();
        background = new JComboBox(colors);


        background.addActionListener(new ComboBoxListener());

        panel.add(background);

    }

    private  class ComboBoxListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String chosenColor = (String) background.getSelectedItem();
            if (chosenColor.equals("GREEN")) {

                panel.setBackground(Color.GREEN);


            } else if (chosenColor.equals("BLUE")) {
                panel.setBackground(Color.BLUE);
            }
            else  {
                panel.setBackground(Color.RED);
            }
        }
    }
    public static void main(String[] args) {


        ComboBox cm = new ComboBox();
    }

}
