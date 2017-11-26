package daniel.stanciu.highcardwins.gameplay;

import daniel.stanciu.highcardwins.cards.Card;
import daniel.stanciu.highcardwins.cards.Deck;

public class Game {
    private Deck deck;
    private Player p1;
    private Card p1Cards[] = new Card[26];
    private Player cpu;
    private Card cpuCards[] = new Card[26];
    private int countP1;
    private int countCPU;
    private int playerScore;
    private int cpuScore;

    public Game() {
        playerScore = 0;
        cpuScore = 0;
        deck = new Deck();
        deck.shuffle();

        for(int i = 0; i < 26; i++) {
            p1Cards[i] = deck.deal();
            cpuCards[i] = deck.deal();
        }

        p1 = new Player(p1Cards);

        cpu = new Player(cpuCards);
    }

    public Card getP1Card() {
        return p1Cards[countP1];
    }

    public Card getCpuCard() {
        return cpuCards[countCPU];
    }

    public void awardPoint() {
        if(getP1Card().getValue() > getCpuCard().getValue()) {
            playerScore += 1;
        }
        if(getP1Card().getValue() < getCpuCard().getValue()){
            cpuScore += 1;
        }
        countP1++;
        countCPU++;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public int getCpuScore() {
        return cpuScore;
    }
}
