package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.company.Loading.WindowsFiles;


/**
 * Klasa reprezentująca tabele wyników
 */
public class ScoresWindow extends JDialog {
    /**
     * Konstruktor
     */
    Map<Integer,String> scores;

    {
        scores = new TreeMap<>();
        scores.put(21,"Player One");
        scores.put(4217,"Player two");
    }
    public ScoresWindow(JFrame owner){
        super(owner,"Scores",true);
        String scoreWindowW = WindowsFiles.scoreWindowW;
        int width=Integer.parseInt(scoreWindowW);
        String scoreWindowH = WindowsFiles.scoreWindowH;
        int height=Integer.parseInt(scoreWindowH);
        setSize(width,height);
        launchScoresWindow(scores);
    }

    /**
     * Funkcja uruchamiająca okno wyników
     * @param scores
     */
    public void launchScoresWindow(Map scores)
    {

        addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
            }
        });
        /**
         * Panel Zawierający Labele wyników
         */
        JPanel p = new JPanel(new GridBagLayout());
        /**
         * Label przechowywyjący wynik
         */
        JLabel label=null;
        /**
         * Przycisk Cancel
         */


        JButton bCancel=null;
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10,10,10,10);
        Set<Map.Entry<Integer,String>> entrySet = scores.entrySet();
        Integer i=0,j=0;
        for(int a=0;a<entrySet.size();a++){
            for(Map.Entry<Integer, String> entry: entrySet) {
                i++;
                if(i==entrySet.size()-a) {
                    j++;
                    c.gridx=0;
                    c.gridy=j;
                    label = new JLabel(j.toString() + "   " + entry.getKey());
                    p.add(label,c);
                    c.gridx=1;
                    c.gridy=j;
                    label = new JLabel(entry.getValue());
                    p.add(label,c);
                }
            }
            i=0;

        }
        c.gridx=1;
        c.gridy=j+1;
        bCancel=new JButton("Cancel");
        /**
         * Działania podejmowane po wybraniu opcji Cancel
         */
        bCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        p.add(bCancel,c);
        add(p);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
