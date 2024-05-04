import java.util.Collections;
import java.util.Stack;

public class Deck {
    private Stack<Card> _cards = new Stack<Card>();

    public Deck() {
        super();
        BuildDeck();
    }

    public boolean IsEmpty() {
        return _cards.size() == 0;
    }

    public int RemainingCardCount() {
        return _cards.size();
    }

    private void BuildDeck() {
        for(Suit suit : Suit.values()) {
            for(Rank rank : Rank.values()) {
                _cards.push(new Card(rank, suit));
            }
        }
    }

    public void Shuffle() {
        Collections.shuffle(_cards);
    }

    public Card TakeCard() {
        return _cards.pop();
    }
}