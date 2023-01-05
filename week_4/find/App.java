import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter text:");

            Pattern pattern = Pattern.compile("java");
            Matcher matcher = pattern.matcher(scan.nextLine());

            boolean found = false;

            while (matcher.find()) {
                System.out.println("I found the text " + matcher.group() + " starting at index " +
                        matcher.start() + " and ending at index " + matcher.end());
                found = true;
            }
            if (!found) {
                System.out.println("No match found.");
            }
        }
    }
}