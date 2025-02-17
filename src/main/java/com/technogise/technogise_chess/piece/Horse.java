package com.technogise.technogise_chess.piece;

import com.technogise.technogise_chess.model.PieceColor;
import com.technogise.technogise_chess.model.Position;

public class Horse extends Piece {
    public Horse(Position position) {
        super(position);
    }

    public Horse(Position position, PieceColor color) {
        super(position, color);
    }

    @Override
    public int[][] getDirections() {
        return new int[][]{
                {2, -1}, {2, 1},   // 2 Right - Right & Left
                {-2, 1}, {-2, -1}, // 2 Left  - Right & Left
                {-1, -2}, {1, -2}, // 2 Down  - Right & Left
                {1, 2}, {-1, 2}    // 2 Up    - Right & Left
        };
    }

    @Override
    public boolean canMoveAcrossBoard() {
        return false;
    }
}
