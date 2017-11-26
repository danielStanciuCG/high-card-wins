package daniel.stanciu.highcardwins.cards;

import javax.swing.*;

public interface CardFeatures {
    //CARD NAMES
    public static final String[] NAMES = {
            "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"
    };

    /**
     * VALUES
     */
    public final static int DEUCE = 2;
    public final static int THREE = 3;
    public final static int FOUR = 4;
    public final static int FIVE = 5;
    public final static int SIX = 6;
    public final static int SEVEN = 7;
    public final static int EIGHT = 8;
    public final static int NINE = 9;
    public final static int TEN = 10;
    public final static int JACK = 12;
    public final static int QUEEN = 13;
    public final static int KING = 14;
    public final static int ACE = 15;

    /**
     * SUITS
     */
    public final static String CLUBS = "Clubs";
    public final static String DIAMONDS = "Diamonds";
    public final static String HEARTS = "Hearts";
    public final static String SPADES = "Spades";

    /**
     * CARD BACK IMAGE
     */
}
