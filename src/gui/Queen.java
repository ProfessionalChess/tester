package gui;

import java.awt.*;
import java.util.ArrayList;

public class Queen extends Piece{
    private ArrayList<Point> pM = new ArrayList<>();
    public Queen(boolean colour, int x, int y) {
        super(colour, x, y);
    }
    public void possibleMoves() {
        //hor
        int tempx = 1;
        while (tempx < 9){
            pM.add(new Point(tempx, loc.y));
            tempx++;
        }
        //ver
        int tempy = 1;
        while (tempy < 9){
            pM.add(new Point(loc.x, tempy));
            tempy++;
        }
        pDiag(loc.x, loc.y);
        for (int i = 0; i < pM.size(); i++) {
            System.out.println(pM);
        }

    }
    public void pDiag(int newX, int newY){
        if(newX > 0 && newX < 9 && newY > 0 && newY < 9){
            pM.add(new Point(newX, newY));
            pDiag(newX+1, newY+1);
        }
    }
}

