import java.util.HashMap;
import java.util.Map;

public class Card {
    private final String suit;
    private final int value;
    private final String rank;

    public Card(String suit, String rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", value=" + value +
                ", rank='" + rank + '\'' +
                '}';
    }
}
