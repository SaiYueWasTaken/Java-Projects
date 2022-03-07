package Pieces;

import java.util.ArrayList;

public class Pawn extends BasePiece{

    public Pawn(int pieceColor, int x, int y) {
        super(pieceColor, x, y);
    }

    @Override
    public boolean legalMove(int x, int y) {
        if (this.pos.get(0) - x != 0) {
            return false;
        } return true;
    }

    @Override
    public ArrayList<Integer> layPattern(int x, int y) {
        // TODO Auto-generated method stub
        return null;
    }

    public static void main(String[] args) {
        BasePiece p1 = new Pawn(0, 1, 1);
        System.out.println(p1.getPieceName());
        System.out.println(p1.getPieceColor());
        
        
    }
    
}
