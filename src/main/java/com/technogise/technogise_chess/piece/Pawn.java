package com.technogise.technogise_chess.piece;

import com.technogise.technogise_chess.model.PieceColor;
import com.technogise.technogise_chess.model.Position;

public class Pawn extends Piece {

    public Pawn(Position position) {
        super(position);
    }

    public Pawn(Position position, PieceColor color) {
        super(position, color);
    }

    @Override
    public int[][] getDirections() {

        if ((position.row() == 2 && PieceColor.WHITE.equals(color)) || (position.row() == 7 && PieceColor.BLACK.equals(color))) {
            return new int[][]{
                    {0, color.value}, {0, 2 * color.value}  // Vertical UP
            };
        } else {
            return new int[][]{
                    {0, color.value} // Vertical UP
            };
        }
    }

    @Override
    public boolean canMoveAcrossBoard() {
        return false;
    }
}
