public class Hand {

    double handScore;
    int rank;

    public void handProcessing(String[] hand)
    {
        int currentHand = Main.detectHands(hand);

        if (currentHand == 7)
        {
            handScore = 1000000.0000000000;
        }
        else if (currentHand == 6)
        {
            handScore = 100000.0000000000;
        }
        else if (currentHand == 5)
        {
            handScore = 10000.0000000000;
        }
        else if (currentHand == 4)
        {
            handScore = 1000.0000000000;
        }
        else if (currentHand == 3)
        {
            handScore = 100.0000000000;
        }
        else if (currentHand == 2)
        {
            handScore = 10.0000000000;
        }
        else if (currentHand == 1)
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
                handScore += 0.06;
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
                handScore += 0.0006;
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
        switch (hand[2])
        {
            case "Ace":
                handScore += 0.000013;
                break;
            case "King":
                handScore += 0.000012;
                break;
            case "Queen":
                handScore += 0.000011;
                break;
            case "Jack":
                handScore += 0.00001;
                break;
            case "10":
                handScore += 0.000009;
                break;
            case "9":
                handScore += 0.000008;
                break;
            case "8":
                handScore += 0.000007;
                break;
            case "7":
                handScore += 0.000006;
                break;
            case "6":
                handScore += 0.000005;
                break;
            case "5":
                handScore += 0.000004;
                break;
            case "4":
                handScore += 0.000003;
                break;
            case "3":
                handScore += 0.000002;
                break;
            case "2":
                handScore += 0.000001;
                break;

        }
        switch (hand[3])
        {
            case "Ace":
                handScore += 0.00000013;
                break;
            case "King":
                handScore += 0.00000012;
                break;
            case "Queen":
                handScore += 0.00000011;
                break;
            case "Jack":
                handScore += 0.0000001;
                break;
            case "10":
                handScore += 0.00000009;
                break;
            case "9":
                handScore += 0.00000008;
                break;
            case "8":
                handScore += 0.00000007;
                break;
            case "7":
                handScore += 0.00000006;
                break;
            case "6":
                handScore += 0.00000005;
                break;
            case "5":
                handScore += 0.00000004;
                break;
            case "4":
                handScore += 0.00000003;
                break;
            case "3":
                handScore += 0.00000002;
                break;
            case "2":
                handScore += 0.00000001;
                break;

        }
        switch (hand[4])
        {
            case "Ace":
                handScore += 0.0000000013;
                break;
            case "King":
                handScore += 0.0000000012;
                break;
            case "Queen":
                handScore += 0.0000000011;
                break;
            case "Jack":
                handScore += 0.000000001;
                break;
            case "10":
                handScore += 0.0000000009;
                break;
            case "9":
                handScore += 0.0000000008;
                break;
            case "8":
                handScore += 0.0000000007;
                break;
            case "7":
                handScore += 0.0000000006;
                break;
            case "6":
                handScore += 0.0000000005;
                break;
            case "5":
                handScore += 0.0000000004;
                break;
            case "4":
                handScore += 0.0000000003;
                break;
            case "3":
                handScore += 0.0000000002;
                break;
            case "2":
                handScore += 0.0000000001;
                break;

        }
        //sort by comparing score values
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
