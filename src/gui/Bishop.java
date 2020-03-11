package gui;

import java.awt.*;
import java.util.ArrayList;

public class Bishop extends Piece {
    private ArrayList<Point> pM = new ArrayList<>();

    public Bishop(boolean colour, int x, int y) {

        super(colour, x,y);
    }

    public void possibleMoves() {
        dr(loc.x, loc.y);
        dl(loc.x, loc.y);
        ur(loc.x, loc.y);
        ul(loc.x, loc.y);
        for (int i = 0; i < pM.size(); i++) {
            if((pM.get(i).x == loc.x) && (pM.get(i).y == loc.y)){
                pM.remove(i);
                i--;
            }
        }

    }
    public void printPossible(){
        System.out.println(pM.size());
        for (int i = 0; i < pM.size(); i++) {
            System.out.println(pM.get(i));
        }
    }
    public void dr(int newX, int newY){
        if(newX > 0 && newX < 9 && newY > 0 && newY < 9){
            pM.add(new Point(newX, newY));
            dr(newX+1, newY+1);
        }
    }
    public void dl(int newX, int newY){
        if(newX > 0 && newX < 9 && newY > 0 && newY < 9){
            pM.add(new Point(newX, newY));
            dl(newX-1, newY+1);
        }
    }
    public void ur(int newX, int newY){
        if(newX > 0 && newX < 9 && newY > 0 && newY < 9){
            pM.add(new Point(newX, newY));
            ur(newX+1, newY-1);
        }
    }
    public void ul(int newX, int newY){
        if(newX > 0 && newX < 9 && newY > 0 && newY < 9){
            pM.add(new Point(newX, newY));
            ul(newX-1, newY-1);
        }
    }

}
