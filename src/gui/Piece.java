package gui;

import java.awt.Point;
import java.util.ArrayList;

public abstract class Piece {
    public boolean colour;
    public int x;
    public int y;
    public Point loc;

    public Piece(boolean colour, int x, int y) {
        this.colour = colour;
        loc = new Point(x,y);
    }

    public boolean isColour() {
        return colour;
    }

    public void setColor(boolean colour) {
        this.colour = colour;
    }

    public void possibleMoves(){}

    public void printPossible(){}

    public Point getLoc(){
        return loc;
    }
    public ArrayList<Point> getpM(){
        return null;
    }
    public void removepM(int temp){

    }



}//class
