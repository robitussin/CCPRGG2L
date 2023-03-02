import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TryAgain extends JFrame {
    TryAgain() {
        super("Snake Game");
        this.setLayout(new FlowLayout());

        JButton tryAgainButton = new JButton();
        tryAgainButton.setText("TRY AGAIN");
        tryAgainButton.setFont(new Font("Arial", Font.BOLD, 30));
        // Add event to easy button
        TryAgainEventHandler tryHandler = new TryAgainEventHandler();
        tryAgainButton.addActionListener(tryHandler);

        JButton exitButton = new JButton();
        exitButton.setText("EXIT");
        exitButton.setFont(new Font("Arial", Font.BOLD, 30));
        // Add event to easy button
        ExitEventHandler exitHandler = new ExitEventHandler();
        exitButton.addActionListener(exitHandler);

        add(tryAgainButton);
        add(exitButton);

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

    private class TryAgainEventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            App myApp = new App();
            myApp.main(null);
            dispose();
        }
    }

    private class ExitEventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            dispose();
        }
    }
}
