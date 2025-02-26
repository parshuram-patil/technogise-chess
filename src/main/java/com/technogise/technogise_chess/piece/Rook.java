package com.technogise.technogise_chess.piece;

import com.technogise.technogise_chess.model.PieceColor;
import com.technogise.technogise_chess.model.Position;

public class Rook extends Piece {
    public Rook(Position position) {
        super(position);
    }

    public Rook(Position position, PieceColor color) {
        super(position, color);
    }

    @Override
    public int[][] getDirections() {
        return new int[][]{
                {1, 0}, {-1, 0}, // Horizontal - Right & Left
                {0, -1}, {0, 1}, // Vertical - Down & Up
        };
    }

    @Override
    public boolean canMoveAcrossBoard() {
        return true;
    }
}
