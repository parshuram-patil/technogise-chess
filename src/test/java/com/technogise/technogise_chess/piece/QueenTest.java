package com.technogise.technogise_chess.piece;

import com.technogise.technogise_chess.model.Position;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QueenTest {

    @Test
    void shouldCreateQueen() {
        Position position = new Position('B', 8);
        Queen queen = new Queen(position);

        assertNotNull(queen);
        assertEquals(queen.position, position);
    }

    @Test
    void shouldNotCreatePieceWithInvalidPosition() {
        Position position = new Position('Z', 0);

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> new Queen(position));
        assertEquals("Invalid Position: Z0", ex.getMessage());
    }

    @Test
    void shouldGetMovesForValidPosition_1() {
        Position position = new Position('A', 1);
        Queen queen = new Queen(position);

        List<Position> possibleMoves = queen.getPossibleMoves();

        List<Position> expectedMoves = List.of(
                new Position('B', 1),
                new Position('C', 1),
                new Position('D', 1),
                new Position('E', 1),
                new Position('F', 1),
                new Position('G', 1),
                new Position('H', 1),
                new Position('A', 2),
                new Position('A', 3),
                new Position('A', 4),
                new Position('A', 5),
                new Position('A', 6),
                new Position('A', 7),
                new Position('A', 8),
                new Position('B', 2),
                new Position('C', 3),
                new Position('D', 4),
                new Position('E', 5),
                new Position('F', 6),
                new Position('G', 7),
                new Position('H', 8)
        );

        assertTrue(position.isValid());
        assertEquals(21, possibleMoves.size());
        assertEquals(expectedMoves, possibleMoves);
    }

    @Test
    void shouldGetMovesForValidPosition_2() {
        Position position = new Position('E', 4);
        Queen queen = new Queen(position);

        List<Position> possibleMoves = queen.getPossibleMoves();

        List<Position> expectedMoves = List.of(
                new Position('F', 4),
                new Position('G', 4),
                new Position('H', 4),
                new Position('D', 4),
                new Position('C', 4),
                new Position('B', 4),
                new Position('A', 4),
                new Position('E', 3),
                new Position('E', 2),
                new Position('E', 1),
                new Position('E', 5),
                new Position('E', 6),
                new Position('E', 7),
                new Position('E', 8),
                new Position('D', 5),
                new Position('C', 6),
                new Position('B', 7),
                new Position('A', 8),
                new Position('F', 3),
                new Position('G', 2),
                new Position('H', 1),
                new Position('F', 5),
                new Position('G', 6),
                new Position('H', 7),
                new Position('D', 3),
                new Position('C', 2),
                new Position('B', 1)
        );

        assertTrue(position.isValid());
        assertEquals(27, possibleMoves.size());
        assertEquals(expectedMoves, possibleMoves);
    }

    @Test
    void shouldGetMovesForValidPosition_3() {
        Position position = new Position('G', 5);
        Queen queen = new Queen(position);

        List<Position> possibleMoves = queen.getPossibleMoves();

        List<Position> expectedMoves = List.of(
                new Position('H', 5),
                new Position('F', 5),
                new Position('E', 5),
                new Position('D', 5),
                new Position('C', 5),
                new Position('B', 5),
                new Position('A', 5),
                new Position('G', 4),
                new Position('G', 3),
                new Position('G', 2),
                new Position('G', 1),
                new Position('G', 6),
                new Position('G', 7),
                new Position('G', 8),
                new Position('F', 6),
                new Position('E', 7),
                new Position('D', 8),
                new Position('H', 4),
                new Position('H', 6),
                new Position('F', 4),
                new Position('E', 3),
                new Position('D', 2),
                new Position('C', 1)
        );
        assertTrue(position.isValid());
        assertEquals(23, possibleMoves.size());
        assertEquals(expectedMoves, possibleMoves);
    }

}