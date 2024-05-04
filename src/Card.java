public class Card {
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        super();
        this.rank = rank;
        this.suit = suit;
    }
    public String toString() {
        return this.rank + " of " + this.suit;
    }
}