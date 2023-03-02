import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DifficultyMenu extends JFrame {
    DifficultyMenu() {
        super("Snake Game");
        this.setLayout(new FlowLayout());

        JButton easyButton = new JButton();
        easyButton.setText("EASY");
        easyButton.setFont(new Font("Arial", Font.BOLD, 30));
        // Add event to easy button
        EventHandler easyHandler = new EventHandler(200);
        easyButton.addActionListener(easyHandler);

        JButton mediumButton = new JButton();
        mediumButton.setText("MEDIUM");
        mediumButton.setFont(new Font("Arial", Font.BOLD, 30));
        // Add event to easy button
        EventHandler mediumHandler = new EventHandler(120);
        mediumButton.addActionListener(mediumHandler);

        JButton hardButton = new JButton();
        hardButton.setText("HARD");
        hardButton.setFont(new Font("Arial", Font.BOLD, 30));
        // Add event to easy button
        EventHandler hardHandler = new EventHandler(40);
        hardButton.addActionListener(hardHandler);

        add(easyButton);
        add(mediumButton);
        add(hardButton);

        // Close java program when closing window
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // dimension of frame
        this.setSize(500, 500);
        // makes frame appear
        this.setVisible(true);
        // set frame to center
        this.setLocationRelativeTo(null);
        // background color of frame
        this.getContentPane().setBackground(new Color(200, 20, 100));
    }

    private class EventHandler implements ActionListener {

        int snakeSpeed;

        // Constructor
        EventHandler(int speed) {
            this.snakeSpeed = speed;
        }

        public void actionPerformed(ActionEvent event) {
            GamePanel gp = new GamePanel();
            gp.DELAY = snakeSpeed;

            // Goes to colormenu frame
            new ColorMenu();

            // Closes difficulty menu frame
            dispose();
        }
    }
}
