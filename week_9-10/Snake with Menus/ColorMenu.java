import java.awt.Color;
import java.awt.Font;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ColorMenu extends JFrame {

    JList list;
    private String[] colorlist = { "BLUE", "WHITE", "MAGENTA", "YELLOW" };
    private Color[] colors = { Color.BLUE, Color.WHITE, Color.MAGENTA, Color.YELLOW };

    ColorMenu() {
        super("Snake Game");
        this.setLayout(new FlowLayout());

        // JLabel component
        JLabel label = new JLabel();
        label.setText("Choose your favorite color: ");
        label.setFont(new Font("Arial", Font.BOLD, 30));

        // Jlist component
        list = new JList(colorlist);
        list.setFont(new Font("Arial", Font.BOLD, 30));
        list.setVisibleRowCount(2);

        // Sets JList to selection one option at a time
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add event
        EventHandler handler = new EventHandler();
        list.addListSelectionListener(handler);

        // JScrollPane
        JScrollPane scrollPane = new JScrollPane(list);

        // ADd components to frame
        this.add(label);
        this.add(scrollPane);

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

    // Event handler
    private class EventHandler implements ListSelectionListener {

        public void valueChanged(ListSelectionEvent event) {

            GamePanel gp = new GamePanel();
            gp.snakeColor = colors[list.getSelectedIndex()];

            // goes to player menu
            new PlayerMenu();

            // closes color menu
            dispose();
        }
    }
}
