package com.technogise.technogise_chess.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PieceColorTest {
    @Test
    void shouldMatchTypeCount() {
        assertEquals(2, PieceColor.values().length);
    }
}