package gui;
import java.awt.*;
import java.util.ArrayList;
public class Pawn extends Piece {

    private ArrayList<Point> pM = new ArrayList<>();
    boolean firstMove;
    public Pawn(boolean colour, int x, int y){
        super(colour, x, y);
        firstMove = true;

    }//endCons

    public void possibleMoves(){
       if(loc.y < 8 && loc.y > 1) {//rude way off not going off the board
           if (firstMove) {
               if (this.colour) {
                   pM.add(new Point(loc.x, (loc.y - 1)));
                   pM.add(new Point(loc.x, (loc.y - 2)));
               } else {
                   pM.add(new Point(loc.x, (loc.y + 1)));
                   pM.add(new Point(loc.x, (loc.y + 2)));
               }
           } else {
               if (this.colour) {
                   pM.add(new Point(loc.x, (loc.y - 1)));
               } else {
                   pM.add(new Point(loc.x, (loc.y + 1)));
               }
           }
       }

        for (int i = 0; i < pM.size(); i++) {
            System.out.println(pM.get(i));
            System.out.println(pM.size());
        }

    }
}//end class
