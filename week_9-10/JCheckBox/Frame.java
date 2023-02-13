import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame extends JFrame {

    private JTextField textField;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;

    public Frame() {
        // Set the title of the window/frame
        super("The title");
        setLayout(new FlowLayout());

        // JTextField Component
        textField = new JTextField("This is a sentence", 20);
        textField.setFont(new Font("Serif", Font.PLAIN, 14));

        // Add JTextField Component to frame/window
        add(textField);

        // JCheckBox Component
        checkBox1 = new JCheckBox("bold");

        // JCheckBox Component
        checkBox2 = new JCheckBox("italic");

        // Add JCheckBox Component to frame/window
        add(checkBox1);

        // Add JCheckBox Component to frame/window
        add(checkBox2);

        // Add event
        EventHandler handler = new EventHandler();
        checkBox1.addItemListener(handler);
        checkBox2.addItemListener(handler);

    }

    // Event Handler Class
    private class EventHandler implements ItemListener {

        public void itemStateChanged(ItemEvent event) {
            Font font = null;

            if (checkBox1.isSelected() && checkBox2.isSelected()) {
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            } else if (checkBox1.isSelected()) {
                font = new Font("Serif", Font.BOLD, 14);
            } else if (checkBox2.isSelected()) {
                font = new Font("Serif", Font.ITALIC, 14);
            } else {
                font = new Font("Serif", Font.PLAIN, 14);
            }

            textField.setFont(font);
        }
    }

}
