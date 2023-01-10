public class App {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }

    public static int sum(int k) {
        if (k > 0) {

            System.out.print(k + " + sum(" + (k - 1) + ")");
            System.out.println("");

            // Recursion
            return k + sum(k - 1);

        } else {
            return 0;
        }
    }
}