package com.technogise.technogise_chess.piece;

import com.technogise.technogise_chess.model.Position;

import java.util.List;

public abstract class Piece {
    protected final Position position;

    public abstract List<Position> getPossibleMoves();

    public Piece(Position position) {
        this.position = position;
    }
}
