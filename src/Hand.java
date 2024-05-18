import java.util.Collections;
import java.util.Stack;

public class Hand {
    private Stack<Card> cards = new Stack<Card>();

    public Hand() {
        super();
    }

    public void Shuffle() {
        Collections.shuffle(this.cards);
    }

    public boolean IsEmpty() {
        return this.cards.size() == 0;
    }

    public int RemainingCardCount() {
        return this.cards.size();
    }

    public Card RemoveCard() {
        return this.cards.pop();
    }

    public void AddCard(Card card) {
        this.cards.push(card);
    }

    public void AddCardToBottom(Card card) {
        var tempStack = new Stack<Card>();

        while(!cards.empty()) {
            tempStack.add(cards.pop());
        }
        tempStack.add(card);

        while(!tempStack.empty()) {
            cards.add(tempStack.pop());
        }
    }
}