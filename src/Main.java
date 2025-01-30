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

    public static void detectHands(String[] hand)
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
        for (int similarity : similarities) {
            if (similarity == 4) {
                five = true;
            }
            else if (similarity == 3) {
                four = true;
            }
            else if (similarity == 2) {
                if (similarity == 1) {
                    full = true;
                } else {
                    three = true;
            }
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
        }
        if(four){
            fourKind++;
        }
        if(three){
            threeKind++;
        }
        if(full){
            fullHouse++;
        }
        if(one){
            pair++;
        }
        if(two){
            twoPair++;
        }
        if(isHigh){
            high++;
        }


//        System.out.println(indexZeroSimilarities);
//        System.out.println(indexOneSimilarities);
//        System.out.println(indexTwoSimilarities);
//        System.out.println(indexThreeSimilarities);
//        System.out.println(indexFourSimilarities);
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


        System.out.println(fiveKind);
        System.out.println(fullHouse);
        System.out.println(fourKind);
        System.out.println(threeKind);
        System.out.println(twoPair);
        System.out.println(pair);
        System.out.println(high);

    }
}