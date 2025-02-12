package com.technogise.technogise_chess.model;

public enum PieceColor {
    WHITE(1, 2),
    BLACK(-1, 7);

    public final int direction;
    public final int firstRow;

    PieceColor(int value, int firstRow) {
        this.direction = value;
        this.firstRow = firstRow;
    }
}
