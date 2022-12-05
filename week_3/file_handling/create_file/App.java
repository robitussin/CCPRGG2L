import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            // Create object from File class
            File myFile = new File("C:\\Users\\SLY\\Documents\\sample.txt");

            // .createNewFile() method creates a new file if the file in the pathname does
            // not exist
            if (myFile.createNewFile()) {
                System.out.println(myFile.getName() + " created!");
            } else {
                System.out.println(myFile.getName() + " already exists!");
            }
        } catch (Exception e) {
            System.out.println("There is an error");
            e.printStackTrace();
        }
    }
}
