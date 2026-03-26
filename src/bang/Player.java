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

    /**
     * Returns true if this player has at least one BANG card in their hand.
     *
     * TODO: Loop through hand. If any card has type BANG, return true.
     *       If you finish the loop without finding one, return false.
     */
    public boolean hasBang() {
        // TODO: loop through hand, return true if any card is BANG
        return false;
    }

    public Card playBang() {
        // TODO: find a BANG card, remove it from hand, and return it
        return null;
    }

    public void takeDamage() {
        // TODO: reduce health by 1 (don't let it go below 0)
    }

    public boolean isEliminated() {
        // TODO: return true if health is 0 or less
        return false;
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
