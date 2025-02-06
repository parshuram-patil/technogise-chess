package com.technogise.technogise_chess.piece;

import java.util.List;

public abstract class Piece {
    protected int row;
    protected int col;

    public abstract List<String> getPossibleMoves();

    public Piece(String position) {
        this.row = 8 - Integer.parseInt(position.substring(1));
        this.col = position.charAt(0) - 'A';
    }

    protected boolean isOnBoard(int row, int col) {
        return row >= 0 && row < 8 && col >= 0 && col < 8;
    }
}
