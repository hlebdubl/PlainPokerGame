public class Hand {

    double handScore;

    public void handProcessing()
    {
        //if (hand == 5 of a kind)
        {
            handScore = 1000000.0000000000;
        }
        //else if (hand == full house)
        {
            handScore = 100000.0000000000;
        }
        // else if (hand == 4 of a kind)
        {
            handScore = 10000.0000000000;
        }
        //else if (hand == 3 of a kind)
        {
            handScore = 1000.0000000000;
        }
        //else if (hand == 2pair)
        {
            handScore = 100.0000000000;
        }
        //else if (hand == pair)
        {
            handScore = 10.0000000000;
        }
        //else if (hand == hicard)
        {
            handScore = 1.0000000000;
        }

        //switch (first card)
        //case ace:
        //handscore += 0.13
        //...

        //switch (second card)
        //case ace:
        //handscore += 0.0013
        //...

        //...

        //sort by comparing score values
    }

}
