package com.company;

import com.company.Loading.LoadFiles;
import com.company.Loading.WindowsFiles;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.*;
import javax.swing.JPanel;



public class PlayArea extends JPanel {
    public PlayArea() {
        String playAreaW = WindowsFiles.playAreaW;
        int width=Integer.parseInt(playAreaW);
        String playAreaH = WindowsFiles.playAreaH;
        int height=Integer.parseInt(playAreaH);
        setPreferredSize(new Dimension(width, height));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        Dimension sizeP = getSize();
        String playAreaW = WindowsFiles.playAreaW;
        int width=Integer.parseInt(playAreaW);
        String playAreaH = WindowsFiles.playAreaH;
        int height=Integer.parseInt(playAreaH);

        String spaceShipX = LoadFiles.spaceShipX;
        int x=Integer.parseInt(spaceShipX);
        String spaceShipY = LoadFiles.spaceShipY;
        int y=Integer.parseInt(spaceShipY);
        String spaceShipSize = LoadFiles.spaceShipSize;
        int k=Integer.parseInt(spaceShipSize);
        String asteroidX = LoadFiles.asteroidX;
        int aX=Integer.parseInt(asteroidX);
        String asteroidY = LoadFiles.asteroidY;
        int aY=Integer.parseInt(asteroidY);
        String asteroidSize = LoadFiles.asteroidSize;
        int aK=Integer.parseInt(asteroidSize);
        int hel=1000;
        int h=hel*sizeP.height/height;
        int w=hel*sizeP.width/width;
        Ellipse2D circle = new Ellipse2D.Double(aX*w/hel, aY*h/hel, aK*w/hel, aK*h/hel);
        int xPoly[] = {(x-k)*w/hel,x*w/hel,(x+k)*w/hel,x*w/hel};
        int yPoly[] = {(y+2*k)*h/hel,y*h/hel,(y+2*k)*h/hel,(y+k)*h/hel};

        System.out.println(w);
        Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);
        g2d.fill(circle);
        g2d.setColor(Color.BLACK);
        g2d.draw(circle);
        g2d.fillPolygon(poly);
        g2d.setColor(Color.BLUE);
        g2d.draw(poly);
    }
}