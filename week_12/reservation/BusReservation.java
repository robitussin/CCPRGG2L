public class BusReservation implements Runnable {

    private int totalSeatsAvailable = 2;

    public void run() {

        PassengerThread pt = (PassengerThread) Thread.currentThread();

        boolean ticketsBooked = this.bookTickets(pt.getSeatsNeeded(), pt.getName());

        if (ticketsBooked) {
            System.out
                    .println(
                            "Congratulations " + Thread.currentThread().getName()
                                    + ", the number of seats you have requested:  "
                                    + pt.getSeatsNeeded() + " are booked!");
        } else {
            System.out
                    .println("Sorry " + Thread.currentThread().getName() + ", the number of seats you have requested:  "
                            + pt.getSeatsNeeded() + " are not available!");
        }
    }

    public synchronized boolean bookTickets(int seats, String name) {

        System.out.println(
                "Welcome to Bus Company! " + Thread.currentThread().getName()
                        + ", the number of tickets available are: "
                        + this.getTotalSeatsAvailable());

        if (seats > this.getTotalSeatsAvailable()) {
            return false;
        } else {
            totalSeatsAvailable = totalSeatsAvailable - seats;

            return true;
        }
    }

    private int getTotalSeatsAvailable() {
        return totalSeatsAvailable;
    }
}
