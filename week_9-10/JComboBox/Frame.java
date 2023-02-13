import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame extends JFrame {

    private JComboBox box;
    private JLabel picture;

    // Declare filename array
    private static String[] filename = { "icon1.png", "icon2.png" };

    // Declare icon array
    private Icon[] pics = {
            new ImageIcon(getClass().getResource(filename[0])),
            new ImageIcon(getClass().getResource(filename[1])) };

    public Frame() {
        // Set the title of the window/frame
        super("The title");
        setLayout(new FlowLayout());

        // JComboBox Component
        box = new JComboBox(filename);

        // Add event
        EventHandler handler = new EventHandler();
        box.addItemListener(handler);

        // Add JComboBox Component
        add(box);

        // JLabel Component
        picture = new JLabel(pics[0]);

        // Add JLabel Component
        add(picture);
    }

    // Event Handler Class
    private class EventHandler implements ItemListener {

        public void itemStateChanged(ItemEvent event) {
            if (event.getStateChange() == ItemEvent.SELECTED) {
                picture.setIcon(pics[box.getSelectedIndex()]);
            }
        }
    }
}
