package bang;

/**
 * Represents a single card in the game.
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
