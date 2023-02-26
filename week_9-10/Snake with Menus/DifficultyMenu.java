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

public class DifficultyMenu extends JFrame {

    JList colorList;
    private static String[] colorNames = { "Blue", "Red", "White" };
    private static Color[] colors = { Color.BLUE, Color.RED, Color.WHITE };

    DifficultyMenu() {

        super("Snake Game");
        setLayout(new FlowLayout());

        // JPane
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        // JLabel
        JLabel label = new JLabel("SELECT DIFFICULTY");

        // JButton
        JButton easyButton = new JButton("EASY");
        JButton mediumButton = new JButton("MEDIUM");
        JButton hardButton = new JButton("HARD");

        // Add event
        EventHandler easyMode = new EventHandler(300);
        EventHandler mediumMode = new EventHandler(150);
        EventHandler hardMode = new EventHandler(50);

        easyButton.addActionListener(easyMode);
        mediumButton.addActionListener(mediumMode);
        hardButton.addActionListener(hardMode);

        // Add components to panel
        panel1.add(label);
        panel2.add(easyButton);
        panel2.add(mediumButton);
        panel2.add(hardButton);

        // Add components to frame
        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.SOUTH);

        this.setResizable(false);
        this.setSize(300, 300);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    // Button Event Handler Class
    private class EventHandler implements ActionListener {

        int speed;

        EventHandler(int snakeSpeed) {
            this.speed = snakeSpeed;
        }

        public void actionPerformed(ActionEvent event) {

            GamePanel panel = new GamePanel();
            panel.DELAY = this.speed;

            // Opens color menu window
            new ColorMenu();

            // Closes difficulty menu window
            dispose();
        }
    }
}