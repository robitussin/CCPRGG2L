public class App {
    public static void main(String[] args) throws Exception {

        MyFrame frame = new MyFrame();

        frame.setLayout(null);
        // Makes frame visible
        frame.setVisible(true);
        // Sets frame size
        frame.setSize(500, 500);
        // Exit out of application
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

    }
}
