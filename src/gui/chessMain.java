//NEED To Know where each piece is to check if moves are possible

package gui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class chessMain {

    public static ArrayList<Piece> pieces = new ArrayList();
    public static Point[] grid = new Point[64];


    public static void main(String[] args) {
        //getting a grid of all available points
        for (int i = 0; i < grid.length; i++) {
          grid[i] = new Point();
        }
        int index = 0;
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                grid[index].x = i;
                grid[index].y = j;
                index++;
            }
        }
        //end of points
        //pieces.add(new Pawn(true, 1,7));
        pieces.add(new Queen(true, 4,5));
        pieces.add(new Rook(true, 4,5));
         pieces.add(new Bishop(true, 4,5));
        pieces.get(2).possibleMoves();
        pieces.get(2).printPossible();
        JFrame frame = new menu();

    }//end main
}//end class
