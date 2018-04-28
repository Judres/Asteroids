package com.company;

import com.company.Loading.WindowsFiles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * klasa reprezentująca Okno Nazwy
 */
public class NameWindow extends JDialog {
    /**
     * Konstruktor
     */
    public NameWindow(JFrame owner){
        super(owner,"NameWindow",true);
        String nameWindowW = WindowsFiles.nameWindowW;
        int width=Integer.parseInt(nameWindowW);
        String nameWindowH = WindowsFiles.nameWindowH;
        int height=Integer.parseInt(nameWindowH);
        setSize(width,height);
        launchNameWindow();
    }


    /**
     * Funkcja uruchamiajaca pytanie o Nick
     */
    public void launchNameWindow(){
        addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
            }
        });
        /**
         * Panel pytający o Nick
         */
        JPanel p = new JPanel(new GridBagLayout());
        /**
         * Label pytający o Nick
         */
        JLabel Op=null;
        /**
         * Miejsce na wpisanie nicku
         */
        JTextField tNick;
        /**
         * Przycisk Ok i Cancel
         */
        JButton bOk,bCancel;
        Op=new JLabel("What is your Nickname?");
        tNick = new JTextField("                                 ");
        bOk =new JButton("Ok");
        bCancel =new JButton("Cancel");
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10,10,10,10);
        c.gridx=1;
        c.gridy=1;
        p.add(Op,c);
        c.gridx=1;
        c.gridy=2;
        p.add(tNick,c);
        c.gridx=0;
        c.gridy=3;
        p.add(bOk,c);
        c.gridx=3;
        c.gridy=3;
        p.add(bCancel,c);
        add(p);
        /**
         * Działania podejmowane po wybraniu opcji Ok
         */
        bOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Playboard pb=new Playboard();
                dispose();
                getOwner().dispose();
            }
        });
        /**
         * Działania podejmowane po wybraniu opcji Cancel
         */
        bCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        pack();
        setLocationRelativeTo(null);

        setVisible(true);
    }

}
