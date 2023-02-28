import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThread extends Thread {

    private char[] array;
    private String message;
    private static Lock lock = new ReentrantLock(true);

    public MyThread(char[] array, String message) {
        this.array = array;
        this.message = message;
    }

    @Override
    public void run() {
        pleaseLock();
        try {
            System.out.println("Lock is being used by " + Thread.currentThread().getName());
            for (int i = 0; i < message.length(); i++) {
                try {
                    array[i] = message.charAt(i);
                    Thread.sleep(50);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println(array);
        } finally {
            lock.unlock();
            System.out.println("Lock unlocked by " + Thread.currentThread().getName());
        }

    }

    private void pleaseLock() {
        lock.lock();
    }

}