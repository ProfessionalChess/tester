package gui;

import javax.swing.*;
import java.util.ArrayList;

public class chessMain {

    public static ArrayList<Piece> pieces = new ArrayList();

    public static void main(String[] args) {
        JFrame frame = new menu();

        pieces.add(new Pawn(true, 12));

    }//end main
}//end class
