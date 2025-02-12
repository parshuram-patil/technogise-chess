package com.technogise.technogise_chess.model;

public enum PieceColor {
    WHITE(1),
    BLACK(-1);

    public final int value;

    PieceColor(int value) {
        this.value = value;
    }
}
