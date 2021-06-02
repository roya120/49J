package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;


import javax.swing.JPanel;

public class Graph extends JPanel {



    private int size;

    private double[] values;

    private static  int WIDTH = 300;

    private static  int HEIGHT = 300;
    


    public Graph() {

        setPreferredSize(new Dimension(150, 300));

    }

    public void counting(int c) {

        values = new double[c];

        size = 0;


    }

    public void add(double v) {

        if (size == values.length) {

            return;

        }

        values[size] = v;

        size++;

        repaint();

    }

    public void paintComponent(Graphics g) {




        if (size == 0) {

            return;

        }

        double max = values[0];

        for (int i = 0; i < size; i++) {

            if (values[i] > max) {

                max = values[i];

            }

        }



        for (int i = 0; i < size; i++) {


            int width = 300 / values.length;

            int height = (int) (values[i] * getHeight() / max);




            g.setColor(Color.WHITE);

            g.fillRect(i * getWidth() / values.length, getHeight() - height, width, height);

            g.setColor(Color.black);

            g.drawRect(i * getWidth() / values.length, getHeight() - height, width, height);

            g.drawString(values[i]+"", i * getWidth() / values.length, getHeight() - height);

        }

    }

    public static void main(String[] args) {



        JFrame frame = new JFrame();

        frame.setTitle("Calculator");

        frame.setSize(500, 500);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));



        JLabel AmountInSavings = new JLabel("Amount in Savings Account");

        TextField InputAmountInSavings = new TextField();


        JLabel InterestRate = new JLabel("Interest Rate");

        TextField InputAnnualInterestRate = new TextField();

        JLabel NumberOfYears = new JLabel("Number of Years");


        TextField InputNumberOfYears = new TextField();



        TextArea Result = new TextArea();

        Result.setEditable(false);


        Button Calculate = new Button("Calculate");

        Graph savingsCalculatorViewer = new Graph();

        Calculate.addActionListener(new AbstractAction() {

            @Override

            public void actionPerformed(ActionEvent e) {


                Result.setText("");


                Double savingAmount = Double.parseDouble(InputAmountInSavings.getText());

                Double interestRate = Double.parseDouble(InputAnnualInterestRate.getText());

                Double years = Double.parseDouble(InputNumberOfYears.getText());

                savingsCalculatorViewer.counting(years.intValue());


                double increment = (savingAmount * interestRate) / 100.0;


                for (int i = 1; i <= years; ++i) {


                    savingsCalculatorViewer.add((savingAmount + increment * i));

                }

            }


        });


        panel.add(AmountInSavings);

        panel.add(InputAmountInSavings);

        panel.add(InterestRate);

        panel.add(InputAnnualInterestRate);

        panel.add(NumberOfYears);

        panel.add(InputNumberOfYears);


        panel.add(Calculate);


        panel.add(Result);

        panel.add(Box.createRigidArea(new Dimension(0,10)));


        panel.add(savingsCalculatorViewer);

        frame.add(panel);


        frame.setVisible(true);

    }

}
