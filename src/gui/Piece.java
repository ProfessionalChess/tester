package gui;

import java.awt.Point;

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






}//class
