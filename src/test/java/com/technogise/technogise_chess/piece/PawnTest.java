package com.technogise.technogise_chess.piece;

import com.technogise.technogise_chess.model.Position;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PawnTest {
    @Test
    void shouldCreatePawn() {
        Position position = new Position('A', 1);
        Pawn pawn = new Pawn(position);

        assertNotNull(pawn);
        assertEquals(pawn.position, position);
    }

    @Test
    void shouldGetMovesForValidPosition() {
        Position position = new Position('A', 2);
        Pawn pawn = new Pawn(position);

        List<Position> possibleMoves = pawn.getPossibleMoves();

        List<Position> expectedMoves = List.of(
                new Position('A', 3)
        );
        assertTrue(position.isValid());
        assertEquals(1, possibleMoves.size());
        assertEquals(expectedMoves, possibleMoves);
    }

    @Test
    void shouldNotMoveForValidPosition() {
        Position position = new Position('G', 8);
        Pawn pawn = new Pawn(position);

        List<Position> possibleMoves = pawn.getPossibleMoves();


        assertTrue(position.isValid());
        assertEquals(List.of(), possibleMoves);
    }

    @Test
    void shouldGetMovesForInValidPosition() {
        Position position = new Position('A', 9);
        Pawn pawn = new Pawn(position);

        List<Position> possibleMoves = pawn.getPossibleMoves();

        assertFalse(position.isValid());
        assertEquals(List.of(), possibleMoves);
    }

}