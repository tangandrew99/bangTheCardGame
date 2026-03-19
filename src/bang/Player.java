package bang;

import java.util.ArrayList;

/**
 * Represents one player in the game.
 *
 * MILESTONE 2 TASKS:
 *   1. Fill in addCard() so cards can be added to the hand
 *   2. Fill in printHand() so we can see what a player is holding
 *   3. Update Main.java to deal cards to two players and print their hands
 */
public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    /**
     * Adds a card to this player's hand.
     *
     * TODO: add the card to hand
     */
    public void addCard(Card card) {
        // TODO
    }

    /**
     * Prints this player's name and all the cards in their hand.
     *
     * TODO: print something like: Alice's hand: [BANG, MISSED, BANG]
     */
    public void printHand() {
        // TODO
    }

    // TODO
    public String getName() {
        return "WRONG ANSWER";
    }

    // TODO
    public ArrayList<Card> getHand() {
        return new ArrayList<>();
    }
}
