package bang;

/**
 * Run this to test your work at each milestone.
 *
 * Work through the steps one at a time. Don't move to the next
 * step until the current one prints what you expect.
 */
public class Main {

    public static void main(String[] args) {

        // ----------------------------------------------------------------
        // MILESTONE 1: Build the deck and draw some cards
        // ----------------------------------------------------------------

        Deck deck = new Deck();

        // TODO (step 1a): Print how many cards are in the deck before drawing
        //   Expected: "Deck size: 16"
        System.out.println("Deck size:" + deck.size());
        // TODO (step 1b): Draw 3 cards and print each one
        //   Expected: three lines each showing BANG or MISSED
        for(int i = 0; i < 3; i++){
            System.out.println(deck.draw());
        }
        // TODO (step 1c): Print the deck size again after drawing
        //   Expected: "Deck size: 13"
        System.out.println("Deck size: " + deck.size());

        // ----------------------------------------------------------------
        // MILESTONE 2: Create players and deal them cards
        // ----------------------------------------------------------------

        // TODO (step 2a): Create two players (give them names)
        Player Zuko = new Player("Zuko");
        Player Iroh = new Player("Iroh");
        // TODO (step 2b): Deal 4 cards from the deck to each player
        //   Hint: use a loop that calls deck.draw() and player.addCard()
        for(int i = 0; i < 4; i++){
            Zuko.addCard(deck.draw());
        }
        for(int i = 0; i < 4; i++){
            Iroh.addCard(deck.draw());
        }
        // TODO (step 2c): Call printHand() on each player
        //   Expected: each player's name and their 4 cards
        Zuko.printHand();
        Iroh.printHand();
        // TODO (step 2d): Print the deck size one more time
        //   Expected: "Deck size: 5 (16 - 3 drawn earlier - 4 - 4)
        System.out.println("Deck size: " + deck.size());
        Game game = new Game("zukomen", "irohmen");
        game.dealStartingHands();
    }
}
