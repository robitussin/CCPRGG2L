import java.awt.Color;

public class App {

    public static void main(String[] args) {

        MainMenu mainMenu = new MainMenu();

        mainMenu.setDefaultCloseOperation(mainMenu.EXIT_ON_CLOSE);
        mainMenu.setSize(500, 500);
        mainMenu.setVisible(true);
        mainMenu.setLocationRelativeTo(null);
        mainMenu.setResizable(false);
        // background color of frame
        mainMenu.getContentPane().setBackground(new Color(200, 20, 100));

    }
}