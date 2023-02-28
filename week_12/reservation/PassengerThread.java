public class PassengerThread extends Thread {

    private int seatsNeeded;

    public PassengerThread(int seats, Runnable target, String name) {
        super(target, name);
        this.seatsNeeded = seats;
    }

    public int getSeatsNeeded() {
        return seatsNeeded;
    }
}
