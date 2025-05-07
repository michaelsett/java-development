package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    private Room room;

    void setUp() {
        room = new Room();
    }
@Test
    void testCheckInToCleanUnoccupiedRoom() {
        assertFalse(room.isOccupied());
        assertFalse(room.isDirty());
        assertTrue(room.isAvailable());
    }
    @Test
    void testCheckInToAvailable() {
        room.checkIn();
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
        assertFalse(room.isAvailable());
    }
    @Test
    void testCheckInTOccupiedRoomDoesNothing() {
        room.checkIn();
        room.checkIn();
        assertTrue(room.isOccupied());
        assertTrue(room.isOccupied());
    }
    @Test
    void testCheckInToDirtyRoomDoesNothing() {
        room.checkIn();
        room.checkout();
        room.checkIn();
        assertFalse(room.isOccupied());
    }
    @Test
    void testCheckoutMakesRoomVacantButStillDirty() {
        room.checkIn();
        room.checkout();
        assertFalse(room.isOccupied());
        assertTrue(room.isDirty());
    }
    @Test
    void testCleanRoomWhenVacant() {
        room.checkIn();
        room.checkout();
        room.cleanRoom();
        assertFalse(room.isDirty());
        assertFalse(room.isOccupied());
        assertTrue(room.isAvailable());
    }
    @Test
    void testCleanRoomWhenOccupiedDoesNothing() {
        room.checkIn();
        room.cleanRoom();
        assertTrue(room.isDirty());

    }

}