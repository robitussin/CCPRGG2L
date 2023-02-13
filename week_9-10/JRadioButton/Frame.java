import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame extends JFrame {

    private JTextField textField;

    private Font font1;
    private Font font2;
    private Font font3;
    private Font font4;

    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JRadioButton radioButton4;

    private ButtonGroup group;

    public Frame() {
        // Set the title of the window/frame
        super("The title");
        setLayout(new FlowLayout());

        // JTextField component
        textField = new JTextField("This is a sentence", 25);

        // Add JTextField component
        add(textField);

        // JRadioButton components
        radioButton1 = new JRadioButton("plain", true);
        radioButton2 = new JRadioButton("bold", false);
        radioButton3 = new JRadioButton("italic", false);
        radioButton4 = new JRadioButton("bold and italic", false);

        // Add JRadioButton components
        add(radioButton1);
        add(radioButton2);
        add(radioButton3);
        add(radioButton4);

        group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);
        group.add(radioButton4);

        font1 = new Font("Serif", Font.PLAIN, 14);
        font2 = new Font("Serif", Font.BOLD, 14);
        font3 = new Font("Serif", Font.ITALIC, 14);
        font4 = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        textField.setFont(font1);

        // Add Event
        radioButton1.addItemListener(new EventHandler(font1));
        radioButton2.addItemListener(new EventHandler(font2));
        radioButton3.addItemListener(new EventHandler(font3));
        radioButton4.addItemListener(new EventHandler(font4));

    }

    // Event handler class
    private class EventHandler implements ItemListener {

        private Font font;

        public EventHandler(Font f) {
            font = f;
        }

        public void itemStateChanged(ItemEvent event) {
            textField.setFont(font);
        }
    }

}
