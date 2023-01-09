import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // At least one letter
        // At least one number
        // At least 8 chars

        // Java program to check if a password is valid
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = scan.nextLine();

        Pattern pattern = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d).{8,}$");
        Matcher matcher = pattern.matcher(password);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("valid password ");
        } else {
            System.out.println("invalid password ");
        }
    }
}
