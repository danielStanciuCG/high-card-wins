package daniel.stanciu.highcardwins.gameplay;

import daniel.stanciu.highcardwins.cards.Card;

public class Player {
    private Card[] cards;

    public Player (Card[] cards) {
        this.cards = cards;
    }

    public Card[] getCards() {
        return cards;
    }
}
