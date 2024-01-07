package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CinemaTest {

    @Test
    public void testBookSeats() {
        Cinema cinema = new Cinema();

        cinema.bookSeats(2, 3, new int[]{5, 6, 7});
        assertTrue(cinema.checkAvailability(2, 3));

        cinema.bookSeats(2, 3, new int[]{6, 7, 8});
        assertFalse(cinema.checkAvailability(2, 3));

        cinema.cancelBooking(2, 3, new int[]{6, 7, 8});
        assertTrue(cinema.checkAvailability(2, 3));
    }

    @Test
    public void testCancelBooking() {
        Cinema cinema = new Cinema();

        cinema.bookSeats(1, 2, new int[]{1, 2, 3});
        assertTrue(cinema.checkAvailability(1, 3));

        cinema.cancelBooking(1, 2, new int[]{1, 2, 3});
        assertTrue(cinema.checkAvailability(1, 3));
    }

    @Test
    public void testCheckAvailability() {
        Cinema cinema = new Cinema();

        assertTrue(cinema.checkAvailability(0, 5));

        cinema.bookSeats(0, 1, new int[]{2, 3, 4});
        assertFalse(cinema.checkAvailability(0, 3));
    }

    @Test
    public void testPrintSeatingArrangement() {
        Cinema cinema = new Cinema();

        cinema.bookSeats(4, 7, new int[]{10, 11, 12});
        cinema.bookSeats(4, 8, new int[]{13, 14, 15});

        cinema.printSeatingArrangement(4);
    }
}
