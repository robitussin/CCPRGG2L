import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class MyFrame extends JFrame {

    MyFrame() {
        // Makes frame visible
        this.setVisible(true);

        // Sets frame size
        this.setSize(420, 420);

        // Sets title of frame
        this.setTitle("JFrame title");

        // Exit out of application
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

        // Prevent frame from being resized
        this.setResizable(false);

        // This will create an image icon
        ImageIcon image = new ImageIcon("tiktok.png");

        // Change icon of frame
        this.setIconImage(image.getImage());

        // Set background color
        // frame.getContentPane().setBackground(Color.green);

        // Set background color using RGB
        this.getContentPane().setBackground(new Color(123, 50, 250));

        // Set background color using Hexadecimal
        this.getContentPane().setBackground(new Color(0x123456));
    };
}
