package gui;

import java.awt.*;
import java.util.ArrayList;

public class Rook extends Piece {
    private ArrayList<Point> pM = new ArrayList<>();
    public Rook(boolean colour, int x, int y) {

        super(colour, x, y);
    }

    public void possibleMoves() {
        //hor
        int tempx = 1;
        while (tempx < 9) {
            pM.add(new Point(tempx, loc.y));
            tempx++;
        }
        //ver
        int tempy = 1;
        while (tempy < 9) {
            pM.add(new Point(loc.x, tempy));
            tempy++;
        }
        for (int i = 0; i < pM.size(); i++) {
            if ((pM.get(i).x == loc.x) && (pM.get(i).y == loc.y)) {
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
}
