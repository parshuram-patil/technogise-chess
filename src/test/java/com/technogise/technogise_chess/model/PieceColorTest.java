package com.technogise.technogise_chess.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PieceColorTest {
    @Test
    void shouldMatchTypeCount() {
        assertEquals(2, PieceColor.values().length);
    }

    @Test
    void shouldValidate() {
        PieceColor black = PieceColor.BLACK;
        PieceColor white = PieceColor.WHITE;

        assertEquals(-1, black.direction);
        assertEquals(7, black.firstRow);
        assertEquals(1, white.direction);
        assertEquals(2, white.firstRow);
    }
}