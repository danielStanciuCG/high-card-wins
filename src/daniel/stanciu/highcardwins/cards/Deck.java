package daniel.stanciu.highcardwins.cards;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Deck {
    private List<Card> fullDeck = new ArrayList<>(52);
    private int count = 0;

    public Deck() {
        int clubsIndex = 0;
        int diamondsIndex = 0;
        int heartsIndex = 0;
        int spadesIndex = 0;

        //CLUBS
        List<Card> clubs = new ArrayList<>(13);
        for(int c = 2; c <= 15; c++) {
            if(c == 11)
                continue;
            clubs.add(clubsIndex++, new Card(c, CardFeatures.CLUBS));
        }

        //DIAMONDS
        List<Card> diamonds = new ArrayList<>(13);
        for(int c = 2; c <= 15; c++) {
            if(c == 11)
                continue;
            diamonds.add(diamondsIndex++, new Card(c, CardFeatures.DIAMONDS));
        }

        //HEARTS
        List<Card> hearts = new ArrayList<>(13);
        for(int c = 2; c <= 15; c++) {
            if(c == 11)
                continue;
            hearts.add(heartsIndex++, new Card(c, CardFeatures.HEARTS));
        }

        //SPADES
        List<Card> spades = new ArrayList<>(13);
        for(int c = 2; c <= 15; c++) {
            if(c == 11)
                continue;
            spades.add(spadesIndex++, new Card(c, CardFeatures.SPADES));
        }

        //FORMING FULL DECK
        fullDeck.addAll(clubs);
        fullDeck.addAll(diamonds);
        fullDeck.addAll(hearts);
        fullDeck.addAll(spades);
    }

    public void shuffle() {
        count = 0;
        Collections.shuffle(fullDeck);
    }

    public Card deal() {
        return fullDeck.get(count++);
    }
}
