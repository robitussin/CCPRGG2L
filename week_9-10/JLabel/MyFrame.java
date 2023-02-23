import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class MyFrame extends JFrame {

    MyFrame() {

        ImageIcon image = new ImageIcon("smile.png");

        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel();
        // Set text of label
        label.setText("Do you even code?");
        this.add(label);
        label.setIcon(image);
        // Set text LEFT, CENTER, RIGHT of imageicon
        label.setHorizontalTextPosition(JLabel.CENTER);
        // Set text TOP,CENTER, BOTTOM of image
        label.setVerticalTextPosition(JLabel.TOP);
        // Set font color of text
        label.setForeground(new Color(0x00FF00));
        // Set font of text
        label.setFont(new Font("Consolas", Font.PLAIN, 20));
        // Set gap of text to image
        label.setIconTextGap(-25);
        // Set background color
        label.setBackground(Color.BLACK);
        // Display background color
        label.setOpaque(true);
        // Set border
        label.setBorder(border);
        // Set vertical position of icon and text within label
        label.setVerticalAlignment(JLabel.CENTER);
        // Set horizontal position of icon and text within label
        label.setHorizontalAlignment(JLabel.CENTER);

        // This will set x,y position within frame as well as dimensions
        // label.setBounds(100, 100, 250, 250);

    };
}
