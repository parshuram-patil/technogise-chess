package com.technogise.technogise_chess.model;

public record Position(char column, int row) {

    public boolean isValid() {
        return column >= 'A' && column <= 'H' && row >= 1 && row <= 8;
    }

    @Override
    public String toString() {
        return String.valueOf(column) + row;
    }
}
