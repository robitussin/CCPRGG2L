import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CandyRush extends JPanel implements Runnable, KeyListener {
	private Thread t;
	private Ball ball;
	JLabel boul;
	Rectangle r;
	JLabel labelScore, labelLife[];
	public static int score = 0;
	public static int life = 5;
	private GameFrame main;

	public CandyRush(GameFrame main) {
		this.main = main;

		setLayout(null); // layout
		// addKeyListener(this);
		setBackground(Color.white);
		setSize(1200, 700); // frame size
		r = getBounds();

		// Boul label
		boul = new JLabel(new ImageIcon("images\\Boul.png"));
		boul.setBounds(5, getBounds().height - 116, 200, 80);
		add(boul);

		// life labels
		labelLife = new JLabel[5];
		for (int i = 0; i < 5; i++) {
			labelLife[i] = new JLabel(new ImageIcon("images\\heart.png"));
			labelLife[i].setBounds(i * 40, 2, 30, 30);
			add(labelLife[i]);
		}

		// Score Label
		labelScore = new JLabel("0");
		labelScore.setBounds(getBounds().width - 70, 2, 150, 30);
		labelScore.setFont(new Font("Arial", Font.BOLD, 32));
		add(labelScore);

		// Balls Thread
		t = new Thread(this, "Ball");
	}

	public void start() {
		t.start();
	}

	public void run() {
		try {
			while (life > 0) {
				ball = new Ball(this);
				add(ball);
				Thread.sleep(3000);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			JOptionPane.showMessageDialog(null, "Something Wrong");
		}
		JOptionPane.showMessageDialog(null, "Your Score : " + score);
		main.t.start();
	}

	public void keyTyped(java.awt.event.KeyEvent evt) {
	}

	public void keyPressed(java.awt.event.KeyEvent evt) {
		int x = boul.getX();
		int y = boul.getY();
		if (evt.getKeyCode() == 37 && x - 25 >= 0)
			boul.setBounds(x - 25, y, 200, 80);
		else if (evt.getKeyCode() == 39 && x + 25 < r.width - 203)
			boul.setBounds(x + 25, y, 200, 80);
	}

	public void keyReleased(java.awt.event.KeyEvent evt) {
	}
}