public class App {
    public static void main(String[] args) throws Exception {

        String input = "ELIZER";
        System.out.print(reverseString(input));
    }

    static String reverseString(String inpuString) {

        // Define the base case/stopping condition
        if (inpuString.equals("")) {
            return "";
        }

        // Everytime the function calls itself, do something to reach the goal
        return reverseString(inpuString.substring(1)) + inpuString.charAt(0);
    }
}
