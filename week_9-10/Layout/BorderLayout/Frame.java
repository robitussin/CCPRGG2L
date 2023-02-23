import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame extends JFrame {

    // Layout Manager = Defines the natural layout for components within a container

    // BorderLayout = A BorderLayout places components in five areas: NORTH, SOUTH,
    // WEST, EAST, CENTER. All extra space is placed in the center area.

    Frame() {

        // JPAnel components
        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.RED);
        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.BLUE);
        JPanel eastPanel = new JPanel();
        eastPanel.setBackground(Color.GREEN);
        JPanel westPanel = new JPanel();
        westPanel.setBackground(Color.ORANGE);
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.MAGENTA);

        // Set JPanel component sizes
        northPanel.setPreferredSize(new Dimension(100, 100));
        southPanel.setPreferredSize(new Dimension(100, 100));
        eastPanel.setPreferredSize(new Dimension(100, 100));
        westPanel.setPreferredSize(new Dimension(100, 100));
        centerPanel.setPreferredSize(new Dimension(100, 100));

        // Add JPanel component sizes
        add(northPanel, BorderLayout.NORTH);
        add(southPanel, BorderLayout.SOUTH);
        add(eastPanel, BorderLayout.EAST);
        add(westPanel, BorderLayout.WEST);
        add(centerPanel, BorderLayout.CENTER);
    }
}
