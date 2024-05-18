import java.util.Stack;

public class Hand {
  private Stack<Card> cards;

  public void addCard(Card card) {
    cards.push(card);
  }

  public void addCards(Stack<Card> cards) {
    this.cards.addAll(cards);
  }

  public Card takeCard() {
    return cards.pop();
  }

  public boolean isEmpty() {
    return cards.isEmpty();
  }

  public int remainngCards() {
    return cards.size();
  }
}
