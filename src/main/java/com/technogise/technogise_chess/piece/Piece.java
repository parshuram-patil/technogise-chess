package com.technogise.technogise_chess.piece;

import com.technogise.technogise_chess.model.Position;

import java.util.ArrayList;
import java.util.List;

public abstract class Piece {
    protected final Position position;

    public abstract int[][] getDirections();

    public abstract boolean canMoveAcrossBoard();

    public Piece(Position position) {
        this.position = position;
    }

    public List<Position> getPossibleMoves() {
        List<Position> moves = new ArrayList<>();
        for (int[] dir : getDirections()) {
            char newCol;
            int newRow;
            for (int i = 1; i <= (canMoveAcrossBoard() ? 7 : 1); i++) {
                newCol = (char) (position.column() + (dir[0] * i));
                newRow = position.row() + (dir[1] * i);
                Position move = new Position(newCol, newRow);
                if (!move.isValid()) break;
                moves.add(move);
            }
        }

        return moves;
    }

    ;
}
