public class Hand {

    double handScore;
    int rank;
    int bid;
    private String[] cards = new String[5];

    public Hand (String[] hand)
    {
        bid = Integer.parseInt(hand[hand.length -1]);
        cards[0] = hand[0];
        cards[1] = hand[1];
        cards[2] = hand[2];
        cards[3] = hand[3];
        cards[4] = hand[4];

        int currentHand = detectHands();

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

        switch (cards[0])
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
        switch (cards[1])
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
        switch (cards[2])
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
        switch (cards[3])
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
        switch (cards[4])
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
    }

    public int detectHands()
    {
        int[] similarities = new int[5];

        for(int i = 0; i < 5; i++)
        {
            if (cards[0].equals(cards[i]))
            {
                similarities[0]++;
            }
        }
        similarities[0]--;

        for(int i = 0; i < 5; i++)
        {
            if (cards[1].equals(cards[i]))
            {
                similarities[1]++;
            }
        }
        similarities[1]--;

        for(int i = 0; i < 5; i++)
        {
            if (cards[2].equals(cards[i]))
            {
                similarities[2]++;
            }
        }
        similarities[2]--;

        for(int i = 0; i < 5; i++)
        {
            if (cards[3].equals(cards[i]))
            {
                similarities[3]++;
            }
        }
        similarities[3]--;

        for(int i = 0; i < 5; i++)
        {
            if (cards[4].equals(cards[i]))
            {
                similarities[4]++;
            }
        }
        similarities[4]--;

        int count = 0;
        for (int similarity : similarities)
        {
            if (similarity == 1)
            {
                count++;
            }
        }

        boolean hasThree = false;
        boolean hasTwo = false;

        for (int similarity : similarities)
        {
            if (similarity == 2)
            {
                hasThree = true;
            }
            if (similarity == 1)
            {
                hasTwo = true;
            }
        }

        for (int similarity : similarities) {

            if (similarity == 4)
            {
                return 7; //5 kind
            }
            else if (similarity == 3)
            {
                return 6; //4 kind
            }

            if (hasTwo && hasThree)
            {
                return 5; //full
            }
            else if (hasThree)
            {
                return 4; //3 kind
            }
            else if (count > 2)
            {
                return 3; //2 pair
            }
            else if (hasTwo)
            {
                return 2; //pair
            }
            else
            {
                return 1; //high
            }
        }
        return 0; //shouldn't happen
    }

    public static Hand[] sortHandList(Hand[] handList)
    {
        for (int i = 0; i < handList.length; i++) //sorting array
        {
            if (!(i == handList.length - 1))
            {
                if (handList[i].getHandScore() < handList[i + 1].getHandScore())
                {
                    Hand tempH = handList[i];
                    handList[i] = handList[i + 1];
                    handList[i + 1] = tempH;
                    i = -1;
                }
            }
        }
        return handList;
    }

    public String[] getCards() {
        return cards;
    }

    public int getBid() {
        return bid;
    }

    public double getHandScore() {
        return handScore;
    }
}
