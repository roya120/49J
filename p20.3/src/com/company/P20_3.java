package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.security.InvalidParameterException;

import javax.swing.*;

public class P20_3 {


    public static void main(String[] args) {


        JFrame frame = new JFrame();

        frame.setTitle("Interest Calculator");
        frame.setSize(600,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));



        JLabel InitialSavingAmount = new JLabel("Amount in Saving");


        TextField InputSavingAmount = new TextField();


        JLabel InterestRate = new JLabel("Interest Rate");

        TextField InputInterestRate = new TextField();

        JLabel NumberYears = new JLabel("Number of years");

        TextField InputNumberOfYears = new TextField();


        TextArea Result = new TextArea();


        Button Calculate = new Button("Calculate");

        Calculate.addActionListener(new AbstractAction() {

            @Override

            public void actionPerformed(ActionEvent e) {


                Result.setText("");


                Double savingAmount = Double.parseDouble(InputSavingAmount.getText());

                Double interestRate = Double.parseDouble(InputInterestRate.getText());

                Double years = Double.parseDouble(InputNumberOfYears.getText());



                Result.append("Initial Amount: $" + savingAmount + "\n");


                double increment = (savingAmount * interestRate) / 100.0;



                for (int i = 1; i <= years; ++i) {


                    Result.append("After year " + i + ": $" + (savingAmount + increment * i) + "\n");

                }

            }


        });

        panel.add(InitialSavingAmount);

        panel.add(InputSavingAmount);

        panel.add(InterestRate);

        panel.add(InputInterestRate);

        panel.add(NumberYears);

        panel.add(InputNumberOfYears);

        panel.add(Calculate);

        panel.add(Result);

        frame.add(panel);

        frame.setVisible(true);

    }

}

