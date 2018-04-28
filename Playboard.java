package com.company;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Playboard extends JFrame {
    public Playboard() {
        super("Game");
        JPanel panel = new PlayArea();

        add(panel);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
