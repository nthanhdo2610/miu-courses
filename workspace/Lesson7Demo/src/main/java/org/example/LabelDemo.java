package org.example;

import java.awt.*;

public class LabelDemo {
    public static void main(String args[]){

        // creating the object of Frame class and Label class
        Frame f = new Frame("Label example");
        Label l1, l2;

        // initializing the labels
        l1 = new Label ("First Label.", 1);
        l1.setBackground(Color.CYAN);
        l2 = new Label ("Second Label.");

        // set the location of label
        l1.setBounds(50, 100, 100, 30);
        l2.setBounds(50, 150, 100, 30);

        // adding labels to the frame
        f.add(l1);
        f.add(l2);

        // setting size, layout and visibility of frame
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

}
