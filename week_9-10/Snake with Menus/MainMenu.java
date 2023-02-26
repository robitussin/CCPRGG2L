import javax.swing.ImageIcon;
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

        // Image
        ImageIcon image = new ImageIcon("snake.jpg");

        // JLabel
        JLabel label = new JLabel();
        label.setIcon(image);

        // JButton
        JButton startButton = new JButton();
        startButton.setText("START GAME");
        startButton.setFont(new Font("CONSOLAS", Font.BOLD, 22));

        // Add event
        EventHandler handler = new EventHandler();
        startButton.addActionListener(handler);

        // Set background color of panel1
        panel1.setBackground(Color.GRAY);
        // Set background color of panel2
        panel2.setBackground(Color.GRAY);
        // Set background color of Frame
        this.getContentPane().setBackground(Color.GRAY);

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