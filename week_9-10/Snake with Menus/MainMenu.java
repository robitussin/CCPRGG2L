import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import java.awt.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MainMenu extends JFrame {

    JList colorList;
    private static String[] colorNames = { "Blue", "Red", "White" };
    private static Color[] colors = { Color.BLUE, Color.RED, Color.WHITE };

    MainMenu() {

        super("Snake Game");
        setLayout(new FlowLayout());

        // JPane
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        // JLabel
        JLabel label = new JLabel("WELCOME TO SNAKE GAME");

        // JButton
        JButton startButton = new JButton("START GAME");

        // Add event
        EventHandler handler = new EventHandler();

        startButton.addActionListener(handler);

        // Add JButton components to frame
        panel1.add(label);
        panel2.add(startButton);

        // Add panel
        add(panel1);
        add(panel2);
    }

    // Button Event Handler Class
    private class EventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            // Opens difficulty menu window
            new DifficultyMenu();

            // Closes main menu window
            dispose();
        }
    }
}
