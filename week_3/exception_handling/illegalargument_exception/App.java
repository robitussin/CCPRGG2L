public class App {
    public static void main(String[] args) {

        try {
            iDontWantZeros(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void iDontWantZeros(int num) {

        if (num == 0) {
            throw new IllegalArgumentException("I said no zeros!");
        }

        System.out.println(num);
    }
}