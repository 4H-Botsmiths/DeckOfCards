import java.util.Collections;
import java.util.Stack;

public class Deck {
    private Stack<Card> cards = new Stack<Card>(); 

    public Deck() {
        BuildDeck();
        Shuffle();
    
    }
    private void BuildDeck() {
        for(Suit suit : Suit.values()) {
            for(Rank rank: Rank.values()) {
                this.cards.push(new Card(rank, suit));
            }
        }
    }

    public void Shuffle() {
        Collections.shuffle(cards);
    }

    public boolean IsEmpty(){
        return this.cards.size() == 0;
    }

    public int RemainingCardCount(){
        return this.cards.size();
    }

    public Card TakeCard(){
        return this.cards.pop();
    }
}
