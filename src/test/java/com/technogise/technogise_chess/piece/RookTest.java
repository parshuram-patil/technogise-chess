package com.technogise.technogise_chess.piece;

import com.technogise.technogise_chess.model.PieceColor;
import com.technogise.technogise_chess.model.Position;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RookTest {

    @Test
    void shouldCreateRook() {
        Position position = new Position('H', 1);
        Rook whiteRook = new Rook(position, PieceColor.WHITE);
        Rook blackRook = new Rook(position, PieceColor.BLACK);

        assertNotNull(whiteRook);
        assertEquals(whiteRook.position, position);
        assertEquals(whiteRook.color, PieceColor.WHITE);
        assertNotNull(blackRook);
        assertEquals(blackRook.position, position);
        assertEquals(blackRook.color, PieceColor.BLACK);
    }

    @Test
    void shouldNotCreatePieceWithInvalidPosition() {
        Position position = new Position('$', 5);

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> new Rook(position));
        assertEquals("Invalid Position: $5", ex.getMessage());
    }

    @Test
    void shouldGetMovesForValidPosition_1() {
        Position position = new Position('H', 1);
        Rook rook = new Rook(position);

        List<Position> possibleMoves = rook.getPossibleMoves();

        List<Position> expectedMoves = List.of(
                new Position('G', 1),
                new Position('F', 1),
                new Position('E', 1),
                new Position('D', 1),
                new Position('C', 1),
                new Position('B', 1),
                new Position('A', 1),
                new Position('H', 2),
                new Position('H', 3),
                new Position('H', 4),
                new Position('H', 5),
                new Position('H', 6),
                new Position('H', 7),
                new Position('H', 8)
        );

        assertTrue(position.isValid());
        assertEquals(14, possibleMoves.size());
        assertEquals(expectedMoves, possibleMoves);
    }

    @Test
    void shouldGetMovesForValidPosition_2() {
        Position position = new Position('E', 4);
        Rook rook = new Rook(position);

        List<Position> possibleMoves = rook.getPossibleMoves();

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
                new Position('E', 8)
        );

        assertTrue(position.isValid());
        assertEquals(14, possibleMoves.size());
        assertEquals(expectedMoves, possibleMoves);
    }

    @Test
    void shouldGetMovesForValidPosition_3() {
        Position position = new Position('D', 7);
        Rook rook = new Rook(position);

        List<Position> possibleMoves = rook.getPossibleMoves();

        List<Position> expectedMoves = List.of(
                new Position('E', 7),
                new Position('F', 7),
                new Position('G', 7),
                new Position('H', 7),
                new Position('C', 7),
                new Position('B', 7),
                new Position('A', 7),
                new Position('D', 6),
                new Position('D', 5),
                new Position('D', 4),
                new Position('D', 3),
                new Position('D', 2),
                new Position('D', 1),
                new Position('D', 8)
        );
        assertTrue(position.isValid());
        assertEquals(14, possibleMoves.size());
        assertEquals(expectedMoves, possibleMoves);
    }

}