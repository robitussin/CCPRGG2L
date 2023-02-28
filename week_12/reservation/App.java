public class App {

    public static void main(String[] args) throws Exception {

        BusReservation br = new BusReservation();

        PassengerThread pt1 = new PassengerThread(2, br, "Sam");
        PassengerThread pt2 = new PassengerThread(2, br, "Jack");

        pt1.start();
        pt2.start();
    }

}
