import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameFrame extends JFrame implements Runnable {
	Thread t;
	CandyRush cr;

	public GameFrame() {
		t = new Thread(this, "Dispose");

		cr = new CandyRush(this);
		cr.start();
		add(cr);

		addKeyListener(cr);
		setTitle("Candy Rush"); // Title Frame
		setResizable(false);
		getContentPane().setBackground(Color.white);
		setSize(1200, 700); // frame size
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void run() {
		dispose();
	}

	public static void main(String[] args) {
		new GameFrame().setVisible(true);
	}
}