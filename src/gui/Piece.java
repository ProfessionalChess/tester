package gui;

public abstract class Piece {
    private boolean colour;
    private int coords;

    public Piece(boolean colour, int coords) {
        this.colour = colour;
        this.coords = coords;
    }

    public boolean isColour() {
        return colour;
    }

    public void setColor(boolean colour) {
        this.colour = colour;
    }

    public int getCoords() {
        return coords;
    }

    public void setCoords(int coords) {
        this.coords = coords;
    }



}//class
