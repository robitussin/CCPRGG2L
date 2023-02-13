import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Frame extends JFrame {

    // Declare JList
    private JList list;

    // Declare array of color names in the selection
    private static String[] colorNames = { "Black", "Blue", "Red", "White" };

    // Declare array of colors from the Colr class
    private static Color[] colors = { Color.BLACK, Color.BLUE, Color.RED, Color.WHITE };

    // Constructor
    Frame() {
        super("title");
        setLayout(new FlowLayout());

        // JList Component
        list = new JList(colorNames);

        // Set number of visible item lists
        list.setVisibleRowCount(4);

        // Sets JList to selection one option at a time
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add JList component frame
        add(new JScrollPane(list));

        // Add event handler
        list.addListSelectionListener(new EventHandler());
    }

    // Event handler class
    private class EventHandler implements ListSelectionListener {

        // Changes background color when an event occurs
        public void valueChanged(ListSelectionEvent event) {
            getContentPane().setBackground(colors[list.getSelectedIndex()]);
        }
    }
}
