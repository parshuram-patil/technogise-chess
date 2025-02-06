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
        if (position.row() < 8) {
            moves.add(new Position(position.column(), position.row() + 1));
        }

        return moves;
    }
}
