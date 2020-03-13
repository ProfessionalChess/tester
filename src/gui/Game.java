package gui;

import java.awt.*;
import java.util.ArrayList;

public class Game {

    public Game(){
        for (int i = 0; i < chessMain.pieces.size(); i++) {
            chessMain.pieces.get(i).possibleMoves();
        }
        refinePossibleMoves();

    }
    public static void printPieces(){
        String b;
        for (int i = 0; i < chessMain.pieces.size(); i++) {
            b = "b";
            b += "" +   chessMain.pieces.get(i).getLoc().x + chessMain.pieces.get(i).getLoc().y;
            System.out.println(chessMain.pieces.get(i).getClass()+ "        " + b);
        }
    }
    public static String coordToButton(int x, int y){
        String b = "";
        b = "b" +  x + y;
        return b;
    }
    public void refinePossibleMoves(){
        refineWhitePawn();
        refineBlackPawn();
        refineQueen();
        refineRook();
        refineBishop();
        refineKnight();
        refineKing(chessMain.pieces.get(20));
    }
    public void refineWhitePawn(){

    }
    public void refineBlackPawn(){

    }
    public void refineQueen(){

    }
    public void refineRook(){

    }
    public void refineBishop(){

    }
    public void refineKnight(){

    }
    public void refineKing(Piece king){
        for (int i = 0; i < king.getpM().size(); i++) {
            if(chessMain.pieces.get(i).getLoc() == king.getpM().get(i)){
                king.removepM(i);
            }
        }

    }

}
