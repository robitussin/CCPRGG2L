public class Registration implements Runnable {

    private int totalSlotsAvailable = 2;

    public void run() {

        // Type Casting
        StudentThread st = (StudentThread) Thread.currentThread();

        boolean slotsReserved = this.registerSection(st.getName());

        if (slotsReserved) {
            System.out.println("Congratulations " + Thread.currentThread().getName()
                    + ", you are now registered in this section");
        } else {
            System.out
                    .println("Sorry " + Thread.currentThread().getName() + ", the section is already full!");
        }
    }

    public synchronized boolean registerSection(String name) {

        System.out.println(
                "Welcome to NUIS! " + Thread.currentThread().getName()
                        + ", the number of slots available for this section is : "
                        + this.getTotalSlotsAvailable());

        if (totalSlotsAvailable <= 0) {
            return false;
        } else {
            totalSlotsAvailable = totalSlotsAvailable - 1;

            return true;
        }
    }

    private int getTotalSlotsAvailable() {
        return totalSlotsAvailable;
    }
}