public class App {

    public static void main(String[] args) throws Exception {

        Registration reg = new Registration();

        // Thread 1
        StudentThread student1 = new StudentThread(reg, "Sam");
        // Thread 2
        StudentThread student2 = new StudentThread(reg, "Jack");
        // Thread 2
        StudentThread student3 = new StudentThread(reg, "Sly");

        // Start thread 1
        student1.start();
        // Start thread 2
        student2.start();
        // Start thread 3
        student3.start();
    }

}