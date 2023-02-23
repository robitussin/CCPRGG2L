import javax.swing.ImageIcon;

public class App {
    public static void main(String[] args) throws Exception {

        MyFrame frame = new MyFrame();

        // frame.setLayout(null);
        // Makes frame visible
        frame.setVisible(true);
        // Sets frame size
        // frame.setSize(500, 500);
        // Sets title of frame
        frame.setTitle("JFrame title");
        // Exit out of application
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        // Prevent frame from being resized
        frame.setResizable(true);
        // This will create an image icon
        ImageIcon image = new ImageIcon("tiktok.png");
        // Change icon of frame
        frame.setIconImage(image.getImage());

        // Set background color
        // frame.getContentPane().setBackground(Color.green);
        // Set background color using RGB
        // frame.getContentPane().setBackground(new Color(123, 50, 250));
        // Set background color using Hexadecimal
        // frame.getContentPane().setBackground(new Color(0x123456));

        frame.pack();
    }
}
