package game;

import java.awt.EventQueue;

public class App {

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            Tetris game = new Tetris();

            game.setVisible(true);
            game.setTitle("Tetris");
            game.setSize(200, 400);
            game.setDefaultCloseOperation(game.EXIT_ON_CLOSE);
            game.setLocationRelativeTo(null);
        });
    }
}
