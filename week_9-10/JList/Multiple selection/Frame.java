import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

public class Frame extends JFrame {

    private JList leftList;
    private JList rightList;
    private JButton moveButton;
    private static String[] food = { "bacon", "wings", "ham", "beef", "chicken" };

    Frame() {

        // Adds window title
        super("Title");
        setLayout(new FlowLayout());

        // JList component
        leftList = new JList(food);

        // Sets number of visible rows in the JList
        leftList.setVisibleRowCount(3);

        // Enables user to select multiple items in the list
        leftList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Adds a scrollbar
        add(new JScrollPane(leftList));

        // Adds text in button
        moveButton = new JButton("Move -->");

        // Add event when button is clicked
        moveButton.addActionListener(new EventHandler());

        // Add button component in frame
        add(moveButton);

        rightList = new JList();

        // Set number of visible item lists
        rightList.setVisibleRowCount(3);

        // Set width and height of list
        rightList.setFixedCellWidth(100);
        rightList.setFixedCellHeight(15);

        // Enables user to select multiple items in the list
        rightList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        add(new JScrollPane(rightList));
    }

    // Event handler class
    private class EventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            rightList.setListData(leftList.getSelectedValuesList().toArray());
        }
    }
}
