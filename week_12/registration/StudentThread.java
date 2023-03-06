public class StudentThread extends Thread {

    public StudentThread(Runnable target, String name) {
        super(target, name);
    }
}