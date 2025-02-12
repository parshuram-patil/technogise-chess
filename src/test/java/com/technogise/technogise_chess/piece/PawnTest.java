package com.technogise.technogise_chess.piece;

import com.technogise.technogise_chess.model.PieceColor;
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
        Pawn pawn2 = new Pawn(position, PieceColor.BLACK);

        List<Position> possibleMoves = pawn.getPossibleMoves();
        List<Position> possibleMoves2 = pawn2.getPossibleMoves();

        List<Position> expectedMoves = List.of(
                new Position('A', 3),
                new Position('A', 4)
        );
        assertTrue(position.isValid());
        assertEquals(2, possibleMoves.size());
        assertEquals(expectedMoves, possibleMoves);


        List<Position> expectedMoves2 = List.of(
                new Position('A', 1)
        );
        assertEquals(1, possibleMoves2.size());
        assertEquals(expectedMoves2, possibleMoves2);
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

    @Test
    void shouldMoveTwoPositionsAtStart() {
        Position position = new Position('A', 2);
        Pawn pawn = new Pawn(position);

        List<Position> possibleMoves = pawn.getPossibleMoves();

        assertEquals(2, possibleMoves.size());
    }

    @Test
    void shouldCreateWhitePawn() {
        Position position = new Position('C', 3);

        Pawn pawn1 = new Pawn(position);
        Pawn pawn2 = new Pawn(position, PieceColor.WHITE);

        assertEquals(PieceColor.WHITE, pawn1.color);
        assertEquals(PieceColor.WHITE, pawn2.color);
    }

    @Test
    void shouldCreateBlackPawn() {
        Position position = new Position('C', 3);

        Pawn pawn = new Pawn(position, PieceColor.BLACK);

        assertEquals(PieceColor.BLACK, pawn.color);
    }
}