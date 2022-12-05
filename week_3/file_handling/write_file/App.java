import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            // Create object from FileWriter class
            FileWriter myWriter = new FileWriter("C:\\Users\\SLY\\Documents\\sample.txt");

            // .write() methods adds content to the file
            myWriter.write("Hello i am now taking intermediate programming in Java!");

            // Close FileWriter
            myWriter.close();

            System.out.println("File Write successful!");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
