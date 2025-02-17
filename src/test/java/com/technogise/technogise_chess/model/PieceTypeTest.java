package com.technogise.technogise_chess.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PieceTypeTest {

    @Test
    void shouldMatchTypeCount() {
        assertEquals(6, PieceType.values().length);
    }

    @Test
    void shouldCreateTypeFromUpperCaseString() {
        assertEquals(PieceType.KING, PieceType.valueOf("KiNG".toUpperCase()));
        assertEquals(PieceType.QUEEN, PieceType.valueOf("queen".toUpperCase()));
        assertEquals(PieceType.PAWN, PieceType.valueOf("PAWN"));
        assertEquals(PieceType.HORSE, PieceType.valueOf("HORSE"));
        assertEquals(PieceType.BISHOP, PieceType.valueOf("BISHOP"));
        assertEquals(PieceType.ROOK, PieceType.valueOf("ROOK"));

    }
}