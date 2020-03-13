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
        for (int i = 0; i < 8; i++) {
            pieces.add(new Pawn(true, i+1,7));
        }
        for (int i = 0; i < 8; i++) {
            pieces.add(new Pawn(false, i+1,2));
        }
        pieces.add(new Rook(true, 1,8));
        pieces.add(new Knight(true, 2,8));
        pieces.add(new Bishop(true, 3,8));
        pieces.add(new Queen(true, 4,8));
        pieces.add(new King(true, 5,8));
        pieces.add(new Bishop(true, 6,8));
        pieces.add(new Knight(true, 7,8));
        pieces.add(new Rook(true, 8,8));

        pieces.add(new Rook(false, 1,2));
        pieces.add(new Knight(false, 2,2));
        pieces.add(new Bishop(false, 3,2));
        pieces.add(new Queen(false, 4,2));
        pieces.add(new King(false, 5,2));
        pieces.add(new Bishop(false, 6,2));
        pieces.add(new Knight(false, 7,2));
        pieces.add(new Rook(false, 8,2));

        JFrame frame = new menu();

    }//end main
}//end class
