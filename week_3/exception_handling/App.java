import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Divide two numbers!");

            System.out.print("Enter dividend: ");
            int firstNumber = scan.nextInt();

            System.out.print("Enter divisor: ");
            int secondNumber = scan.nextInt();

            int quotient = firstNumber / secondNumber;

            System.out.print("The quotient is: " + quotient);
        } catch (Exception e) {
            System.out.print("You cannot divide by zero");
            e.printStackTrace();
        }
    }
}
