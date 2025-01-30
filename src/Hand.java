public class Hand {

    double handScore;

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
            return 7;
        }
        if(four){
            return 6;
        }
        if(three){
            return 5;
        }
        if(full){
            return 4;
        }
        if(one){
            return 3;
        }
        if(two){
            return 2;
        }
        if(isHigh){
            return 1;
        }
        else
        {
            return 0; //something is fucked if it does this
        }
    }

    public void handProcessing(String[] hand)
    {
        if (detectHands(hand) == 7)
        {
            handScore = 1000000.0000000000;
        }
        else if (detectHands(hand) == 6)
        {
            handScore = 100000.0000000000;
        }
        else if (detectHands(hand) == 5)
        {
            handScore = 10000.0000000000;
        }
        else if (detectHands(hand) == 4)
        {
            handScore = 1000.0000000000;
        }
        else if (detectHands(hand) == 3)
        {
            handScore = 100.0000000000;
        }
        else if (detectHands(hand) == 2)
        {
            handScore = 10.0000000000;
        }
        else if (detectHands(hand) == 1)
        {
            handScore = 1.0000000000;
        }

        switch (hand[0])
        {
            case "Ace":
                handScore += 0.13;
                break;
            case "King":
                handScore += 0.12;
                break;
            case "Queen":
                handScore += 0.11;
                break;
            case "Jack":
                handScore += 0.1;
                break;
            case "10":
                handScore += 0.09;
                break;
            case "9":
                handScore += 0.08;
                break;
            case "8":
                handScore += 0.07;
                break;
            case "7":
                handScore += .06;
                break;
            case "6":
                handScore += 0.05;
                break;
            case "5":
                handScore += 0.04;
                break;
            case "4":
                handScore += 0.03;
                break;
            case "3":
                handScore += 0.02;
                break;
            case "2":
                handScore += 0.01;
                break;

        }
        switch (hand[1])
        {
            case "Ace":
                handScore += 0.0013;
                break;
            case "King":
                handScore += 0.0012;
                break;
            case "Queen":
                handScore += 0.0011;
                break;
            case "Jack":
                handScore += 0.001;
                break;
            case "10":
                handScore += 0.0009;
                break;
            case "9":
                handScore += 0.0008;
                break;
            case "8":
                handScore += 0.0007;
                break;
            case "7":
                handScore += .0006;
                break;
            case "6":
                handScore += 0.0005;
                break;
            case "5":
                handScore += 0.0004;
                break;
            case "4":
                handScore += 0.0003;
                break;
            case "3":
                handScore += 0.0002;
                break;
            case "2":
                handScore += 0.0001;
                break;

        }

        //sort by comparing score values
    }

}
