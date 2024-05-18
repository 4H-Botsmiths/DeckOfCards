import java.util.Stack;

public class Hand {
  private Stack<Card> cards = new Stack<Card>();

  public void addCard(Card card) {
    cards.insertElementAt(card, 0);
  }

  public Card takeCard() {
    return cards.pop();
  }

  public boolean isEmpty() {
    return cards.isEmpty();
  }

  public int remainingCards() {
    return cards.size();
  }
}
