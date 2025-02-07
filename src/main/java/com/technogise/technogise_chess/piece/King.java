package com.technogise.technogise_chess.piece;

import com.technogise.technogise_chess.model.Position;

public class King extends Piece {
    public King(Position position) {
        super(position);
    }

    @Override
    public int[][] getDirections() {
        return new int[][]{
                {1, 0}, {-1, 0},  // Horizontal
                {0, -1}, {0, 1},  // Vertical
                {-1, 1}, {1, -1}, // Main Diagonal
                {1, 1}, {-1, -1}  // Anti Diagonal
        };
    }

    @Override
    public boolean canMoveAcrossBoard() {
        return false;
    }
}
