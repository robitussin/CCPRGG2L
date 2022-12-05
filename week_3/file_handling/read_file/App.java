import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            // Create an object from the File class
            File myFile = new File("C:\\Users\\SLY\\Documents\\sample.txt");

            // Create an object from the Scanner class
            Scanner scan = new Scanner(myFile);

            // Read the content of the file
            while (scan.hasNextLine()) {
                String data = scan.nextLine();
                System.out.println(data);
            }

            // Close scanner
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
