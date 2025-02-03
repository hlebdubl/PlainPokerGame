import java.io.CharArrayReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    static int fiveKind;
    static int fourKind;
    static int fullHouse;
    static int threeKind;
    static int twoPair;
    static int pair;
    static int high;

    static int totalBidVal = 0;

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

            Hand[] handList = new Hand[fileArray.length];

            for (int i = 0; i < fileArray.length; i++) {

                String[] stringHands = fileArray[i].split(",|\\|");

                Hand h = new Hand(stringHands);

                //detect hands and add them to total counts
                int handType = h.detectHands();
                switch (handType)
                {
                    case 7:
                        fiveKind++;
                        break;
                    case 6:
                        fourKind++;
                        break;
                    case 5:
                        fullHouse++;
                        break;
                    case 4:
                        threeKind++;
                        break;
                    case 3:
                        twoPair++;
                        break;
                    case 2:
                        pair++;
                        break;
                    case 1:
                        high++;
                        break;
                }

                handList[i] = h;
            }

            for (int i = 0; i < handList.length; i++) //sorting array
            {
                if (!(i == handList.length - 1))
                {
                    if (handList[i].getHandScore() < handList[i + 1].getHandScore())
                    {
                        Hand tempH = handList[i];
                        handList[i] = handList[i + 1];
                        handList[i + 1] = tempH;
                        i = 0;
                    }
                }
            }

            for (int i = 0; i < handList.length; i++) //getting rank from sorted list and using it for totalBidVal
            {
                totalBidVal += (handList[i].getBid() * (handList.length - i));
            }

        }
        catch (FileNotFoundException fe) {
            System.out.println("File was not found");
            System.exit(1);
        }

        System.out.println("Five of a kind: " + fiveKind);
        System.out.println("Full houses: " + fullHouse);
        System.out.println("Four of a kind: " + fourKind);
        System.out.println("Three of a kind: " + threeKind);
        System.out.println("Two pairs: " +    twoPair);
        System.out.println("Pairs: " + pair);
        System.out.println("High cards: " + high);
        System.out.println("Total bid value: " + (totalBidVal - 1));

    }
}