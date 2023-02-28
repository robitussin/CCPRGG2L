public class App {

    public static void main(String[] args) throws InterruptedException {
        char[] myArray = new char[20];

        Thread thread1 = new MyThread(myArray, "HELLO");
        thread1.start();

        Thread thread2 = new MyThread(myArray, "WORLD");
        thread2.start();

        thread1.join();
        thread2.join();
    }
}