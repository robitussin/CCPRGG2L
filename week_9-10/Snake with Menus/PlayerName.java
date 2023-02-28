import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import java.awt.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class PlayerName extends JFrame {

    JTextField textField;

    PlayerName() {

        super("Snake Game");

        // JPane
        JPanel panel = new JPanel();

        // JLabel
        JLabel label = new JLabel();
        label.setText("Enter player name: ");

        // JTextArea
        textField = new JTextField(16);

        EventHandler handler = new EventHandler();
        textField.addKeyListener(handler);

        // Add components to panel
        panel.add(label);
        panel.add(textField);
        panel.setPreferredSize(new Dimension(250, 250));
        panel.setLayout(new FlowLayout());

        // Add components to frame
        this.add(panel);

        this.setResizable(false);
        this.setSize(300, 300);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    private class EventHandler implements KeyListener {

        public void keyPressed(KeyEvent event) {

            GamePanel panel = new GamePanel();

            if (event.getKeyCode() == KeyEvent.VK_ENTER) {

                panel.playerName = textField.getText();
                new GameFrame();
                dispose();
            }
        }

        public void keyTyped(KeyEvent event) {
        }

        public void keyReleased(KeyEvent event) {
        }
    }
}