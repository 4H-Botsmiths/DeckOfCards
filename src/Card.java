public class Card {
    private final Rank rank;
    public Rank getRank() {
        return this.rank;
    }

    private final Suit suit;
    public Suit getSuit() {
        return this.suit;
    }

    public Card(Rank rank, Suit suit) {
        super();
        this.rank = rank;
        this.suit = suit;
    }
    public String toString() {
        return this.rank + " of " + this.suit;
    }
}