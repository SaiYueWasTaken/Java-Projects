package Chessboard;

import Pieces.BasePiece;
import Pieces.Pawn;

public class Board {
    public static void main(String[] args) {
        BasePiece p1 = new Pawn(0, 1, 1);
        System.out.println(p1.getPieceName());
    }
}
