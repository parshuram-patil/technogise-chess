package com.technogise.technogise_chess.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    @Test
    void shouldCreateValidPosition() {
        Position position = new Position('A', 1);

        assertNotNull(position);
        assertEquals('A', position.column());
        assertEquals(1, position.row());
        assertEquals("A1", position.toString());
        assertTrue(position.isValid());
    }

    @Test
    void shouldNotCreatePositionWithInvalidRow() {
        Position position = new Position('A', 9);
        assertFalse(position.isValid());
    }

    @Test
    void shouldNotCreatePositionWithInvalidColumn() {
        Position position = new Position('K', 2);
        assertFalse(position.isValid());
    }

}