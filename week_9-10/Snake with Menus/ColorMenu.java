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

public class ColorMenu extends JFrame {

    JList colorList;
    private static String[] colorNames = { "Blue", "Red", "White" };
    private static Color[] colors = { Color.BLUE, Color.RED, Color.WHITE };

    ColorMenu() {

        super("Snake Game");
        setLayout(new FlowLayout());

        // JPane
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        // JLabel
        JLabel label = new JLabel("CHOOSE SNAKE COLOR");

        // JList
        colorList = new JList(colorNames);

        // Set number of visible item lists
        colorList.setVisibleRowCount(3);

        // Sets JList to selection one option at a time
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add component to panel
        panel1.add(label);
        panel2.add(new JScrollPane(colorList));

        // Add event
        ColorHandler colorHandler = new ColorHandler();
        colorList.addListSelectionListener(colorHandler);

        // Add panel to frame
        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.SOUTH);

        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setSize(300, 300);
    }

    // Color Handler Class
    private class ColorHandler implements ListSelectionListener {

        public void valueChanged(ListSelectionEvent event) {
            GamePanel panel = new GamePanel();
            panel.snakeColor = colors[colorList.getSelectedIndex()];

            // Opens game window
            new GameFrame();

            // Closes color menu window
            dispose();
        }
    }
}
