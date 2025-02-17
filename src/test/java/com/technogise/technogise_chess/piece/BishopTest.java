package com.technogise.technogise_chess.piece;

import com.technogise.technogise_chess.model.PieceColor;
import com.technogise.technogise_chess.model.Position;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BishopTest {

    @Test
    void shouldCreateBishop() {
        Position position = new Position('B', 8);
        Bishop whiteBishop = new Bishop(position, PieceColor.WHITE);
        Bishop blackBishop = new Bishop(position, PieceColor.BLACK);

        assertNotNull(whiteBishop);
        assertEquals(whiteBishop.position, position);
        assertEquals(whiteBishop.color, PieceColor.WHITE);
        assertNotNull(blackBishop);
        assertEquals(blackBishop.position, position);
        assertEquals(blackBishop.color, PieceColor.BLACK);
    }

    @Test
    void shouldNotCreatePieceWithInvalidPosition() {
        Position position = new Position('C', -1);

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> new Bishop(position));
        assertEquals("Invalid Position: C-1", ex.getMessage());
    }

    @Test
    void shouldGetMovesForValidPosition_1() {
        Position position = new Position('G', 8);
        Bishop bishop = new Bishop(position);

        List<Position> possibleMoves = bishop.getPossibleMoves();

        List<Position> expectedMoves = List.of(
                new Position('H', 7),
                new Position('F', 7),
                new Position('E', 6),
                new Position('D', 5),
                new Position('C', 4),
                new Position('B', 3),
                new Position('A', 2)
        );

        assertTrue(position.isValid());
        assertEquals(7, possibleMoves.size());
        assertEquals(expectedMoves, possibleMoves);
    }

    @Test
    void shouldGetMovesForValidPosition_2() {
        Position position = new Position('F', 4);
        Bishop bishop = new Bishop(position);

        List<Position> possibleMoves = bishop.getPossibleMoves();

        List<Position> expectedMoves = List.of(
                new Position('E', 5),
                new Position('D', 6),
                new Position('C', 7),
                new Position('B', 8),
                new Position('G', 3),
                new Position('H', 2),
                new Position('G', 5),
                new Position('H', 6),
                new Position('E', 3),
                new Position('D', 2),
                new Position('C', 1)
        );

        assertTrue(position.isValid());
        assertEquals(11, possibleMoves.size());
        assertEquals(expectedMoves, possibleMoves);
    }

    @Test
    void shouldGetMovesForValidPosition_3() {
        Position position = new Position('H', 8);
        Bishop bishop = new Bishop(position);

        List<Position> possibleMoves = bishop.getPossibleMoves();

        List<Position> expectedMoves = List.of(
                new Position('G', 7),
                new Position('F', 6),
                new Position('E', 5),
                new Position('D', 4),
                new Position('C', 3),
                new Position('B', 2),
                new Position('A', 1)
        );
        assertTrue(position.isValid());
        assertEquals(7, possibleMoves.size());
        assertEquals(expectedMoves, possibleMoves);
    }

}