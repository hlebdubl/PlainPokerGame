import java.io.CharArrayReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    static int fiveKind;
    static int fullHouse;
    static int fourKind;
    static int threeKind;
    static int twoPair;
    static int pair;
    static int high;

    public static int detectHands(String[] hand)
    {
        int indexZeroSimilarities = 0;
        int indexOneSimilarities = 0;
        int indexTwoSimilarities = 0;
        int indexThreeSimilarities = 0;
        int indexFourSimilarities = 0;

        for(int i = 0; i < hand.length; i++)
        {
            if (hand[0].equals(hand[i]))
            {
                indexZeroSimilarities++;
            }
        }
        indexZeroSimilarities--;
        for(int i = 0; i < hand.length; i++)
        {
            if (hand[1].equals(hand[i]))
            {
                indexOneSimilarities++;
            }
        }
        indexOneSimilarities--;
        for(int i = 0; i < hand.length; i++)
        {
            if (hand[2].equals(hand[i]))
            {
                indexTwoSimilarities++;
            }
        }
        indexTwoSimilarities--;
        for(int i = 0; i < hand.length; i++)
        {
            if (hand[3].equals(hand[i]))
            {
                indexThreeSimilarities++;
            }
        }
        indexThreeSimilarities--;
        for(int i = 0; i < hand.length; i++)
        {
            if (hand[4].equals(hand[i]))
            {
                indexFourSimilarities++;
            }
        }
        indexFourSimilarities--;

        int[] similarities = new int[5];
        similarities[0] = indexZeroSimilarities;
        similarities[1] = indexOneSimilarities;
        similarities[2] = indexTwoSimilarities;
        similarities[3] = indexThreeSimilarities;
        similarities[4] = indexFourSimilarities;

        boolean five = false;
        boolean four = false;
        boolean three = false;
        boolean one = false;
        boolean full = false;
        boolean two = false;
        boolean isHigh = false;

        int count = 0;
        for(int i = 0; i < similarities.length; i++){
            if(similarities[i] == 1){
                count++;
            }
        }
        boolean hasThree = false;
        boolean hasTwo = false;
        for (int similarity : similarities) {
            if (similarity == 2) {
                hasThree = true;
            }
            if (similarity == 1) {
                hasTwo = true;
            }
        }

        for (int similarity : similarities) {

            if (similarity == 4) {
                five = true;
            } else if (similarity == 3) {
                four = true;
            }

            if (hasTwo && hasThree) {
                full = true;
            } else if (hasThree) {
                three = true;
            } else if (count == 4) {
                two = true;
            } else if (similarity == 1) {
                one = true;
            } else if (!five && !four && !three && !one && !two && !full) {
                isHigh = true;
            }
        }
        if(five){
            fiveKind++;
            return 7;
        }
        if(four){
            fourKind++;
            return 5;
        }
        if(three){
            threeKind++;
            return 4;
        }
        if(full){
            fullHouse++;
            return 6;
        }
        if(one){
            pair++;
            return 2;
        }
        if(two){
            twoPair++;
            return 3;
        }
        if(isHigh){
            high++;
            return 1;
        }
        else{
            return 0;
        }
    }

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
                String[] stringHands = line.split(",|\\|");
                System.out.println(Arrays.toString(stringHands));
                detectHands(stringHands);
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
        System.out.println("Two pairs: " + twoPair);
        System.out.println("Pairs: " + pair);
        System.out.println("High cards: " + high);

    }
}