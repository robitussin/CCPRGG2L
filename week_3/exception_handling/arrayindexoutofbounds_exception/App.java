public class App {
    public static void main(String[] args) {

        try {
            char[] myName = { 'E', 'L', 'I', 'Z', 'E', 'R' };

            System.out.println(myName[7]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}