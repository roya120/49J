package com.company;

import javax.swing.*;
import java.awt.*;

class OlympicRingComponent extends JComponent {

    public void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));

        g2.setColor(Color.BLUE);
        g2.drawOval(30,30,60,60);

        g2.setColor(Color.BLACK);
        g2.drawOval(90,30,60,60);

        g2.setColor(Color.RED);
        g2.drawOval(150,30,60,60);

        g2.setColor(Color.YELLOW);
        g2.drawOval(60,60,60,60);

        g2.setColor(Color.GREEN);
        g2.drawOval(120,60,60,60);


    }


}

