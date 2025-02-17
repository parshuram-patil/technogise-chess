package com.technogise.technogise_chess.piece;

import com.technogise.technogise_chess.model.PieceColor;
import com.technogise.technogise_chess.model.Position;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HorseTest {

    @Test
    void shouldCreateHorse() {
        Position position = new Position('F', 5);
        Horse whiteHorse = new Horse(position);
        Horse blackHorse = new Horse(position, PieceColor.BLACK);

        assertNotNull(whiteHorse);
        assertEquals(whiteHorse.position, position);
        assertEquals(whiteHorse.color, PieceColor.WHITE);

        assertNotNull(blackHorse);
        assertEquals(blackHorse.position, position);
        assertEquals(blackHorse.color, PieceColor.BLACK);
    }

    @Test
    void shouldNotCreatePieceWithInvalidPosition() {
        Position position = new Position('J', 9);

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> new Horse(position));
        assertEquals("Invalid Position: J9", ex.getMessage());
    }

    @Test
    void shouldGetMovesForValidPosition_1() {
        Position position = new Position('H', 1);
        Horse horse = new Horse(position);

        List<Position> possibleMoves = horse.getPossibleMoves();

        List<Position> expectedMoves = List.of(
                new Position('F', 2),
                new Position('G', 3)
        );
        assertTrue(position.isValid());
        assertEquals(2, possibleMoves.size());
        assertEquals(expectedMoves, possibleMoves);
    }

    @Test
    void shouldGetMovesForValidPosition_2() {
        Position position = new Position('D', 8);
        Horse horse = new Horse(position);

        List<Position> possibleMoves = horse.getPossibleMoves();

        List<Position> expectedMoves = List.of(
                new Position('F', 7),
                new Position('B', 7),
                new Position('C', 6),
                new Position('E', 6)
        );
        assertTrue(position.isValid());
        assertEquals(4, possibleMoves.size());
        assertEquals(expectedMoves, possibleMoves);
    }

    @Test
    void shouldGetMovesForValidPosition_3() {
        Position position = new Position('E', 3);
        Horse horse = new Horse(position);

        List<Position> possibleMoves = horse.getPossibleMoves();

        List<Position> expectedMoves = List.of(
                new Position('G', 2),
                new Position('G', 4),
                new Position('C', 4),
                new Position('C', 2),
                new Position('D', 1),
                new Position('F', 1),
                new Position('F', 5),
                new Position('D', 5)
        );
        assertTrue(position.isValid());
        assertEquals(8, possibleMoves.size());
        assertEquals(expectedMoves, possibleMoves);
    }
}