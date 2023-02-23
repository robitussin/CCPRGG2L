import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {

    // Layout Manager = Defines the natural layout for components within a container

    // FlowLayout = places components in a row, sized at their preferred size.
    // If the horizontal space in the container is too small, the FlowLayout class
    // uses the next available row.

    MyFrame() {
        // this.setLayout(new FlowLayout(FlowLayout.TRAILING));
        // this.setLayout(new FlowLayout(FlowLayout.LEADING));
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 250));
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new FlowLayout());

        // Adds nine buttons
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        this.add(panel);

    }
}