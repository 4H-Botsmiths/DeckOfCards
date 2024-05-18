public class Card {
    private Rank _rank;
    private Suit _suit;

    public Card(Rank rank, Suit suit) {
        super();
         _rank = rank;
         _suit = suit;
    }
    public String toString() {
        return this._suit + "-" + this._rank;
    }
}
