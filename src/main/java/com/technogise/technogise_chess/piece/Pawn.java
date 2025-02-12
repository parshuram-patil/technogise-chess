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
        int rowDirection = color.direction;
        int[][] directions;

        if (position.row() == color.firstRow) {
            directions = new int[][]{{0, rowDirection}, {0, 2 * rowDirection}}; // First move
        } else {
            directions = new int[][]{{0, rowDirection}}; //Subsequent move
        }

        return directions;
    }

    @Override
    public boolean canMoveAcrossBoard() {
        return false;
    }
}
