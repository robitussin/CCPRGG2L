import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        cook("Tinola");
        scan.close();
    }

    static void cook(String food) {

        System.out.println("Cooking!");
        taste(food);

        String feedback = getFeedBack(food);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            fixRecipe(food);

            // Recursive call
            cook(food);
        } else if (feedback.equals("yes")) {
            serve(food);
        }
    }

    static void taste(String food) {
        System.out.println("Tasting food");
    }

    static String getFeedBack(String food) {
        System.out.println("Is the " + food + " delicious? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void fixRecipe(String food) {
        System.out.print("Enter additional ingredient:");
        String ingredient = scan.next();
        System.out.println("Fixing recipe. Added " + ingredient);
    }

    static void serve(String food) {
        System.out.println("Serving " + food);
    }

}
