package bang;

/**
 * Represents a single card in the game.
 *
 * A CardType is an enum — a fixed set of named constants.
 * Think of it like a variable that can only be one of a few specific values.
 */
public class Card {

    private String type;

    public Card(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type.toString();
    }
}
