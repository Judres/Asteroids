package com.company;

import javax.swing.*;
import javax.xml.stream.Location;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * Klasa opisujaca Menu Główne
 */

public class MenuWindow extends JFrame {
    /**
     * Konstruktor domyślny
     */
    public MenuWindow(){
        super("Okno");
        launchMenu();
    }


    /**
     * Funkja pokazująca główne menu
     */
    public void launchMenu(){

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
            }
        });
        /**
         * Panel zawierajcy przyciski
         */
        JPanel p = new JPanel(new GridBagLayout());
        /**
         * Przycisk Play
         */
        JButton bStart=new JButton("Play");
        /**
         * Przycisk Scores
         */
        JButton bScores=new JButton("Scores");
        /**
         * Przycisk Exit
         */
        JButton bExit=new JButton("Exit");
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10,10,10,10);
        c.gridx=0;
        c.gridy=1;
        p.add(bStart,c);
        c.gridx=0;
        c.gridy=2;
        p.add(bScores,c);
        c.gridx=0;
        c.gridy=3;
        p.add(bExit,c);




        MenuWindow mw=this;
        /**
         * Działania podejmowane po wybraniu opcji Play
         */
        bStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NameWindow nameWindow=new NameWindow(mw);

            }
        });
        /**
         * Działania podejmowane po wybraniu opcji Scores
         */

        bScores.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScoresWindow scoresWindow=new ScoresWindow(mw);
            }
        }));
        /**
         * Działania podejmowane po wybraniu opcji Exit
         */
        bExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        add(p,BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                setVisible(true);
                // File file = new File(scores.txt);
                //Scanner in =new Scanner(file);

            }
            public  void load()throws FileNotFoundException{
                 File file = new File("scores.txt");
                 Scanner in =new Scanner(file);
                 
            }
        });
    }
    }

