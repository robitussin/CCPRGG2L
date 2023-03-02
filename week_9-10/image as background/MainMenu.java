import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MainMenu extends JFrame {
    JButton b1;
    JLabel l1;

    MainMenu() {

        setContentPane(new JLabel(new ImageIcon("snake.jpg")));
        setLayout(new FlowLayout());

        b1 = new JButton("I am a button");

        add(b1);
        setSize(740, 420);
        setTitle("Background Color for JFrame");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}