import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {

    Frame() {

        // Set the title of the window/frame
        super("My title");

        setLayout(new FlowLayout());

        // JButton Component
        JButton button = new JButton("Click Here");

        // Set component size
        button.setBounds(50, 100, 95, 30);

        // Add JButton Component to frame/window
        add(button);

        // Add event
        EventHandler handler = new EventHandler();
        button.addActionListener(handler);
    }

    // Event Handler Class
    private class EventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(null, "Hello");
        }
    }
}
