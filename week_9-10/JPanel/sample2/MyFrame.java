import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;

public class MyFrame extends JFrame {

    MyFrame() {

        JLabel label = new JLabel();
        label.setText("Hello");
        label.setFont(new Font("Consolas", Font.PLAIN, 20));
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(100, 100, 75, 75);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0, 250, 500, 250);
        // greenPanel.setLayout(new BorderLayout());
        greenPanel.setLayout(null);

        greenPanel.add(label);
        this.add(redPanel);
        this.add(bluePanel);
        this.add(greenPanel);

    };
}
