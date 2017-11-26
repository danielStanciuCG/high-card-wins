package daniel.stanciu.highcardwins.cards;

import javax.swing.*;

public class Card implements CardFeatures {
    private String name;
    private int value;
    private ImageIcon cardFace;

    public Card(int value, String suit) {
        this.value = value;

        if(value < 2 || value > 15 || value == 11)
            throw new IllegalArgumentException("A card can have a value between 2 and 15, with the exception of 11");

        if(!suit.equals(CLUBS) && !suit.equals(DIAMONDS) && !suit.equals(HEARTS) && !suit.equals(SPADES))
            throw new IllegalArgumentException("A card can have one of the following suits: Clubs, Diamonds, Hearts or Spades");


        /*SET CARD NAME*/

        //Clubs
        if(suit.equals("Clubs")) {
            switch(value) {
                case 2:
                    name = "Deuce Of Clubs";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/2_of_clubs.jpg"));
                    break;
                case 3:
                    name = "Three Of Clubs";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/3_of_clubs.jpg"));
                    break;
                case 4:
                    name = "Four Of Clubs";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/4_of_clubs.jpg"));
                    break;
                case 5:
                    name = "Five Of Clubs";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/5_of_clubs.jpg"));
                    break;
                case 6:
                    name = "Six Of Clubs";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/6_of_clubs.jpg"));
                    break;
                case 7:
                    name = "Seven Of Clubs";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/7_of_clubs.jpg"));
                    break;
                case 8:
                    name = "Eight Of Clubs";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/8_of_clubs.jpg"));
                    break;
                case 9:
                    name = "Nine Of Clubs";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/9_of_clubs.jpg"));
                    break;
                case 10:
                    name = "Ten Of Clubs";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/10_of_clubs.jpg"));
                    break;
                case 12:
                    name = "Jack Of Clubs";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/jack_of_clubs.jpg"));
                    break;
                case 13:
                    name = "Queen Of Clubs";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/queen_of_clubs.jpg"));
                    break;
                case 14:
                    name = "King Of Clubs";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/king_of_clubs.jpg"));
                    break;
                case 15:
                    name = "Ace Of Clubs";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/ace_of_clubs.jpg"));
                    break;
            }
        }

        //Diamonds
        if(suit.equals("Diamonds")) {
            switch(value) {
                case 2:
                    name = "Deuce Of Diamonds";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/2_of_diamonds.jpg"));
                    break;
                case 3:
                    name = "Three Of Diamonds";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/3_of_diamonds.jpg"));
                    break;
                case 4:
                    name = "Four Of Diamonds";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/4_of_diamonds.jpg"));
                    break;
                case 5:
                    name = "Five Of Diamonds";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/5_of_diamonds.jpg"));
                    break;
                case 6:
                    name = "Six Of Diamonds";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/6_of_diamonds.jpg"));
                    break;
                case 7:
                    name = "Seven Of Diamonds";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/7_of_diamonds.jpg"));
                    break;
                case 8:
                    name = "Eight Of Diamonds";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/8_of_diamonds.jpg"));
                    break;
                case 9:
                    name = "Nine Of Diamonds";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/9_of_diamonds.jpg"));
                    break;
                case 10:
                    name = "Ten Of Diamonds";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/10_of_diamonds.jpg"));
                    break;
                case 12:
                    name = "Jack Of Diamonds";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/jack_of_diamonds.jpg"));
                    break;
                case 13:
                    name = "Queen Of Diamonds";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/queen_of_diamonds.jpg"));
                    break;
                case 14:
                    name = "King Of Diamonds";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/king_of_diamonds.jpg"));
                    break;
                case 15:
                    name = "Ace Of Diamonds";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/ace_of_diamonds.jpg"));
                    break;
            }
        }

        //Hearts
        if(suit.equals("Hearts")) {
            switch(value) {
                case 2:
                    name = "Deuce Of Hearts";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/2_of_hearts.jpg"));
                    break;
                case 3:
                    name = "Three Of Hearts";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/3_of_hearts.jpg"));
                    break;
                case 4:
                    name = "Four Of Hearts";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/4_of_hearts.jpg"));
                    break;
                case 5:
                    name = "Five Of Hearts";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/5_of_hearts.jpg"));
                    break;
                case 6:
                    name = "Six Of Hearts";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/6_of_hearts.jpg"));
                    break;
                case 7:
                    name = "Seven Of Hearts";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/7_of_hearts.jpg"));
                    break;
                case 8:
                    name = "Eight Of Hearts";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/8_of_hearts.jpg"));
                    break;
                case 9:
                    name = "Nine Of Hearts";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/9_of_hearts.jpg"));
                    break;
                case 10:
                    name = "Ten Of Hearts";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/10_of_hearts.jpg"));
                    break;
                case 12:
                    name = "Jack Of Hearts";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/jack_of_hearts.jpg"));
                    break;
                case 13:
                    name = "Queen Of Hearts";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/queen_of_hearts.jpg"));
                    break;
                case 14:
                    name = "King Of Hearts";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/king_of_hearts.jpg"));
                    break;
                case 15:
                    name = "Ace Of Hearts";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/ace_of_hearts.jpg"));
                    break;
            }
        }

        //Spades
        if(suit.equals("Spades")) {
            switch(value) {
                case 2:
                    name = "Deuce Of Spades";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/2_of_spades.jpg"));
                    break;
                case 3:
                    name = "Three Of Spades";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/3_of_spades.jpg"));
                    break;
                case 4:
                    name = "Four Of Spades";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/4_of_spades.jpg"));
                    break;
                case 5:
                    name = "Five Of Spades";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/5_of_spades.jpg"));
                    break;
                case 6:
                    name = "Six Of Spades";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/6_of_spades.jpg"));
                    break;
                case 7:
                    name = "Seven Of Spades";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/7_of_spades.jpg"));
                    break;
                case 8:
                    name = "Eight Of Spades";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/8_of_spades.jpg"));
                    break;
                case 9:
                    name = "Nine Of Spades";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/9_of_spades.jpg"));
                    break;
                case 10:
                    name = "Ten Of Spades";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/10_of_spades.jpg"));
                    break;
                case 12:
                    name = "Jack Of Spades";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/jack_of_spades.jpg"));
                    break;
                case 13:
                    name = "Queen Of Spades";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/queen_of_spades.jpg"));
                    break;
                case 14:
                    name = "King Of Spades";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/king_of_spades.jpg"));
                    break;
                case 15:
                    name = "Ace Of Spades";
                    cardFace = new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/ace_of_spades.jpg"));
                    break;
            }
        }

    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public ImageIcon getCardFace() {
        return cardFace;
    }
}
