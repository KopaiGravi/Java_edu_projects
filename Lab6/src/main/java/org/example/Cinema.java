package org.example;

public class Cinema {
    private static final int NUM_HALLS = 5;
    private static final int NUM_ROWS = 10;
    private static final int NUM_SEATS_PER_ROW = 20;

    private int[][][] seatingArrangement;

    public Cinema() {
        seatingArrangement = new int[NUM_HALLS][NUM_ROWS][NUM_SEATS_PER_ROW];
        initializeSeatingArrangement();
    }

    private void initializeSeatingArrangement() {
        for (int hall = 0; hall < NUM_HALLS; hall++) {
            for (int row = 0; row < NUM_ROWS; row++) {
                for (int seat = 0; seat < NUM_SEATS_PER_ROW; seat++) {
                    seatingArrangement[hall][row][seat] = 0;
                }
            }
        }
    }

    public void bookSeats(int hallNumber, int row, int[] seats) {
        for (int seat : seats) {
            if (seatingArrangement[hallNumber][row][seat] == 1) {
                System.out.println("Seat at Hall " + hallNumber + ", Row " + row + ", Seat " + seat + " is already booked.");
            } else {
                seatingArrangement[hallNumber][row][seat] = 1;
                System.out.println("Seat at Hall " + hallNumber + ", Row " + row + ", Seat " + seat + " has been booked.");
            }
        }
    }

    public void cancelBooking(int hallNumber, int row, int[] seats) {
        for (int seat : seats) {
            if (seatingArrangement[hallNumber][row][seat] == 0) {
                System.out.println("Seat at Hall " + hallNumber + ", Row " + row + ", Seat " + seat + " is not booked.");
            } else {
                seatingArrangement[hallNumber][row][seat] = 0;
                System.out.println("Booking for Seat at Hall " + hallNumber + ", Row " + row + ", Seat " + seat + " has been canceled.");
            }
        }
    }

    public boolean checkAvailability(int hallNumber, int numSeats) {
        for (int row = 0; row < NUM_ROWS; row++) {
            int consecutiveSeats = 0;
            for (int seat = 0; seat < NUM_SEATS_PER_ROW; seat++) {
                if (seatingArrangement[hallNumber][row][seat] == 0) {
                    consecutiveSeats++;
                    if (consecutiveSeats == numSeats) {
                        return true;
                    }
                } else {
                    consecutiveSeats = 0;
                }
            }
        }
        return false;
    }

    public void printSeatingArrangement(int hallNumber) {
        System.out.println("Seating arrangement for Hall " + hallNumber + ":");
        for (int row = 0; row < NUM_ROWS; row++) {
            for (int seat = 0; seat < NUM_SEATS_PER_ROW; seat++) {
                if (seatingArrangement[hallNumber][row][seat] == 0) {
                    System.out.print("O ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Cinema cinema = new Cinema();

        cinema.bookSeats(2, 3, new int[]{5, 6, 7});
        cinema.bookSeats(2, 3, new int[]{6, 7, 8});
        cinema.cancelBooking(2, 3, new int[]{6, 7, 8});

        boolean isAvailable = cinema.checkAvailability(2, 3);
        System.out.println("Is 3 consecutive seats available in Hall 2? " + isAvailable);

        cinema.printSeatingArrangement(2);
    }
}

