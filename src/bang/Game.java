package bang;

import java.util.Scanner;

/**
 * Controls the game: setup, turn loop, and win condition.
 *
 * MILESTONE 3 TASKS:
 *   1. Fill in dealStartingHands() — give each player cards from the deck
 *   2. Fill in takeTurn()          — draw 2 cards, play a Bang! if possible
 *   3. Fill in the game loop in start() — alternate turns until someone wins
 *
 * NOTE: In this milestone, Bang! always hits. There is no Missed! response yet.
 *       That comes in milestone 4.
 */
public class Game {

    private Player player1;
    private Player player2;
    private Deck deck;
    private Scanner scanner;

    public Game(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
        deck = new Deck();
        scanner = new Scanner(System.in);
    }

    // -------------------------------------------------------------------------
    // MILESTONE 3 — TASK 1
    // -------------------------------------------------------------------------

    /**
     * Deals starting cards to both players.
     * Each player should start with STARTING_HEALTH cards.
     * <p>
     * TODO: use a loop to draw cards from the deck and add them to each player.
     * Hint: Player.STARTING_HEALTH tells you how many cards to deal.
     */

    public void dealStartingHands() {
        // TODO
        drawCards(player1, Player.STARTING_HEALTH);
        drawCards(player2, Player.STARTING_HEALTH);
        player1.printHand();
        player2.printHand();
    }

    // -------------------------------------------------------------------------
    // MILESTONE 3 — TASK 2
    // -------------------------------------------------------------------------

    /**
     * Runs one full turn for 'current' player, shooting at 'opponent'.
     * <p>
     * A turn in this milestone:
     * 1. Print whose turn it is and show both players' status
     * 2. Draw 2 cards from the deck
     * 3. If the player has a Bang!, ask if they want to shoot
     * 4. If yes — play the Bang!, opponent takes damage, print what happened
     * 5. If no Bang! (or they pass) — print that they pass
     * <p>
     * TODO: implement the steps above using the helper methods below.
     * Hint: use scanner.nextLine() to read input, and check if it equals "y"
     */
    private void takeTurn(Player current, Player opponent) {
        System.out.println("\n--- " + current.getName() + "'s turn ---");

        // TODO: step 1 — print status of both players (use printStatus())
        player1.printStatus();
        player2.printStatus();
        // TODO: step 2 — draw 2 cards for current player

        // TODO: step 3 — if current.hasBang(), ask "Play a Bang? (y/n)"
        // TODO: step 4 — if yes, play the Bang! and opponent takes damage
        // TODO: step 5 — if no Bang! or they pass, print that they pass
    }

    // -------------------------------------------------------------------------
    // MILESTONE 3 — TASK 3
    // -------------------------------------------------------------------------

    /**
     * Starts and runs the game.
     * <p>
     * TODO:
     *   1. Call dealStartingHands()
     *   2. Print "Game start!" and both players' status
     *   3. Loop, alternating turns between player1 and player2,
     *      until one player is eliminated
     *   4. Print who won
     * <p>
     * Hint for alternating turns: keep a variable for 'current' and 'opponent'
     * and swap them at the end of each loop iteration.
     */
    public void start() {
        dealStartingHands();
        System.out.println("=== Game Start! ===");

        // TODO: game loop — alternate turns until someone is eliminated

        // TODO: print the winner
    }

    // -------------------------------------------------------------------------
    // Helper — already done for you
    // -------------------------------------------------------------------------

    /**
     * Draws a number of cards from the deck and adds them to a player's hand.
     * You can call this from dealStartingHands() and takeTurn().
     */
    private void drawCards(Player player, int count) {
        //go to player hand and add the amount of cards to the hand
        for (int i = 0; i < count; i++) {
            player.addCard(deck.draw());
        }
    }
}
