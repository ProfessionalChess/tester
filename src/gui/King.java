package gui;

import java.awt.*;
import java.util.ArrayList;

public class King extends Piece {
    private ArrayList<Point> pM = new ArrayList<>();

    public King(boolean colour, int x, int y) {

        super(colour, x,y);
    }

    public void possibleMoves() {
        Point[] tempPos = new Point[8];
        tempPos[0] = new Point(loc.x+0, loc.y-1);
        tempPos[1] = new Point(loc.x+1, loc.y-1);
        tempPos[2] = new Point(loc.x+1, loc.y+0);
        tempPos[3] = new Point(loc.x+1, loc.y+1);
        tempPos[4] = new Point(loc.x-0, loc.y+1);
        tempPos[5] = new Point(loc.x-1, loc.y+1);
        tempPos[6] = new Point(loc.x-1, loc.y-0);
        tempPos[7] = new Point(loc.x-1, loc.y-1);
        for (int i = 0; i < tempPos.length; i++) {
            if(tempPos[i].x > 0 && tempPos[i].x < 9 && tempPos[i].y > 0 && tempPos[i].y < 9){
                pM.add(new Point(tempPos[i]));
            }

        }
    }
    public void printPossible(){
        System.out.println(pM.size());
        for (int i = 0; i < pM.size(); i++) {
            System.out.println(pM.get(i));
        }
    }
}
