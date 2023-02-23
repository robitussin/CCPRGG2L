import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {

    // Layout Manager = Defines the natural layout for components within a container

    // GridLayout = places components in a grid of cells. Each componentn takes all
    // the available space within its cell, and each cell is the same size.

    MyFrame() {

        this.setLayout(new GridLayout(3, 3, 10, 10));

        // Add ten buttons
        this.add(new JButton("1"));
        this.add(new JButton("2"));
        this.add(new JButton("3"));
        this.add(new JButton("4"));
        this.add(new JButton("5"));
        this.add(new JButton("6"));
        this.add(new JButton("7"));
        this.add(new JButton("8"));
        this.add(new JButton("9"));
    }
}