import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {

        Frame frame = new Frame();
        // Terminates the program when clicking the close button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Sets the size of the frame/window
        frame.setSize(300, 200);

        // Makes the window appear
        frame.setVisible(true);
    }
}
