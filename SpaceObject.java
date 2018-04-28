package com.company;
import java.awt.Shape;

/**
 * Klasa opisująca obiekty związane z grą
 */
public class SpaceObject {

    /**
     * Zmienne
     */
    private Shape shape;
    private boolean alive;
    private double x,y;
    private double velX,velY;
    private double moveAngle,faceAngle;
    /**
     * Metody
     */

    public Shape getShape(){
        return shape;
    }
    public boolean isAlive(){
        return alive;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getvelX(){
        return velX;
    }
    public double getvelY(){
        return velY;
    }
    public double getMoveAngle(){
        return moveAngle;
    }
    public double getFaceAngle(){
        return faceAngle;
    }

    public void setShape(Shape shape){
        this.shape=shape;
    }
    public void setAlive(boolean alive) {
        this.alive=alive;
    }
    public void setX(double x){
        this.x=x;
    }
    public void incX(double i){
        this.x += i;
    }
    public void setY(double Y){
        this.y=y;
    }
    public void incY(double i){
        this.y += i;
    }
    public void setVelX(double velX) {
        this.velX=velX;
    }
    public void incVelX(double i){
        this.velX += i;
    }
    public void setVelY(double velY) {
        this.velY=velY;
    }
    public void incVelY(double i){
        this.velY += i;
    }
    public void setMoveAngle(double moveAngle) {
        this.moveAngle=moveAngle;
    }
    public void incMoveAngle(double i){
        this.moveAngle += i;
    }
    public void setFaceAngle(double faceAngle){
        this.faceAngle=faceAngle;
    }
    public void incFaceAngle(double i){
        this.faceAngle += i;
    }
    /**
     * Konstruktor domyślny
     */

    public SpaceObject(){
        setShape(null);
        setAlive(false);
        setX(0.0);
        setY(0.0);
        setVelX(0.0);
        setVelY(0.0);
        setMoveAngle(0.0);
        setFaceAngle(0.0);
    }
}
