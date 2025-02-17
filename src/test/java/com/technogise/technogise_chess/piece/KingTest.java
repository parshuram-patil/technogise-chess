package com.technogise.technogise_chess.piece;

import com.technogise.technogise_chess.model.Position;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KingTest {

    @Test
    void shouldCreateKing() {
        Position position = new Position('E', 7);
        King king = new King(position);

        assertNotNull(king);
        assertEquals(king.position, position);
    }

    @Test
    void shouldNotCreatePieceWithInvalidPosition() {
        Position position = new Position('J', 5);

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> new King(position));
        assertEquals("Invalid Position: J5", ex.getMessage());
    }

    @Test
    void shouldGetMovesForValidPosition_1() {
        Position position = new Position('A', 1);
        King king = new King(position);

        List<Position> possibleMoves = king.getPossibleMoves();

        List<Position> expectedMoves = List.of(
                new Position('B', 1),
                new Position('A', 2),
                new Position('B', 2)
        );
        assertTrue(position.isValid());
        assertEquals(3, possibleMoves.size());
        assertEquals(expectedMoves, possibleMoves);
    }

    @Test
    void shouldGetMovesForValidPosition_2() {
        Position position = new Position('D', 5);
        King king = new King(position);

        List<Position> possibleMoves = king.getPossibleMoves();

        List<Position> expectedMoves = List.of(
                new Position('E', 5),
                new Position('C', 5),
                new Position('D', 4),
                new Position('D', 6),
                new Position('C', 6),
                new Position('E', 4),
                new Position('E', 6),
                new Position('C', 4)
        );
        assertTrue(position.isValid());
        assertEquals(8, possibleMoves.size());
        assertEquals(expectedMoves, possibleMoves);
    }

    @Test
    void shouldGetMovesForValidPosition_3() {
        Position position = new Position('H', 7);
        King king = new King(position);

        List<Position> possibleMoves = king.getPossibleMoves();

        List<Position> expectedMoves = List.of(
                new Position('G', 7),
                new Position('H', 6),
                new Position('H', 8),
                new Position('G', 8),
                new Position('G', 6)
        );
        assertTrue(position.isValid());
        assertEquals(5, possibleMoves.size());
        assertEquals(expectedMoves, possibleMoves);
    }
}