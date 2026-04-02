package bang;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Represents the deck of cards.
 *
 * MILESTONE 1 TASKS:
 *   1. Fill in buildDeck() so the deck has some BANG and MISSED cards
 *   2. Fill in draw() so it removes and returns the top card
 *   3. Run Main.java and confirm cards are printing correctly
 */
public class Deck {

    private ArrayList<Card> drawPile;

    public Deck() {
        drawPile = new ArrayList<>();
        buildDeck();
        Collections.shuffle(drawPile);
    }

    /**
     * Adds cards to the draw pile.
     * <p>
     * TODO: Add 10 BANG cards and 6 MISSED cards to drawPile.
     */
    public void buildDeck() {
        for (int i = 0; i < 10; i++) {
            Card card = new Card("Bang");
            drawPile.add(card);
        }
        for (int i = 0; i < 6; i++) {
            Card card = new Card("Missed");
            drawPile.add(card);
        }
    }

    /**
     * Removes the top card from the draw pile and returns it.
     * <p>
     * Hint: ArrayList has a remove(index) method that removes AND returns the item
     */
    public Card draw() {
        // TODO
        return drawPile.remove(0);
    }

    /**
     * How many cards are left in the deck?
     * Already done for you — useful for testing.
     */
    public int size() {
        return drawPile.size();
    }
}