package com.technogise.technogise_chess.piece;

import com.technogise.technogise_chess.model.Position;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {
    public Pawn(Position position) {
        super(position);
    }

    @Override
    public List<Position> getPossibleMoves() {
        List<Position> moves = new ArrayList<>();
        int[][] directions = {
                {0, 1} // Vertical UP
        };

        for (int[] dir : directions) {
            char newCol = (char) (position.column() + dir[0]);
            int newRow = position.row() + dir[1];
            Position move = new Position(newCol, newRow);
            if (move.isValid()) {
                moves.add(move);
            }
        }

        return moves;
    }
}
