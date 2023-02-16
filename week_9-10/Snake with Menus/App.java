import java.awt.Color;

public class App {

    public static void main(String[] args) {

        MainMenu mainMenu = new MainMenu();

        mainMenu.setDefaultCloseOperation(mainMenu.EXIT_ON_CLOSE);

        mainMenu.setSize(300, 300);
        mainMenu.setVisible(true);
        mainMenu.setResizable(false);
        mainMenu.setLocationRelativeTo(null);

    }
}