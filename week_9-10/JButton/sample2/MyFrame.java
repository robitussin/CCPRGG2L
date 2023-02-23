import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame {

    JButton button;
    JLabel label;

    MyFrame() {

        ImageIcon icon = new ImageIcon("pointing.png");
        ImageIcon icon2 = new ImageIcon("smile.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);

        button = new JButton("Click me");
        button.setBounds(100, 100, 250, 100);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-5);
        button.setForeground(Color.CYAN);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());
        // Disables a button
        // button.setEnabled(false);

        // How to add button event
        // 1. Create an EventHandler Object
        EventHandler eventhandler = new EventHandler();
        // 2. Add a ActionListener
        button.addActionListener(eventhandler);

        // OR

        // Use a lambda expression
        // With lambda expressions, you do not need to create a EventHandler class
        // button.addActionListener(e -> JOptionPane.showMessageDialog(null, "HELLOO"));

        button.setFocusable(false);
        this.add(button);
        this.add(label);

    };

    // Event Handler Class
    private class EventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            // Causes button to be clicked only once
            button.setEnabled(false);
            label.setVisible(true);
        }
    }
}
