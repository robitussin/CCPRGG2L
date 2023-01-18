import java.util.Scanner;

public class App {
    static Scanner scan = new Scanner(System.in);

public static void main(String[] args) throws Exception {

    passExam();
    scan.close();
}

static void passExam() {

    System.out.println("Taking exam!");
    study();

    String feedback = getFeedBack();

    // Define the base case / stopping condition
    if (feedback.equals("no")) {

        // Do something to reach the goal
        study();

        // Recursive call
        passExam();
    } else if (feedback.equals("yes")) {
        celebrate();
    }
}

static void study() {
    System.out.println("Studying for the exam");
}

static String getFeedBack() {
    System.out.println("Are you ready for the exam? (Enter \"yes\" or \"no\")");

    String feedback = scan.next();

    return feedback;
}

static void celebrate() {
    System.out.println("Passed the exam. Celebrating!");
}
}
