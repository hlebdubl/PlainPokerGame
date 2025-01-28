import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // step 1: create a file object
        File f = new File("data/cards");

        String fileData = "";
        try {
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String currentLine = s.nextLine();
                fileData += currentLine + "\n";
            }

            // a String array where every item in the array is a line from the file
            String[] fileArray = fileData.split("\n");

            for (String line : fileArray) {
                // split by comma, now we have a list of String numbers
                String[] stringHands = line.split(",");
                stringHands = line.split("\\|");
                System.out.println(Arrays.toString(stringHands));
            }
        }
        catch (FileNotFoundException fe) {
            System.out.println("File was not found");
            System.exit(1);
        }

    }
}