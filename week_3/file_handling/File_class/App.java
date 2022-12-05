import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            // Create object from File class
            File myFile = new File("C:\\Users\\SLY\\Documents\\sample.txt");

            // .exists() method checks if a file exists in the pathname
            if (myFile.exists()) {
                System.out.println(myFile.getName() + "exists!");
            } else {
                System.out.println(myFile.getName() + " does not exist!");
            }
        } catch (Exception e) {
            System.out.println("There is an error");
            e.printStackTrace();
        }

    }
}
