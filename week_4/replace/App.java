public class App {
    public static void main(String[] args) {

        String myString = "I love Java!";

        String replaceString = myString.replaceAll("a", "o");// replaces all occurrences of "a" to "e"

        System.out.println(replaceString);
    }
}