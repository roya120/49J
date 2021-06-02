package com.company;

import javax.swing.JComponent;
import javax.swing.JFrame;


public class OlympicRing extends JFrame {


    JComponent OlymComp;

    public OlympicRing() {
        OlymComp = new OlympicRingComponent();
        add(this.OlymComp);
        setSize(350, 250);
        setTitle("RING");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}