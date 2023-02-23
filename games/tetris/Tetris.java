package game;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tetris extends JFrame {

    private JLabel statusbar;

    Tetris() {
        statusbar = new JLabel(" 0");
        this.add(statusbar, BorderLayout.SOUTH);

        Board board = new Board(this);
        add(board);
        board.start();
    }

    JLabel getStatusBar() {

        return statusbar;
    }

}
