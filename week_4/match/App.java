import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Java program to check if a student number is valid
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student number: ");
        String studentNum = scan.nextLine();

        // Long method
        Pattern pattern = Pattern.compile("\\d{4}-\\d{6}");
        Matcher matcher = pattern.matcher(studentNum);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("valid student number");
        } else {
            System.out.println("invalid student number");
        }

        // Short method
        match = Pattern.compile("\\d{4}-\\d{6}").matcher(studentNum).matches();

        if (match) {
            System.out.println("valid student number");
        } else {
            System.out.println("invalid student number");
        }

        // Even shorter method
        match = Pattern.matches("\\d{4}-\\d{6}", studentNum);

        if (match) {
            System.out.println("valid student number");
        } else {
            System.out.println("invalid student number");
        }
    }
}
