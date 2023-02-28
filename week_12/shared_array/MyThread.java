import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThread extends Thread {

    private char[] array;
    private String message;

    public MyThread(char[] array, String message) {
        this.array = array;
        this.message = message;
    }

    @Override
    public void run() {
        synchronized (array) {
            System.out.println("Array is being used by " + Thread.currentThread().getName());
            for (int i = 0; i < message.length(); i++) {
                try {
                    array[i] = message.charAt(i);
                    Thread.sleep(50);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println(array);
        }
    }

}