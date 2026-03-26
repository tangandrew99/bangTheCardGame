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
     *
     * TODO: Add 10 BANG cards and 6 MISSED cards to drawPile.
     */
    private void buildDeck() {
        for(int i = 0; i < 10; i++){
            Card BANG = new Card("BANG");
            drawPile.add(BANG);
        }
        for(int j = 0; j < 6; j++){
            Card Missed = new Card("Missed");
            drawPile.add(Missed);
        }
    }

    /**
     * Removes the top card from the draw pile and returns it.
     *
     * Hint: ArrayList has a remove(index) method that removes AND returns the item
     */
    public Card draw() {
//        Card diswon = drawPile.remove(0);
//        return diswon;
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
