public class App {
    public static void main(String[] args) throws Exception {
                var deck = new Deck();
        
                System.out.println(deck.RemainingCardCount() + " cards in this deck");
        
                var hand1 = new Hand();
                var hand2 = new Hand();
        
                while(!deck.IsEmpty()) {
                    hand1.addCard(deck.TakeCard());
                    hand2.addCard(deck.TakeCard());
                }
        
                System.out.println(deck.RemainingCardCount() + " cards in this deck");
                System.out.println(hand1.remainingCards() + " cards in first hand");
                System.out.println(hand2.remainingCards() + " cards in second hand");
    }
}
