package com.technogise.technogise_chess.piece;

import com.technogise.technogise_chess.model.Position;

public class Pawn extends Piece {

    public Pawn(Position position) {
        super(position);
    }

    @Override
    public int[][] getDirections() {
        return new int[][]{
                {0, 1} // Vertical UP
        };
    }

    @Override
    public boolean canMoveAcrossBoard() {
        return false;
    }
}
