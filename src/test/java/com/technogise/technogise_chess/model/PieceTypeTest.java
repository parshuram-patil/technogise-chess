package com.technogise.technogise_chess.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PieceTypeTest {

    @Test
    void shouldMatchTypeCount() {
        assertEquals(3, PieceType.values().length);
    }

    @Test
    void shouldCreateTypeFromUpperCaseString() {
        assertEquals(PieceType.KING, PieceType.valueOf("KiNG".toUpperCase()));
        assertEquals(PieceType.QUEEN, PieceType.valueOf("queen".toUpperCase()));
        assertEquals(PieceType.PAWN, PieceType.valueOf("PAWN"));
    }


}