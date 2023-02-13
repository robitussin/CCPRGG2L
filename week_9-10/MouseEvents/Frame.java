import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class Frame extends JFrame {

    private JPanel mousePanel;
    private JLabel statusBar;

    Frame() {

        // Set window title
        super("Title");

        // JPanel Component
        mousePanel = new JPanel();
        mousePanel.setBackground(Color.WHITE);

        // Add JPanel Component
        add(mousePanel, BorderLayout.CENTER);

        // Add JLabel Component
        statusBar = new JLabel();

        // Add JPanel Component
        add(statusBar, BorderLayout.SOUTH);

        // Add Event
        mousePanel.addMouseListener(new EventHandler());
        mousePanel.addMouseMotionListener(new EventHandler());
    }

    // Event handler class
    private class EventHandler implements MouseListener, MouseMotionListener {

        public void mouseClicked(MouseEvent event) {
            statusBar.setText(String.format("Clicked at %d, %d", event.getX(), event.getY()));
        }

        public void mousePressed(MouseEvent event) {
            statusBar.setText("You pressed down the mouse!");
        }

        public void mouseReleased(MouseEvent event) {
            statusBar.setText("You released the button!");
        }

        public void mouseEntered(MouseEvent event) {
            statusBar.setText("You entered the area!");
            mousePanel.setBackground(Color.RED);
        }

        public void mouseExited(MouseEvent event) {
            statusBar.setText("The mouse has left the window");
            mousePanel.setBackground(Color.WHITE);
        }

        public void mouseDragged(MouseEvent event) {
            statusBar.setText("You are dragging the mouse");
        }

        public void mouseMoved(MouseEvent event) {
            statusBar.setText("You moved the mouse");
        }
    }
}
