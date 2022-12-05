import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            // Create object from File class
            File myFile = new File("C:\\Users\\SLY\\Documents\\sample.txt");

            // .delete() method removes a file if the file exists in the pathname
            if (myFile.delete()) {
                System.out.println(myFile.getName() + " deleted successfully!");
            } else {
                System.out.println("Failed to delete " + myFile.getName());
            }
        } catch (Exception e) {
            System.out.println("There is an error");
            e.printStackTrace();
        }

    }
}
